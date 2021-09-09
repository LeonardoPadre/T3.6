package TP3;

import java.util.ArrayList;

public class Produto {
	//private String fotoDoProduto;
	private double preco;
	private String nome;
	private String descricao;
	private String marca;
	private String codigo;
	private String genero;
	private String categoria;
	ArrayList<String> produto = new ArrayList<String>();
	
	public Produto(String co, String n, double p, String m, String d, String ca, String g) {
		codigo = co;
		nome = n;
		preco = p;
		marca = m;
		descricao = d;
		categoria = d;
		genero = g;
	}
	
	public String toString() {
		return "Código: " + codigo + " || Nome: " + nome + " || Preço: " + preco + " || Marca: " + marca + 
				"\n || Descrição: " + descricao + " || Categoria: " + categoria + " || Gênero: " + genero;
	}
	
	private void edit(String antigo, String novo) {
		for(int i = 0; i < produto.size(); i++) {
			if(produto.get(i) == antigo) {
				produto.set(i, novo);
			}
		}
	}
	
	//Código
	public void addCodigo(String cod) {
		produto.add(cod);
	}
	
	public void editCodigo(String cod1, String cod2) {
		edit(cod1, cod2);
	}
	
	//Nome
	public void addNome(String nome) {
		produto.add(nome);
	}
	
	public void editNome(String nome1, String nome2) {
		edit(nome1, nome2);
	}
	
	//Preço
	public void addPreco(double preco) {
		String p = Double.toString(preco);
		produto.add(p);
	}
	
	public void editPreco(double preco1, double preco2) {
		String p1 = Double.toString(preco1);
		String p2 = Double.toString(preco2);
		edit(p1, p2);
	}
	
	//Marca
	public void addMarca(String marca) {
		produto.add(marca);
	}
	
	public void editMarca(String marca1, String marca2) {
		edit(marca1, marca2);
	}
	
	//Descrição
	public void addDesc(String desc) {
		produto.add(desc);
	}
	
	public void editDesc(String desc1, String desc2) {
		edit(desc1, desc2);
	}
	
	//Categoria
	public void addCategoria(String cat) {
		produto.add(cat);
	}
	
	public void editCategoria(String cat1, String cat2) {
		edit(cat1, cat2);
	}
	
	//Gênero
	public void addGenero(String gen) {
		produto.add(gen);
	}
	
	public void editGenero(String gen1, String gen2) {
		edit(gen1, gen2);
	}
	
	//Deletar todo produto a partir do Código
	public void delProduto(String cod) {
		for(int i = 0; i < produto.size(); i++) {
			if(produto.get(i) == cod) {
				for(int w = i; w < i + 7; w++)
					produto.remove(w);
			}
		}
	}	
}