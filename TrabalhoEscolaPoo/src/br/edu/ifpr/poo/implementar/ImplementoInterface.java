package br.edu.ifpr.poo.implementar;

import br.edu.ifpr.poo.interfaces.*;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.poo.classes.*;

public class ImplementoInterface implements ITrabalhoPOO {

	private Process exec;

	@Override
	public Aluno lerDadosAluno() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome completo do/da aluno/a? ");
		String nome = teclado.nextLine();
		System.out.println("Qual o endereco do/da aluno/a? ");
		String endereco = teclado.nextLine();
		System.out.println("Qual o ano de nascimento do/da aluno/a? ");
		String dataNasc = teclado.nextLine();
		System.out.println("Qual o telefone para contato?");
		String telefoneCont = teclado.nextLine();
		System.out.println("Qual o ano de ingresso?");
		int anoDeIngresso = teclado.nextInt();
		Aluno aluno = new Aluno(nome, anoDeIngresso, endereco, dataNasc, telefoneCont);

		return aluno;

	}

	@Override
	public Professor lerDadosProfessor() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome completo do/da professor/a ");
		String nome = teclado.nextLine();
		System.out.println("Qual o endereco do/da professor/a? ");
		String endereco = teclado.nextLine();
		System.out.println("Qual o ano de nascimento do professor/a? ");
		String dataNasc = teclado.nextLine();
		System.out.println("Qual o telefone para contato do professor/a?");
		String telefoneCont = teclado.nextLine();
		System.out.println("Qual o Siape do professor?");
		String siape = teclado.nextLine();
		Professor professor = new Professor(nome, siape, endereco, dataNasc, telefoneCont);

		return professor;
	}

	@Override
	public Curso lerDadosCurso() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome do curso?");
		String nome = teclado.nextLine();
		Curso curso = new Curso(nome);
		return curso;

	}

	@Override
	public Turma lerDadosTurma() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome da turma? ");
		String nometurma = teclado.nextLine();
		System.out.println("Quantos alunos/nas matriculados/das a turma possui?");
		int alunosMat = teclado.nextInt();
		Turma turma = new Turma(alunosMat, nometurma);
		return turma;

	}

	public Turma lerDadosTurma(Curso curso) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome da turma? ");
		String nometurma = teclado.nextLine();
		System.out.println("Quantos alunos/nas matriculados/das a turma possui?");
		int alunosMat = teclado.nextInt();
		Turma turma = new Turma(alunosMat, nometurma);
		return turma;

	}

	@Override
	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é a disciplina? ");
		String nomeDisc = teclado.nextLine();
		System.out.println("Qual carga horaria ela possui?");
		int cargaDisc = teclado.nextInt();

		Disciplina disciplina = new Disciplina(nomeDisc, cargaDisc, professor, turma);
		return disciplina;
	}

	@Override
	public Disciplina lerDadosDisciplina() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é a disciplina? ");
		String nomeDisc = teclado.nextLine();
		System.out.println("Qual carga horaria ela possui?");
		int cargaDisc = teclado.nextInt();
		Professor professor = lerDadosProfessor();
		Turma turma = lerDadosTurma();
		Disciplina disciplina = new Disciplina(nomeDisc, cargaDisc, professor, turma);
		return disciplina;
	}

	@Override
	public Matricula lerDadosMatricula() {
		Scanner teclado = new Scanner(System.in);
		int contMatriculaAtiva = 0;
		System.out.println("Qual o numero de matricula? ");
		int numero = teclado.nextInt();
		int statusMatricula = 0;
		boolean ativa = false;
		do {
			System.out.println("A matricula está ativa?");
			System.out.println("1-Para sim");
			System.out.println("2- Para não");
			statusMatricula = teclado.nextInt();

		} while (statusMatricula != 1 && statusMatricula != 2);

		if (statusMatricula == 1) {
			ativa = true;
			contMatriculaAtiva = contMatriculaAtiva + 1;

		} else {
			ativa = false;
		}
		ativa = true;
		Aluno aluno = lerDadosAluno();
		Turma turma = lerDadosTurma();
		Matricula matricula = new Matricula(numero, ativa, turma, aluno);
		return matricula;

	}

	@Override
	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		int contMatriculaAtiva = 0;
		System.out.println("Qual o numero de matricula? ");
		int numero = teclado.nextInt();
		int statusMatricula = 0;
		boolean ativa = false;
		do {
			System.out.println("A matricula está ativa?");
			System.out.println("1- Para sim");
			System.out.println("2- Para não");
			statusMatricula = teclado.nextInt();

		} while (statusMatricula != 1 && statusMatricula != 2);

		if (statusMatricula == 1) {
			ativa = true;
			contMatriculaAtiva = contMatriculaAtiva + 1;

		} else {
			ativa = false;
		}
		ativa = true;
		Matricula matricula = new Matricula(numero, ativa, turma, aluno);
		return matricula;
	}

	@Override
	public void listarTodasMatriculas(ArrayList<Matricula> matriculas) {
		System.out.println("---------- Lista de todas as Matriculas ----------");
		for (Matricula matricula : matriculas) {

			System.out.println("O Numero de matriculas são de:" + matricula.getNumero());

		}
		System.out.println("O total de matriculas é de: " + matriculas.size());

		System.out.println(" ------------------------------ \n");
	}

	@Override
	public void listarMatriculasAtivas(ArrayList<Matricula> matriculas) {
		int contadora = 0;

		System.out.println("---------- Lista de todas as Matriculas ativas ----------");
		for (int cont = 0; cont < matriculas.size(); cont++) {
			System.out.println(matriculas.get(cont).getNumero());
		}
		System.out.println(matriculas.size());

		System.out.println("O total de matriculas ativas são:" + contadora);

	}

	@Override
	public void listarAlunos(ArrayList<Aluno> alunos) {
		System.out.println("---------- Lista do/da Aluno/a ---------- ");
		for (Aluno aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("O ano de ingresso foi: " + aluno.getAnoDeIngresso());
			System.out.println("Seu telefone de contato é: " + aluno.getTelefoneCon());
			System.out.println("Seu endereço é: " + aluno.getEndereco());
			System.out.println("Sua data de nascimento é: " + aluno.getDataNasc());
			System.out.println(" ------------------------------ \n");
		}

	}

	@Override
	public void listarTurmas(ArrayList<Turma> turmas) {
		System.out.println("---------- Lista de turmas ---------- ");
		for (Turma turma : turmas) {
			System.out.println("Nome da turma: " + turma.getNomeTurma());
			System.out.println("Alunos matriculados: " + turma.getAlunosMatriculados());
			System.out.println(" ------------------------------ \n");

		}

	}

	@Override
	public void listarProfessores(ArrayList<Professor> professores) {

		System.out.println("---------- Lista dos Professores/as ---------- ");

		for (Professor professor : professores) {
			System.out.println("Professor/a: " + professor.getNome());
			System.out.println("O Siape é: " + professor.getSiape());
			System.out.println("Seu telefone de contato é: " + professor.getTelefoneCon());
			System.out.println("Seu endereço é: " + professor.getEndereco());
			System.out.println("Sua data de nascimento é: " + professor.getDataNasc());
			System.out.println(" ------------------------------ \n");

		}
	}

	@Override
	public void listarDisciplina(ArrayList<Disciplina> disciplinas) {

		System.out.println(" ---------- Lista das Disciplinas ---------- ");
		for (Disciplina disciplina : disciplinas) {
			System.out.println("Disciplina: " + disciplina.getNome());
			System.out.println("A Disciplina tem a carga horaria de: " + disciplina.getCargaHoraria() + "Hrs");
			System.out.println("O professor que ministra a disciplina é: " + disciplina.getProfessor().getNome());
			System.out.println("A turma é: " + disciplina.getTurma().getNomeTurma());

		}
		System.out.println(" ------------------------------ \n");

	}

	@Override
	public void listarCursos(ArrayList<Curso> curso) {

		for (Curso cursos : curso) {
			System.out.println("Curso de: " + cursos.getNome());

		}
	}

}
