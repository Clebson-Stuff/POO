package br.zoologico;

public class Zebra extends Animal implements AnimalCorredor{
	
	@Override
	public void emitirSom() {
		System.out.println("(Som de zebra)");
	}
	public void correr() {
		System.out.println("Zebra Correu");		
	}

}
