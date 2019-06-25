package br.zoologico;

public class Zoo {
	private Animal[] jaulas = new Animal[5];
	
	public Zoo() {
		jaulas[0] = new Cachorro();
		jaulas[1] = new Preguica();
		jaulas[2] = new Leao();
		jaulas[3] = new Zebra();
		jaulas[4] = new Antilope();
	}
	
	public void cutucaJaula() {
		for(Animal e : this.jaulas) {
			e.emitirSom();
			if(e instanceof AnimalCorredor) {
				((AnimalCorredor) e).correr();
			}
		}
	}
}
