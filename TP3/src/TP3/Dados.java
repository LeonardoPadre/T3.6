package TP3;
import java.util.ArrayList;
import java.util.List;

public class Dados {
	
	//Produto
		public void produto(String nome, String preco, String descProduto, String marca, String codigo, String genero, String categoria) {
			ArrayList<String> produto = new ArrayList<String>();
			produto.add(nome); produto.add(preco); produto.add(descProduto); produto.add(marca); produto.add(codigo); produto.add(genero); produto.add(categoria);
			//nome = i; preco = i+1; desc = i+2; marca = i+3; cod = i+4; gen = i+5; cat = i+6
		}
		
	//Estoque
		public void estoque(String produto, String quantidade) {
			//String to Int => Integer.parseInt(str) => use para diminuir a quantidade no estoque na hora da venda
			ArrayList<String> estoque = new ArrayList<String>();
			estoque.add(produto); estoque.add(quantidade);
			//
		}
		
	//Funcionario
		public void funcionario(String nome, String rg, String dataDaContratacao, String endereco, String funcao, String genero, String cpf, String telefone) {
			ArrayList<String> funcionario = new ArrayList<String>();
			funcionario.add(nome); funcionario.add(rg); funcionario.add(dataDaContratacao); funcionario.add(endereco);
			funcionario.add(funcao); funcionario.add(genero); funcionario.add(cpf); funcionario.add(telefone);
			//no = i; rg = i+1; dataD = i+2; end = i+3; fun = i+4; gen = i+5; cpf = i+6; tel = i+7
		}
		
	//Cliente
		public void cliente(String nome, String email, String cpf, String telefone) {
			ArrayList<String> cliente = new ArrayList<String>();
			cliente.add(nome); cliente.add(email); cliente.add(cpf); cliente.add(telefone);
		}
		
	//Venda
		public void venda(String codVenda, String produto, String qntVendida, String custoFinal, String cliente, String funcionario) {
			ArrayList<String> venda = new ArrayList<String>();
			venda.add(codVenda);
			String aux = qntVendida + " x " + produto + " = " + custoFinal + " || " + "Funcionário: " + funcionario + " | " + "Cliente: " + cliente;
			venda.add(aux);
		}
		
	//Teste
		public static List<String> teste = new ArrayList<String>();
		public void test(String a) {
			teste.add(a);
		}
}
