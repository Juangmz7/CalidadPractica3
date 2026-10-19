package Practica3;

import java.util.List;

public class Cuenta { 
    String mNumero; 
    String nTitular; 
    Double saldo;
    List <Movimiento> mMovimientos;
    
	public void ingresar(double d) {
		saldo += saldo += d;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		saldo = d;
	}

	public void retirar(double d) {
		saldo -=  d;
	}
}
