package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Practica3.Cuenta;

class CuentaTest {
	
	public static Cuenta cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500d);
		assertEquals(cuenta.getSaldo(), 500);
	}
	
	@Test
	void testRetirar() {
		cuenta.setSaldo(500d);
		cuenta.retirar(500d);
		assertEquals(cuenta.getSaldo(), 0);
	}

}
