package br.zoologico;

public class Leao extends Animal implements AnimalCorredor{
	
	@Override
	public void emitirSom() {
		System.out.println("(Som de le�o)");
	}
	public void correr() {
		System.out.println("Le�o Correu");		
	}

}
