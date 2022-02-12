package br.edu.ifpr.poo.testar;

import java.util.ArrayList;

import br.edu.ifpr.poo.classes.Aluno;
import br.edu.ifpr.poo.classes.Curso;
import br.edu.ifpr.poo.classes.Disciplina;
import br.edu.ifpr.poo.classes.Matricula;
import br.edu.ifpr.poo.classes.Professor;
import br.edu.ifpr.poo.classes.Turma;
import br.edu.ifpr.poo.implementar.ImplementoInterface;
import br.edu.ifpr.poo.interfaces.ITrabalhoPOO;

public class Testar {
	public static void main(String[] args) {
		ITrabalhoPOO trabalho = new ImplementoInterface();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

		// Ler dados
		
		Aluno aluno = trabalho.lerDadosAluno();
		Turma turma = trabalho.lerDadosTurma();
		Matricula matricula = trabalho.lerDadosMatricula(aluno, turma);
		Professor professor = trabalho.lerDadosProfessor();
		Curso curso = trabalho.lerDadosCurso();
		Disciplina disciplina = trabalho.lerDadosDisciplina(professor, turma);
		
		turmas.add(turma);
		cursos.add(curso);
		alunos.add(aluno);
		matriculas.add(matricula);
		professores.add(professor);
		disciplinas.add(disciplina);

		// Impressão de Dados
		trabalho.listarCursos(cursos);
		trabalho.listarMatriculasAtivas(matriculas);
		trabalho.listarTodasMatriculas(matriculas);
		trabalho.listarAlunos(alunos);
		trabalho.listarTurmas(turmas);
		trabalho.listarProfessores(professores);
		trabalho.listarDisciplina(disciplinas);
		

	}

}
