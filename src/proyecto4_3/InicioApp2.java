package proyecto4_3;
import java.lang.reflect.Array;
import java.util.Scanner;


/* clase InicioApp2
 * @author Jorge Osiris Aguilar Fuertemoreno
 * @version 1.0
 * 
 */



public class InicioApp2 {

	int [] contadorP;
	char [] letras;
	int palabras;
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	
	
	public InicioApp2(String string){
		contadorP = new int[65536];
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
	}return contadorP;/*@return contadorP */
	}
	

	String textoNumeroPalabras (int contadorP) {
		return "El total de las palabras son:"+contadorP; 
	}/*@return texto final  */
	
	
	public static void main(String[] args) {
		InicioApp2 ia = new InicioApp2("Introduzca un conjunto de caracteres:");

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un conjunto de caracteres:");
		String cadena = scan.nextLine();
		
		
		int ContadorPalabras = ia.contarNumeroPalabras(cadena);
		int[] contadorCaracteres = new int [65536];
		System.out.print(ia.textoNumeroPalabras(ContadorPalabras));

	}/*Main en el que preguntamos palabras y operamos     */


	public int[] getContadorP() {
		return contadorP;
	}
	public void setContadorP(int[] contadorP) {
		this.contadorP = contadorP;
	}
	public char[] getLetras() {
		return letras;
	}
	public void setLetras(char[] letras) {
		this.letras = letras;
	}
	public int getPalabras() {
		return palabras;
	}
	public void setPalabras(int palabras) {
		this.palabras = palabras;
	}


	
	

		

}
