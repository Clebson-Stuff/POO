package br.ufpb.pratInterface;

public class Quadrado implements AreaCalculavel{
	private double medidaLado;
	
	public Quadrado(double medida) {
		this.medidaLado = medida;
	}

	@Override
	public double calcularArea() {
		return this.medidaLado * this.medidaLado;
	}
	
}
