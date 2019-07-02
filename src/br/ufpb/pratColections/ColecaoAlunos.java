package br.ufpb.pratColections;

import java.util.Collection;
import java.util.LinkedList;

public class ColecaoAlunos implements Selecionaveis {
	
	Collection<Aluno> alunos;
	
	public ColecaoAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	@Override
	public Collection<Nomeavel> getListaPorNome(String s) {
		Collection<Nomeavel> listaDeNomes = new LinkedList<Nomeavel>();
		for(Aluno e: this.alunos) {
			//intern() retorna a referencia da string na pool
			if(e.getNome() == s.intern()) {
				listaDeNomes.add(e);
			}
		}
		return listaDeNomes;
	}

}
