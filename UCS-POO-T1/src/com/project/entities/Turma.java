package com.project.entities;

public class Turma {
	private Aluno[] alunos;
	private String codigo;
	private Professor professor;
	private String nomeDisciplina;
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getAlunosAprovados() {
		//TODO calulo alunos aprovados
		int alunosAprovados = 1;
		return alunosAprovados;
	}

	public int getPercentualAprovacao() {
		//TODO calulo percentual aprovação
		int percentualAprovacao = 1;
		return percentualAprovacao;
	}

	
}
