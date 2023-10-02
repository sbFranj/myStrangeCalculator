package myExtrangeCalculator;

public class Calculator {
	
	
	public static String send(String old, String neww) {
		return old+neww;
	}
	
	public static String solve(String area) {
		String message = "There is nothing to solve";
		
		for(int i =1; i<area.length() && area.length()!=0; i++) {
			if((area.charAt(i)=='+' && area.charAt(i-1)=='+')||
					(area.charAt(i)=='+' && area.charAt(i-1)=='-')||
					(area.charAt(i)=='-' && area.charAt(i-1)=='+')||
					(area.charAt(i)=='-' && area.charAt(i-1)=='+')) {
				message= area+" You cannot solve 2 signs together";
			}
		}
		
		return message;
	}
	
	
}
