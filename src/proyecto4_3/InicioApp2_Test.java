package proyecto4_3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

 class InicioApp2_Test {
	 @Test
	public void test1() {
		
		 InicioApp2 test1 = new InicioApp2("marcos el hijo de la alcaldesa...");
		assertTrue(test1.getPalabras());
		asserTrue(test1.getContadorP());				
	}
	 @Test
	 public void test2() {
			
		 InicioApp2 test1 = new InicioApp2("Ningun rey gobierna para siempre hijo mio");
		assertTrue(test1.getPalabras());
		asserTrue(test1.getContadorP());				
	}
	 @Test
	 public void test3() {
			
		 InicioApp2 test1 = new InicioApp2("Deben crear nuevos sueños peliculas rompiendo estilos tradicionales...");
		assertTrue(test1.getPalabras());
		asserTrue(test1.getContadorP());				
	}
	
	
	
	
	private void assertTrue(int i) {
		// TODO Auto-generated method stub
		
	}
	private void asserTrue(int[] is) {
		// TODO Auto-generated method stub
		
	}

	
	 
	 
	 
	 
	 }