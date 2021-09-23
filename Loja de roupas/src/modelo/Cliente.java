package modelo;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private String email;
	private String nome;
	
	public static ArrayList<String> clienteN = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Carlos"); add("Magda"); add("James"); add("Lucas"); add("Leo"); add("Fabi"); add("Ricardo"); add("José"); add("Paulo"); add("Amanda");
		}
	};
	public static ArrayList<String> clienteC = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("6666666666"); add("05421367710"); add("38524120471"); add("00672316472"); add("12345678911"); add("99999999999"); add("61120576312"); add("64132578511"); add("36524565478"); add("32147568014");
		}
	};
	public static ArrayList<String> clienteE = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("Brasilia"); add("Amapa"); add("Rio de Janeiro"); add("Roraima"); add("Goiania"); add("California"); add("Goiania"); add("Porto Alegre"); add("Recife"); add("Maranhão");
		}
	};
	public static ArrayList<String> clienteT = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("0619932015917"); add("061944415917"); add("061995574817"); add("061995012217"); add("061999517521"); add("061966666617"); add("061995069697"); add("061998412371"); add("061984015917"); add("061975015917");
		}
	};
	
	public Cliente(String n, String c, String e) {
		nome = n;
		CPF = c;
		email = e;
	}
	
	public Cliente() {
		
	}
	
	public String toString() {
		return "Nome do cliente: " + nome + " || CPF: " + CPF + " || Email: " + email;
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
		return clienteC.get(i);
	}
	
	public void addCPF(String cpf) {
		clienteC.add(cpf);
	}
	
	public void editCPF(String cpf1, String cpf2) {
		edit(cpf1, cpf2, clienteC);
	}
	
	//Nome
	public String getNome(int i) {
		return clienteN.get(i);
	}
	
	public void addNome(String nome) {
		clienteN.add(nome);
	}
	
	public void editNome(String nome1, String nome2) {
		edit(nome1, nome2, clienteN);
	}
	
	//Email
	public String getEmail(int i) {
		return clienteE.get(i);
	}
	
	public void addEmail(String email) {
		clienteE.add(email);
	}
	
	public void editEmail(String email1, String email2) {
		edit(email1, email2, clienteE);
	}
	
	//Telefone
	public String getTelefone(int i) {
		return clienteT.get(i);
	}
	
	public void addTelefone(String telefone) {
		clienteT.add(telefone);
	}
	
	public void editTelefone(String tel1, String tel2) {
		edit(tel1, tel2, clienteT);
	}
	
	//Deletar todo cliente a partir do CPF
	public void delProduto(String cod) {
		for(int i = 0; i < clienteC.size(); i++) {
			if(clienteC.get(i) == cod) {
				clienteC.remove(i);
				clienteN.remove(i);
				clienteE.remove(i);
				clienteT.remove(i);
			}
		}
	}
}