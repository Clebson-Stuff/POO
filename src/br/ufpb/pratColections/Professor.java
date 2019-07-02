package br.ufpb.pratColections;

public class Professor implements Nomeavel{
	private String nome;

	public Professor(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
