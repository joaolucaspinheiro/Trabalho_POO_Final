package br.edu.ifpr.poo.classes;

public class Disciplina {
	private String nome;
	private int cargaHoraria;
	private Professor professor;
	private Turma turma;

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Disciplina(String nome, int cargaHoraria, Professor professor, Turma turma) {
		this.professor = professor;
		this.turma = turma;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


}
