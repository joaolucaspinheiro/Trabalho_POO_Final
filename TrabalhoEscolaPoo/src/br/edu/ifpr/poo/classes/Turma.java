package br.edu.ifpr.poo.classes;

public class Turma {
	private int alunosMatriculados;
	private String nomeTurma;
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Turma(int alunosMatriculados, String nomeTurma ) {
		
		this.alunosMatriculados = alunosMatriculados;
		this.nomeTurma = nomeTurma;

	}

	public int getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(int alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}


	


}
