package modelo;

import java.util.ArrayList;

public class Venda {
	private String nomeP;
	private String nomeC;
	private String nomeF;
	private String codVenda;
	private double custoFinal;
	private int qntVendido;
	
	public static ArrayList<String> codigoVenda = new ArrayList<String>() { 
		private static final long serialVersionUID = 1L;
		{
			add("V00001"); add("V00002"); add("V00003"); add("V00004"); add("V00005"); add("V00006");
		}
	};
	public static ArrayList<String> venda1 = new ArrayList<String>() { //Cliente, Funcionario, Produto, Quantidade, ... , Custo Final
		private static final long serialVersionUID = 1L;
		{
			add(Cliente.clienteN.get(0)); add(Funcionario.funcionarioN.get(0)); add(Produto.produtoN.get(0)); add("2"); add("200.00"); 
		}
	};
	public static ArrayList<String> venda2 = new ArrayList<String>() { 
		private static final long serialVersionUID = 1L;
		{
			add(Cliente.clienteN.get(1)); add(Funcionario.funcionarioN.get(1)); add(Produto.produtoN.get(1)); add("4"); add(Produto.produtoN.get(3)); add("1"); add("2500.00");
		}
	};
	public static ArrayList<String> venda3 = new ArrayList<String>() { 
		private static final long serialVersionUID = 1L;
		{
			add(Cliente.clienteN.get(2)); add(Funcionario.funcionarioN.get(2)); add(Produto.produtoN.get(2)); add("5"); add(Produto.produtoN.get(9)); add("5"); add(Produto.produtoN.get(5)); add("3"); add("7849.95");
		}
	};
	public static ArrayList<String> venda4 = new ArrayList<String>() { 
		private static final long serialVersionUID = 1L;
		{
			add(Cliente.clienteN.get(3)); add(Funcionario.funcionarioN.get(3)); add(Produto.produtoN.get(3)); add("2"); add(Produto.produtoN.get(5)); add("10"); add(Produto.produtoN.get(3)); add("5"); add(Produto.produtoN.get(0)); add("2"); add("10700.00");
		}
	};
	public static ArrayList<String> venda5 = new ArrayList<String>() { 
		private static final long serialVersionUID = 1L;
		{
			add(Cliente.clienteN.get(4)); add(Funcionario.funcionarioN.get(4)); add(Produto.produtoN.get(4)); add("3"); add(Produto.produtoN.get(0)); add("8"); add("3057.70");
		}
	};
	public static ArrayList<String> venda6 = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add(Cliente.clienteN.get(5)); add(Funcionario.funcionarioN.get(5)); add(Produto.produtoN.get(5)); add("1"); add(Produto.produtoN.get(3)); add("9"); add(Produto.produtoN.get(9)); add("1"); add("5350.00");
		}
	};
	
	
	public static ArrayList<ArrayList<String>> vendas = new ArrayList<ArrayList<String>>() {
		private static final long serialVersionUID = 1L;
		{
			add(venda1); add(venda2); add(venda3); add(venda4); add(venda5); add(venda6);
		}
	};	
	
	public String toString() {
		return "Venda: " + codVenda + " || " + qntVendido + " x " + nomeP + " || Valor: " + custoFinal +
				" || Vendedor: " + nomeF + " || Cliente: " + nomeC;
	}
	
	public Venda(String cv, int qv, String np, double cf, String nf, String nc) {
		codVenda = cv;
		qntVendido = qv;
		nomeP = np;
		custoFinal = cf;
		nomeF = nf;
		nomeC = nc;
	}
	
	public Venda() {
		
	}
	
	public ArrayList<String> getProdutosVendidos(int pos) {
		ArrayList<String> aux = new ArrayList<String>();
		
		for(int i = 0; i < vendas.get(pos).size(); i++) {
			for(int j = 0; j < Produto.produtoN.size(); j++) {
				if(vendas.get(pos).get(i) == Produto.produtoN.get(j)) {
					aux.add(Produto.produtoN.get(j));
				}
			}
		}
		
		return aux;
	}
	
	public String getFuncionarioVenda(int pos) {
		return vendas.get(pos).get(1);
	}
	
	public String getClienteVenda(int pos) {
		return vendas.get(pos).get(0);
	}
	
	public ArrayList<String> getQuantidade(int pos) {
		ArrayList<String> aux2 = new ArrayList<String>();
		
		for(int i = 0; i < vendas.get(pos).size(); i++) {
			for(int j = 0; j < Produto.produtoN.size(); j++) {
				if(vendas.get(pos).get(i) == Produto.produtoN.get(j)) {
					aux2.add(vendas.get(pos).get(i + 1));
				}
			}
		}
		
		return aux2;
	}
	
	public String getPrecoFinal(int pos) {
		return vendas.get(pos).get(vendas.get(pos).size() - 1);
	}
	
	public void delVenda(int pos) {
		codigoVenda.remove(pos);
		vendas.remove(pos);
	}
}
