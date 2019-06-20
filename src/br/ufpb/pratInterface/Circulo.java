package br.ufpb.pratInterface;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 3.14*(this.raio*this.raio);
	}
	
	
}
