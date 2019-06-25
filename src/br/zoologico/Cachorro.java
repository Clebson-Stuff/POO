package br.zoologico;

public class Cachorro extends Animal implements AnimalCorredor{
	
	@Override
	public void emitirSom() {
		System.out.println("AuAu");
	}
	public void correr() {
		System.out.println("Cachorro Correu");		
	}

}
