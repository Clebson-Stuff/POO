package br.zoologico;

public abstract class Animal {
	protected String nome;
	protected int idade;
	
	public void emitirSom() {
		System.out.println("Som de animal");
	}

}
