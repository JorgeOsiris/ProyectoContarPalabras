package proyecto4_3;
import java.lang.reflect.Array;
import java.util.Scanner;

public class InicioApp2 {

	int [] contador;
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	final String TEXTO_LETRAS= "Las letras que se repiten son:";
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
	final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public InicioApp2(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}

	
	int contarCaracteresTotal(String cadena) {
		int contador = 0;
		for(int i = 0; i<cadena.length();i++) {
			char car = cadena.charAt(i);
					if (car != ' ') contador++;	
		}
		return contador;
	}
	int contarNumeroPalabras(String cadena) {
		int contadorP = 0;
		char car2 = ' ';
		for(int i = 0; i<cadena.length();i++) {
			char car = cadena.charAt(i);
			if (car == ' ' && car2!=' ') {contadorP++;
			}
			
	}return contadorP;}
	int[ ] contarTodosCaracteres(String cadena) {
		for (int i = 0;i<cadena.length();i++){ 
			char car = cadena.charAt(i); 
			int ascii = car; 
			contador[ascii]++; 
			letras[ascii] = car;
		} return contador ;
	}
	
	String textoCaracteresTotal (int total) {
		return"El total de los caracteres son: "+total;
	
	}
	String textoNumeroPalabras (int total) {
		return "El total de las palabras son:"+total; 
	}
	
	
	

		
	
	
	
	
	public static void main(String[] args) {
		InicioApp2 ia = new InicioApp2();

		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		
		int contadorCaracteresTotal = ia.contarCaracteresTotal(cadena);
		int ContadorPalabras = ia.contarNumeroPalabras(cadena);
		int[] contadorCaracteres = new int [65536];
		ia.contarTodosCaracteres(cadena);
		System.out.print(ia.textoCaracteresTotal(contadorCaracteresTotal));
		System.out.print(ia.textoNumeroPalabras(ContadorPalabras));
	//	System.out.print(ia.textoTodosCaracteres));

		
		
	}
	
	/*String textoTodosCaracteres (int [] array) {
		String resultado = "";
		for(int i=0 ; i<array.length;i++) {
			if(array[i]!=0)
				resultado+=" la letra : "+(char)i+ " se repite :" +array[i]+" veces\n"; 
		}return resultado;
	}*/
		

}
