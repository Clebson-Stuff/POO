package br.ufpb.pratInterface;

public class Main {
	private static AreaCalculavel[] formas = new AreaCalculavel[3];
	
	private static void criarFormas() {
		formas[0] = new Quadrado(5);
		formas[1] = new Retangulo(10,5);
		formas[2] = new Circulo(6);
	}
	
	private static void pecorrerFormas() {

		for(AreaCalculavel f: formas) {
			System.out.println(f.calcularArea());
		}
	}
	
	public static void main(String[] args) {
		criarFormas();
		pecorrerFormas();		
		
	}
	

}
