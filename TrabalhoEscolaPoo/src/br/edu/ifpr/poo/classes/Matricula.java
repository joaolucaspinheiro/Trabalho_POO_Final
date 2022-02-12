package br.edu.ifpr.poo.classes;

public class Matricula {
	
	private int numero;
	private boolean ativa;
	private Turma turma;
	private Aluno aluno;

	public Matricula(int numero, boolean ativa, Turma turma, Aluno aluno) {
		this.turma = turma;
		this.aluno = aluno;
		this.numero = numero;
		this.ativa = ativa;

	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
