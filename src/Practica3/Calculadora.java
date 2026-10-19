package Practica3;

public class Calculadora {

	public static Integer sumar(int i, int j) {
		return i + j;
	}

	public static Integer restar(int i, int j) {
		return i - j;
	}

	public static Integer multiplicar(int i, int j) {
		return i * j;
	}

	public static Integer dividir(int i, int j) {
		if (j == 0) throw new IllegalArgumentException();
		return i / j;
	}
	
}
