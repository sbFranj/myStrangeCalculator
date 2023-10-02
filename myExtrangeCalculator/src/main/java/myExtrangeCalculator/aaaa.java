package myExtrangeCalculator;

public class aaaa {

	public static void main(String[] args) {
		String a = "1+1++11";
		
		for(int i =1; i<a.length() && a.length()!=0; i++) {
			if(a.charAt(i)=='+') {
				System.out.println("mal");
			}
		}

	}

}
