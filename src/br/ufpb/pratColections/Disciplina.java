package br.ufpb.pratColections;

public class Disciplina implements Nomeavel {
	private String nomeDisciplina;

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomeDisciplina;
	}
	
}
