package myExtrangeCalculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Calculator {
	
	public static List<String> tmp= new ArrayList<>();
	
	public Calculator() {
		
	}
	
	public static String send(String old, String neww, String op) {
		return old+op+neww;
	}
	

	public static String solve(String area) {
		String message = "";
		boolean invalid = false;
		String numbers = "1234567890+-";
		if(area.length()==0 || area.equals("null")) {
			message="There is nothing to solve";
		}
			for(int i =1; i<area.length() && area.length()!=0 && !invalid; i++) {
				if((area.charAt(i)=='+' && area.charAt(i-1)=='+')||
						(area.charAt(i)=='+' && area.charAt(i-1)=='-')||
						(area.charAt(i)=='-' && area.charAt(i-1)=='+')||
						(area.charAt(i)=='-' && area.charAt(i-1)=='+')) {
					message= area+"You cannot solve 2 signs together";
					invalid=true;
				}else if(numbers.indexOf(area.charAt(i))==-1) {
					message="You can't solve something that isn't numbers";
					invalid=true;
				}else if(area.length()==1 && (area.charAt(i)=='+'||area.charAt(i)=='-')) {
					message="You can't solve the signs";
					invalid=true;
				}
			
		}if(!invalid){
			int resultado = 0;
			Iterator<String> it = tmp.iterator();
			while(it.hasNext()) {
				String t = it.next();
				if(t.startsWith("+")) {
					resultado+=Integer.valueOf(t.substring(1));
				}else if(!t.startsWith("-")&&!t.startsWith("+")){
					resultado+=Integer.valueOf(t);
				}else{
					resultado-=Integer.valueOf(t.substring(1));
				}
				
			}
			message=area+"="+resultado;
		}
		
		return message;
	}
	
	public void add(String n, String op) {
		this.tmp.add(n+op);
	}
	
	public void clear() {
		this.tmp.clear();
	}
	
	public List<String> get() {
		return tmp;
	}
	
	
	
	
	
	
}
