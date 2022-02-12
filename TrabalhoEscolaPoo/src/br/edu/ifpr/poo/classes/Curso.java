package br.edu.ifpr.poo.classes;

public class Curso {
	public String nome;
	private Turma turma;

	public Curso(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
