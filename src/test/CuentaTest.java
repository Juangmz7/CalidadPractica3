package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Practica3.Cuenta;

class CuentaTest {

    private Cuenta cuenta;

    @BeforeEach
    void setUp() {
        cuenta = new Cuenta("12345", 0d);
    }

    @Test
    void testIngresar() {
        cuenta.ingresar(500);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    void testRetirar() {
        cuenta.ingresar(500);
        cuenta.retirar(500);
        assertEquals(0, cuenta.getSaldo());
    }

    @Test
    void testDescubiertoEnElLimiteSePermite() {
        cuenta.retirar(500);
        assertEquals(-500, cuenta.getSaldo());
    }

    @Test
    void testDescubiertoSuperadoSeRechaza() {
    	assertThrows(IllegalStateException.class, () -> cuenta.retirar(501d));
        assertEquals(0, cuenta.getSaldo());
    }

    @Test
    void test0014() {
        Cuenta c12345 = new Cuenta("12345", 50d);
        Cuenta c67890 = new Cuenta("67890", 0d);

        c12345.retirar(200);
        c67890.retirar(350);
        c12345.ingresar(100);
        assertThrows(IllegalStateException.class, () -> c67890.retirar(200));
        c67890.retirar(150);
        c12345.retirar(200);
        c67890.ingresar(50);
        assertThrows(IllegalStateException.class, () -> c67890.retirar(100));

        assertEquals(-250, c12345.getSaldo());
        assertEquals(-450, c67890.getSaldo());
    }
}