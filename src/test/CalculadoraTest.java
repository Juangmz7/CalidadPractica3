package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Practica3.Calculadora;

class CalculadoraTest {

	@Test
	void test() {
		
	}
	
	@Test
	void testSumar() {
		assertEquals(Calculadora.sumar(2, 3), 5);
	}
	
	@Test
	void testRestar() {
		assertEquals(Calculadora.restar(2, 3), -1);
	}
	
	@Test
	void testMultiplicar() {
		assertEquals(Calculadora.multiplicar(2, 3), 6);
	}
	
	@Test
	void testDividir() {
		assertEquals(Calculadora.dividir(6, 3), 2);
		assertThrows(IllegalArgumentException.class, () -> Calculadora.dividir(3, 0));
	}

}
