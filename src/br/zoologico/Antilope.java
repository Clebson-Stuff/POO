package br.zoologico;

public class Antilope extends Animal implements AnimalCorredor{
	
	@Override
	public void emitirSom() {
		System.out.println("(Som de antilope)");
	}
	public void correr() {
		System.out.println("Antilope Correu");		
	}

}

