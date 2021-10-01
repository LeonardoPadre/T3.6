package modelo;

import java.util.ArrayList;

public class Produto {
	private double preco;
	private String nome;
	private String descricao;
	private String marca;
	private String codigo;
	private String genero;
	private String categoria;
	
	public static ArrayList<String> produtoCo = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("00001"); add("00002"); add("00003"); add("00004"); add("00005"); add("00006"); add("00007"); add("00008"); add("00009"); add("00010");
		}
	};
	public static ArrayList<String> produtoN = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Air Force 1"); add("SB Dunk High"); add("Dunk High Up"); add("AIR Jordan 5"); add("Lebron XVIII"); add("Dunk Low X Undefeated"); add("Air Jordan 13"); add("Dunk Low"); add("KD14"); add("Drifter ISPA");
		}
	};
	public static ArrayList<Double> produtoP = new ArrayList<Double>() {
		private static final long serialVersionUID = 1L;
		{
			add(100.0); add(500.0); add(999.99); add(500.0); add(750.9); add(700.0); add(699.99); add(1999.99); add(4000.0); add(150.0); add(400.0);
		}
	};
	public static ArrayList<String> produtoM = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike"); add("Nike");
		}
	};
	public static ArrayList<String> produtoD = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;
		{
			add("Tênis de pano branco"); add("Sail"); add("Pale Coral"); add("Gundam"); add("Varsity Maize"); add("Summit White"); add("Orange Blaze"); add("5 on it"); add("5 on it"); add("Light Soft Pink");
		}
	};
	public static ArrayList<String> produtoCa = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados"); add("Calçados");
		}
	};
	public static ArrayList<String> produtoG = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Unissex"); add("Unissex"); add("Unissex"); add("Unissex"); add("Masculino"); add("Masculino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Masculino");
		}
	};
	
	public Produto(String co, String n, double p, String m, String d, String ca, String g) {
		codigo = co;
		nome = n;
		preco = p;
		marca = m;
		descricao = d;
		categoria = d;
		genero = g;
	}
	
	public Produto() {
		
	}
	
	public String toString() {
		return "Código do produto: " + codigo + " || Nome: " + nome + " || Preço: " + preco + " || Marca: " + marca + 
				" || Descrição: " + descricao + " || Categoria: " + categoria + " || Gênero: " + genero;
	}
	
	private void edit(String antigo, String novo, ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) == antigo) {
				lista.set(i, novo);
			}
		}
	}
	
	//Código
	public String getCodigo(int i) {
		return produtoCo.get(i);
	}
	
	public void addCodigo(String cod) {
		produtoCo.add(cod);
	}
	
	public void editCodigo(String cod1, String cod2) {
		edit(cod1, cod2, produtoCo);
	}
	
	//Nome
	public String getNome(int i) {
		return produtoN.get(i);
	}
	
	public void addNome(String nome) {
		produtoN.add(nome);
	}
	
	public void editNome(String nome1, String nome2) {
		edit(nome1, nome2, produtoN);
	}

	//Preço
	public Double getPreco(int i) {
		return produtoP.get(i);
	}
	
	public void addPreco(double preco) {
		produtoP.add(preco);
	}
	
	public void editPreco(double preco1, double preco2) {
		for(int i = 0; i < produtoP.size(); i++) {
			if(produtoP.get(i) == preco1) {
				produtoP.set(i, preco2);
			}
		}
	}
	
	//Marca
	public String getMarca(int i) {
		return produtoM.get(i);
	}
	
	public void addMarca(String marca) {
		produtoM.add(marca);
	}
	
	public void editMarca(String marca1, String marca2) {
		edit(marca1, marca2, produtoM);
	}
	
	//Descrição
	public String getDesc(int i) {
		return produtoD.get(i);
	}
	
	public void addDesc(String desc) {
		produtoD.add(desc);
	}
	
	public void editDesc(String desc1, String desc2) {
		edit(desc1, desc2, produtoD);
	}
	
	//Categoria
	public String getCategoria(int i) {
		return produtoCa.get(i);
	}
	
	public void addCategoria(String cat) {
		produtoCa.add(cat);
	}
	
	public void editCategoria(String cat1, String cat2) {
		edit(cat1, cat2, produtoCa);
	}
	
	//Gênero
	public String getGenero(int i) {
		return produtoG.get(i);
	}
	
	public void addGenero(String gen) {
		produtoG.add(gen);
	}
	
	public void editGenero(String gen1, String gen2) {
		edit(gen1, gen2, produtoG);
	}
	
	//Deletar todo produto a partir do Código
	public void delProduto(String cod) {
		for(int i = 0; i < produtoCo.size(); i++) {
			if(produtoCo.get(i) == cod) {
				produtoCo.remove(i);
				produtoN.remove(i);
				produtoP.remove(i);
				produtoM.remove(i);
				produtoD.remove(i);
				produtoCa.remove(i);
				produtoG.remove(i);
				Estoque.estoque.remove(i);
			}
		}
	}
}