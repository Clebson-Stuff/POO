package br.zoologico;

public class Leao extends Animal implements AnimalCorredor{
	
	@Override
	public void emitirSom() {
		System.out.println("(Som de leão)");
	}
	public void correr() {
		System.out.println("Leão Correu");		
	}

}
