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
	public void testSomarNegativos(){
	  int result = Calculadora.Soma(-2,3);
	  int esperado= 1;		  
	  assertEquals(result, esperado);		
		}
	
	@Test
	public  void testSubtração(){
		int result = Calculadora.Subtração(0, 0);
		int esperado = 0;
		assertEquals(result, esperado);	
	}
	@Test
	public  void testSubtrirNegativos(){
		int result = Calculadora.Subtração(-2, 0);
		int esperado = -2;
		assertEquals(result, esperado);	
	}
	
	@Test
	 public void testMultiplicação(){
		int result = Calculadora.Multiplicação(0, 0);
		int esperado = 0;
		assertEquals(result, esperado);	
	}
	@Test
	 public void testMultiplicarNegativos(){
		int result = Calculadora.Multiplicação(45, -2);
		int esperado = -90;
		assertEquals(result, esperado);
	
}
 
	@Test
	public void TestDivsão(){
		int result = Calculadora.Divisão(3,2);
		int esperado = 1;
	    assertEquals(result, esperado);
	}
	
	@Test
	public void testDivsãoCaracteresEspeciais(){
		int result = Calculadora.Divisão(3,2);
		String variavel = "!";
		int esperado = 1;
	    assertEquals(result, esperado);
	}  


