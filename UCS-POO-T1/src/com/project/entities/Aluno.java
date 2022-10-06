package com.project.entities;

public class Aluno implements Pessoa{
	private String codigo;
	private String nome;
	private String email;

	private double[] notas;
	private double media;
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String status;
	
	@Override
	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
