package modelo;

import java.util.ArrayList;

public class Estoque {
	private String codigo;
	private String nome;
	private int quantidade;
	ArrayList<String> estoque = new ArrayList<String>();
	
	public Estoque(String c, String n, int qnt) {
		codigo = c;
		nome = n;
		quantidade = qnt;
	}
	
	public String toString() {
		return "Código do produto: " + codigo + " || Nome: " + nome + " || Quantidade: " + quantidade;
	}
	
	//Produto
	public void addProEst(int cod, String nome) {
		String codd = Integer.toString(cod);
		estoque.add(codd);
		estoque.add(nome);
	}
	
	//Quantidade
	public void addEstoque(int qnt) {
		String qntt = Integer.toString(qnt);
		estoque.add(qntt);
	}
	
	//Edita quantidade
	public void editEstoque(String codProduto, int qnt) {
		for(int i = 0; i < estoque.size(); i++) {
			if(estoque.get(i) == codProduto) {
				String qntt = Integer.toString(qnt);
				estoque.set(i+2, qntt);
			}
		}
	}
	
	
	//Edita codigo e nome
	public void editProEst(String antCod, String nvCod, String nvNome) {
		for(int i = 0; i < estoque.size(); i++) {
			if(estoque.get(i) == antCod) {
				estoque.set(i, nvCod);
				estoque.set(i+1, nvNome);
			}
		}
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
