package TP3;

public abstract class Pessoa {
	protected String nome;
	protected String CPF;
	protected Telefone numTel;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public Telefone getNumTel() {
		return numTel;
	}


	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}

}
