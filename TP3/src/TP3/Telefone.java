package TP3;

public class Telefone {
	
	private int DDD;
	private int numero;
	
	public Telefone(int cod, int num) {
		DDD = cod;
		numero = num;
	}
	
	
	@Override
	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}
	
	
}
