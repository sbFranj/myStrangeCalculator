package myExtrangeCalculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aaaa {

	public static void main(String[] args) {
		
		List<String> tmp = new ArrayList<>();
		
		String area = "10+10-5+0";
		String t ="";
		System.out.println(tmp);
		for(int i =0; i<area.length();i++) {
			if(area.charAt(i)=='+' || area.charAt(i)=='-') {
				tmp.add(area.charAt(i)+"");
				tmp.add(t);
				t="";
			}else {
				t+=area.charAt(i);
			}
		}
		System.out.println(tmp);
		/*int resultado = 0;
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
		
		System.out.println(resultado);
		
		 */
		

	}

}
