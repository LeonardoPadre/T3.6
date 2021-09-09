package TP3;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	private String RG;
	private String dataDaContratacao;
	private String endereco;
	private String funcao;
	private String genero;
	ArrayList<String> funcionario = new ArrayList<String>();
	
	public Funcionario(String n, String f, String d, String e, String r, String c, String g) {
		nome = n;
		funcao = f;
		dataDaContratacao = d;
		endereco = e;
		RG = r;
		CPF = c;
		genero = g;
	}
	
	public String toString() {
		return "Nome do funcionario: " + nome + " || Função: " + funcao + " || Contratação: " + dataDaContratacao +
				" || Endereço: " + endereco + " || RG: " + RG + " || CPF: " + CPF + " || Gênero: " + genero;
	}
	
	private void edit(String antigo, String novo) {
		for(int i = 0; i < funcionario.size(); i++) {
			if(funcionario.get(i) == antigo) {
				funcionario.set(i, novo);
			}
		}
	}
	
	//CPF
	public void addCPF(String cpf) {
		funcionario.add(cpf);
	}
	
	public void editCPF(String cpf1, String cpf2) {
		edit(cpf1, cpf2);
	}
	
	//RG
	public void addRG(String rg) {
		funcionario.add(rg);
	}
	
	public void editRG(String rg1, String rg2) {
		edit(rg1, rg2);
	}
	
	//Nome
	public void addNome(String nome) {
		funcionario.add(nome);
	}
	
	public void editNome(String nome1, String nome2) {
		edit(nome1, nome2);
	}
	
	//Telefone
	public void addTelefone(String telefone) {
		funcionario.add(telefone);
	}
	
	public void editTelefone(String tel1, String tel2) {
		edit(tel1, tel2);
	}
	
	//Endereço
	public void addEnd(String end) {
		funcionario.add(end);
	}
	
	public void editEnd(String end1, String end2) {
		edit(end1, end2);
	}
	
	//Função
	public void addFunc(String fun) {
		funcionario.add(fun);
	}
	
	public void editFuncao(String fun1, String fun2) {
		edit(fun1, fun2);
	}
	
	//Data da Contratação
	public void addDataContratacao(String data) {
		funcionario.add(data);
	}
	
	public void editDataContratacao(String data1, String data2) {
		edit(data1, data2);
	}
	
	//Gênero
	public void addGenero(String genero) {
		funcionario.add(genero);
	}
	
	public void editGenero(String genero1, String genero2) {
		edit(genero1, genero2);
	}
	
	//Deletar todo cliente a partir do CPF
	public void delFuncionario(String cPf) {
		for(int i = 0; i < funcionario.size(); i++) {
			if(funcionario.get(i) == cPf) {
				for(int w = i; w < i + 8; w++)
					funcionario.remove(w);
			}
		}
	}
}
