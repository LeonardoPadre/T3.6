package TP3;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private String email;
	ArrayList<String> cliente = new ArrayList<String>();
	
	public Cliente(String n, String c) {
		nome = n;
		CPF = c;
	}
	
	public String toString() {
		return "Nome do cliente: " + cliente + " || CPF: " + CPF + " || Email: " + email;
	}
	
	//CPF
	public void addCPF(String cpf) {
		cliente.add(cpf);
	}
	
	public void editCPF(String cpf1, String cpf2) {
		for(int i = 0; i < cliente.size(); i++) {
			if(cliente.get(i) == cpf1) {
				cliente.set(i, cpf2);
			}
		}
	}
	
	//Nome
	public void addNome(String nome) {
		cliente.add(nome);
	}
	
	public void editNome(String nome1, String nome2) {
		for(int i = 0; i < cliente.size(); i++) {
			if(cliente.get(i) == nome1) {
				cliente.set(i, nome2);
			}
		}
	}
	
	//Email
	public void addEmail(String email) {
		cliente.add(email);
	}
	
	public void editEmail(String email1, String email2) {
		for(int i = 0; i < cliente.size(); i++) {
			if(cliente.get(i) == email1) {
				cliente.set(i, email2);
			}
		}
	}
	
	//Telefone
	public void addTelefone(String telefone) {
		cliente.add(telefone);
	}
	
	public void editTelefone(String tel1, String tel2) {
		for(int i = 0; i < cliente.size(); i++) {
			if(cliente.get(i) == tel1) {
				cliente.set(i, tel2);
			}
		}
	}
	
	//Deletar todo cliente a partir do CPF
	public void delCliente(String cPf) {
		for(int i = 0; i < cliente.size(); i++) {
			if(cliente.get(i) == cPf) {
				for(int w = i; w < i + 4; w++)
					cliente.remove(w);
			}
		}
	}
}
































