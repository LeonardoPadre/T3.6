package modelo;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	private String RG;
	private String dataDaContratacao;
	private String endereco;
	private String funcao;
	private String genero;
	
	public static ArrayList<String> funcionarioN = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Carla"); add("Fernanda"); add("Irelia"); add("Liz"); add("Layz"); add("Marcela"); add("Ana"); add("Laura"); add("Maria"); add("Cleo");
		}
	};
	public static ArrayList<String> funcionarioC = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("6666666666"); add("05421367710"); add("38524120471"); add("00672316472"); add("12345678911"); add("99999999999"); add("61120576312"); add("64132578511"); add("36524565478"); add("32147568014");
		}
	};
	public static ArrayList<String> funcionarioD = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("02/05/2001"); add("01/01/2002"); add("07/08/1978"); add("02/07/2000"); add("01/12/2000"); add("30/01/1999"); add("12/07/1995"); add("13/07/1999"); add("22/02/1980"); add("11/11/2011");
		}
	};
	public static ArrayList<String> funcionarioE = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF"); add("Brasilia - DF");
		}
	};
	public static ArrayList<String> funcionarioT = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("0619932015917"); add("061944415917"); add("061995574817"); add("061995012217"); add("061999517521"); add("061966666617"); add("061995069697"); add("061998412371"); add("061984015917"); add("061975015917");
		}
	};
	public static ArrayList<String> funcionarioF = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Gerente"); add("CEO"); add("CFO"); add("Caixa"); add("Caixa"); add("Vendedor"); add("Vendedor"); add("Vendedor"); add("Vendedor"); add("Estagiario");
		}
	};
	public static ArrayList<String> funcionarioG = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino"); add("Feminino");
		}
	};
	
	public Funcionario(String n, String f, String d, String e, String r, String c, String g) {
		nome = n;
		funcao = f;
		dataDaContratacao = d;
		endereco = e;
		RG = r;
		CPF = c;
		genero = g;
	}
	
	public Funcionario() {
		
	}
	
	public String toString() {
		return "Nome do funcionario: " + nome + " || Função: " + funcao + " || Contratação: " + dataDaContratacao +
				" || Endereço: " + endereco + " || RG: " + RG + " || CPF: " + CPF + " || Gênero: " + genero;
	}
	
	private void edit(String antigo, String novo, ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) == antigo) {
				lista.set(i, novo);
			}
		}
	}
	
	//CPF
	public String getCPF(int i) {
		return funcionarioC.get(i);
	}
	
	public void addCPF(String cpf) {
		funcionarioC.add(cpf);
	}
	
	public void editCPF(String cpf1, String cpf2) {
		edit(cpf1, cpf2, funcionarioC);
	}
	
	//Nome
	public String getNome(int i) {
		return funcionarioN.get(i);
	}
	
	public void addNome(String nome) {
		funcionarioN.add(nome);
	}
	
	public void editNome(String nome1, String nome2) {
		edit(nome1, nome2, funcionarioN);
	}
	
	//Telefone
	public String getTelefone(int i) {
		return funcionarioT.get(i);
	}
	
	public void addTelefone(String telefone) {
		funcionarioT.add(telefone);
	}
	
	public void editTelefone(String tel1, String tel2) {
		edit(tel1, tel2, funcionarioT);
	}
	
	//Endereço
	public String getEnd(int i) {
		return funcionarioE.get(i);
	}
	
	public void addEnd(String end) {
		funcionarioE.add(end);
	}
	
	public void editEnd(String end1, String end2) {
		edit(end1, end2, funcionarioE);
	}
	
	//Função
	public String getFuncao(int i) {
		return funcionarioF.get(i);
	}
	
	public void addFunc(String fun) {
		funcionarioF.add(fun);
	}
	
	public void editFuncao(String fun1, String fun2) {
		edit(fun1, fun2, funcionarioF);
	}
	
	//Data da Contratação
	public String getDataContratacao(int i) {
		return funcionarioD.get(i);
	}
	
	public void addDataContratacao(String data) {
		funcionarioD.add(data);
	}
	
	public void editDataContratacao(String data1, String data2) {
		edit(data1, data2, funcionarioD);
	}
	
	//Gênero
	public String getGenero(int i) {
		return funcionarioG.get(i);
	}
	
	public void addGenero(String genero) {
		funcionarioG.add(genero);
	}
	
	public void editGenero(String genero1, String genero2) {
		edit(genero1, genero2, funcionarioG);
	}
	
	//Deletar todo cliente a partir do CPF
	public void delFuncionario(String cod) {
		for(int i = 0; i < funcionarioC.size(); i++) {
			if(funcionarioC.get(i) == cod) {
				funcionarioC.remove(i);
				funcionarioN.remove(i);
				funcionarioT.remove(i);
				funcionarioE.remove(i);
				funcionarioF.remove(i);
				funcionarioD.remove(i);
				funcionarioG.remove(i);
			}
		}
	}
}
