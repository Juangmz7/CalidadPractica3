package Practica3;

import java.util.List;

public class Cuenta { 
    String mNumero; 
    String nTitular; 
    Double saldo;
    List <Movimiento> mMovimientos;
    
    public Cuenta(String mNumero, Double saldo) {
    	this.mNumero = mNumero;
    	this.saldo = saldo;
    }
	public void ingresar(double d) {
		if (d < 0) throw new IllegalArgumentException();
		saldo += d;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		saldo = d;
	}

	public void retirar(double d) {
		if (d < 0) throw new IllegalArgumentException();
		if (saldo - d < -500) throw new IllegalStateException();
		saldo -=  d;
	}
}
