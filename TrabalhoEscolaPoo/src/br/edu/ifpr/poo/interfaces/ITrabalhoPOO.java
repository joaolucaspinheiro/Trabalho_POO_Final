package br.edu.ifpr.poo.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import br.edu.ifpr.poo.classes.*;

public interface ITrabalhoPOO {
	Aluno lerDadosAluno();
	Professor lerDadosProfessor();
	Curso lerDadosCurso();
	Turma lerDadosTurma();
	Disciplina lerDadosDisciplina(Professor professor, Turma turma);
	Disciplina lerDadosDisciplina();
	Matricula lerDadosMatricula();
	Matricula lerDadosMatricula(Aluno aluno, Turma turma);
	
	void listarTodasMatriculas(ArrayList<Matricula>matriculas);
	void listarMatriculasAtivas(ArrayList<Matricula>matriculas);
	void listarAlunos(ArrayList<Aluno>alunos);
    void listarTurmas(ArrayList<Turma>Turmas);
    void listarProfessores(ArrayList<Professor>professores);
    void listarDisciplina(ArrayList<Disciplina>disciplina);
    void listarCursos(ArrayList<Curso>curso);

	
	
    
}
