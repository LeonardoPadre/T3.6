package modelo;

import java.util.ArrayList;

public class Estoque {
	private String codigo;
	private String nome;
	private int quantidade;
	public static ArrayList<Integer> estoque = new ArrayList<Integer>() {
		private static final long serialVersionUID = 1L;
		{
			add(9); add(100); add(100); add(100); add(100); add(100); add(1000); add(9999); add(11); add(1);
		}
	};
	
	public Estoque(String c, String n, int qnt) {
		codigo = c;
		nome = n;
		quantidade = qnt;
	}
	
	public Estoque() {
		
	}
	
	public String toString() {
		return "Código do produto: " + codigo + " || Nome: " + nome + " || Quantidade: " + quantidade;
	}
	
	public Integer getEstoque(int i) {
		return estoque.get(i);
	}
	
	public void addEstoque(int qnt) {
		estoque.add(qnt);
	}
	
	public void editEstoque(int i, int qnt) {
		estoque.set(i, qnt);
	}
	
	public void delEstoque(int i) {
		estoque.remove(i);
	}
}
