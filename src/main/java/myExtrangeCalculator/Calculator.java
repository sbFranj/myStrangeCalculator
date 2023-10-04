package myExtrangeCalculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Calculator {//clase necesaria para el comportamiento de la calculadora
	
	public static List<String> tmp= new ArrayList<>();
	
	public Calculator() {//para ciertos metodos se necesita que no sean static
		
	}
	
	public static String send(String old, String neww, String op) {//con este metodo añadimos a la cadena los nuevos digitos
		return old+op+neww;
	}
	

	public static String solve(String area) {//con este metodo resolvemos lo que se encuentre en el textarea del index.jsp
		String message = "";//aqui almacenamos el mensaje a mostar
		boolean invalid = false;//boolean a modo de bandera
		String numbers = "1234567890+-";//caracteres y numeros permitidos para intentar acotar los posibles errores
		if(area.length()==0 || area.equals("null")) {//si el string que le pasamos esta vacio o es null entra
			message="There is nothing to solve";//te lanza este mensaje
		}
			for(int i =1; i<area.length() && area.length()!=0 && !invalid; i++) {//recorremos la cadena en busca de posibles errores
				if((area.charAt(i)=='+' && area.charAt(i-1)=='+')||//si haya 2 simbolos juntos lanzaria el mensaje 
						(area.charAt(i)=='+' && area.charAt(i-1)=='-')||
						(area.charAt(i)=='-' && area.charAt(i-1)=='+')||
						(area.charAt(i)=='-' && area.charAt(i-1)=='+')) {
					message= area+"You cannot solve 2 signs together";
					invalid=true;
				}else if(numbers.indexOf(area.charAt(i))==-1) {//si tenemos ausencia de los numeros y caracteres permitidos lanzariamos el mensaje
					message="You can't solve something that isn't numbers";
					invalid=true;
				}else if(area.length()==1 && (area.charAt(i)=='+'||area.charAt(i)=='-')) {//en el caso de que solo aparezca un simbolo lanzaria el mensaje
					message="You can't solve the signs";
					invalid=true;
				}
			
		}if(!invalid){//si no entra en ninguna condicion de arriba entaria aqui a resolver
			int resultado = 0;
			Iterator<String> it = tmp.iterator();
			while(it.hasNext()) {
				String t = it.next();
				if(t.startsWith("+")) {//si empieza por "+" suma el valor
					resultado+=Integer.valueOf(t.substring(1));
				}else if(!t.startsWith("-")&&!t.startsWith("+")){//si no empieza por "+" o "-" sumaria el valor
					resultado+=Integer.valueOf(t);
				}else{//en caso contrario restaria
					resultado-=Integer.valueOf(t.substring(1));
				}
				
			}
			message=area+"="+resultado;//añadiriamos al mensaje el string completo mas el resultado
		}
		
		return message;
	}
	
	public void add(String n, String op) {//para añadir elementos a la lista
		this.tmp.add(n+op);
	}
	
	public void clear() {//limpiar la lista
		this.tmp.clear();
	}
	
	public List<String> get() {//por si necesitamos visualizar la lista
		return tmp;
	}
	
	
	
	
	
	
}
