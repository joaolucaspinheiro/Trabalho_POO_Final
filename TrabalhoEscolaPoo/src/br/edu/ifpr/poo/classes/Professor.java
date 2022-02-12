package br.edu.ifpr.poo.classes;

public final class Professor extends Pessoa {
	private String siape;

	public Professor(String siape) {
		this.siape = siape;

	}
	public Professor(String nome, String siape, String endereco, String dataNasc, String telefoneCon ) {
		this.nome = nome;
		this.siape = siape;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.telefoneCon = telefoneCon;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

}
