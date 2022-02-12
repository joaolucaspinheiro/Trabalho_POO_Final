package br.edu.ifpr.poo.classes;

public abstract class Pessoa {
	protected String nome;
	protected String endereco;
	protected String dataNasc;
	protected String telefoneCon;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefoneCon() {
		return telefoneCon;
	}

	public void setTelefoneCon(String telefoneCon) {
		this.telefoneCon = telefoneCon;
	}

	public void imprimirDados() {

	}

}
