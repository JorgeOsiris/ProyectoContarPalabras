package proyecto4_3;
import java.lang.reflect.Array;
import java.util.Scanner;

public class InicioApp2 {

	int [] contador;
	char [] letras;
	int palabras;
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public InicioApp2(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}	

	
	int contarNumeroPalabras(String cadena) {
		int contadorP = 0;
		char car2 = ' ';
		for(int i = 0; i<cadena.length();i++) {
			char car = cadena.charAt(i);
			if (car == ' ' && car2!=' ') {contadorP++;
			}			
	}return contadorP;
	}
	

	String textoNumeroPalabras (int contadorP) {
		return "El total de las palabras son:"+contadorP; 
	}
	
	
	public static void main(String[] args) {
		InicioApp2 ia = new InicioApp2();

		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		
		
		int ContadorPalabras = ia.contarNumeroPalabras(cadena);
		int[] contadorCaracteres = new int [65536];
		System.out.print(ia.textoNumeroPalabras(ContadorPalabras));

	}
	

		

}
