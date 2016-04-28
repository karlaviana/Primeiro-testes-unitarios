package com.calculadoraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	public void TestarSoma() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.Somar(1, 1),2);
		assertEquals(calc.Somar(1, 0),1);
		assertEquals(calc.Somar(1, -1),0);
		
	}
   @Test
   public void TestSubtrair(){
	   Calculadora calc = new Calculadora();
	   assertTrue(calc.subtrair(1,1)== 0);
	   assertTrue(calc.subtrair(2,2)== 0);
	   assertTrue(calc.subtrair(0, 0)== 0);
    
}
  @Test 
  public void TestMultiplicar(){
	  Calculadora calc = new Calculadora();
	  assertEquals(calc.multiplicar(1,1),1);
	  assertEquals(calc.multiplicar(2, 1),2);
	  assertEquals(calc.multiplicar(2, 3),6);
  }
  @Test
  public void TestDividir(){
	  Calculadora calc = new Calculadora();
	  assertEquals(calc.dividir(2,1),2);
	  assertEquals(calc.dividir(4,1),4);
  }
  
