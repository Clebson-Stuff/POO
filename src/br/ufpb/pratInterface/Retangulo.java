package br.ufpb.pratInterface;

public class Retangulo implements AreaCalculavel {
	private double altura;
	private double base;
	
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}
}
