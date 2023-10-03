package myExtrangeCalculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aaaa {

	public static void main(String[] args) {
		
		List<String> tmp = new ArrayList<>();
		
		tmp.add("+4");
		tmp.add("+2");
		tmp.add("-2");
		tmp.add("-2");
		tmp.add("10");
		tmp.add("1");
		tmp.add("-100");
		
		System.out.println(tmp);
		
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
		
		System.out.println(resultado);
		
	
		String prueba = "+10+10-5";
		int tmp1 = 0;
		String op[] = prueba.split("+");
		
		System.out.println(op[0]);

	}

}
