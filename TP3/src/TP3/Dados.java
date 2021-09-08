package TP3;
import java.util.ArrayList;

public class Dados {
	
	//Produto
		ArrayList<String> produto = new ArrayList<String>();
		public void produto(String nome, String preco, String descProduto, String marca, String codigo, String genero, String categoria) {
			produto.add(nome); produto.add(preco); produto.add(descProduto); produto.add(marca); produto.add(codigo); produto.add(genero); produto.add(categoria);
		}
		
	//Estoque
		ArrayList<String> estoque = new ArrayList<String>();
		public void estoque(String produto, String quantidade) {
			//String to Int => Integer.parseInt(str) => use para diminuir a quantidade no estoque na hora da venda
			estoque.add(produto); estoque.add(quantidade);
		}
		
	//Funcionario
		ArrayList<String> funcionario = new ArrayList<String>();
		public void funcionario(String nome, String rg, String dataDaContratacao, String endereco, String funcao, String genero, String cpf, String telefone) {
			funcionario.add(nome); funcionario.add(rg); funcionario.add(dataDaContratacao); funcionario.add(endereco);
			funcionario.add(funcao); funcionario.add(genero); funcionario.add(cpf); funcionario.add(telefone);
		}
		
	//Cliente
		ArrayList<String> cliente = new ArrayList<String>();
		public void cliente(String nome, String email, String cpf, String telefone) {
			cliente.add(nome); cliente.add(email); cliente.add(cpf); cliente.add(telefone);
		}
		
	//Venda
		ArrayList<String> venda = new ArrayList<String>();
		public void venda(String codVenda, String produto, String qntVendida, String custoFinal, String cliente, String funcionario) {
			venda.add(codVenda);
			String aux = qntVendida + " x " + produto + " = " + custoFinal + " || " + "Funcionário: " + funcionario + " | " + "Cliente: " + cliente;
			venda.add(aux);
		}
}
