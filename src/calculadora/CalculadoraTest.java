package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar(){
	  int result = Calculadora.Soma(2,3);
	  int esperado= 5;		  
	  assertEquals(result, esperado);		
		}
	@Test
	public  void testSubtra��o(){
		int result = Calculadora.Subtra��o(0, 0);
		int esperado = 0;
		assertEquals(result, esperado);	
	}
	}


