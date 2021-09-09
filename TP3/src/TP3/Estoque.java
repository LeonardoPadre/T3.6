package TP3;

import java.util.ArrayList;

public class Estoque {
	private Produto codigo;
	private Produto nome;
	private int quantidade;
	ArrayList<String> estoque = new ArrayList<String>();
	
	public String toString() {
		return "Código: " + codigo + " || Nome: " + nome + " || Quantidade: " + quantidade;
	}
	
	private void edit(String antigocod, String novocod, String novonome) {
		for(int i = 0; i < estoque.size(); i++) {
			if(estoque.get(i) == antigocod) {
				estoque.set(i, novocod);
				estoque.set(i+1, novonome);
			}
		}
	}
	
	//Produto
	public void addProEst(int cod, String nome) {
		String codd = Integer.toString(cod);
		estoque.add(codd);
		estoque.add(nome);
	}
	
	//Edita tudo a partir do código do produto
	public void editProEst(String cod1, String cod2, String n1) {
		edit(cod1, cod2, n1);
	}
	
	//Deletar
		public void delProEst(String cod) {
			for(int i = 0; i < estoque.size(); i++) {
				if(estoque.get(i) == cod) {
					for(int w = i; w < i + 2; w++)
						estoque.remove(w);
				}
			}
		}
}
