package br.edu.ifpr.poo.classes;

public final class Aluno extends Pessoa {
	private int anoDeIngresso;
	private Matricula matricula;

	public Aluno(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;

	}

	public Aluno(String nome, int anoDeIngresso, String endereco, String dataNasc, String telefoneCon ) {
		this.nome = nome;
		this.anoDeIngresso = anoDeIngresso;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.telefoneCon = telefoneCon;
		
		
		
		// TODO Auto-generated constructor stub
	}

	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}

	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
}
