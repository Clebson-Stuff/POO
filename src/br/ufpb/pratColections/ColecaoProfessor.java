package br.ufpb.pratColections;

import java.util.Collection;
import java.util.LinkedList;

public class ColecaoProfessor implements Selecionaveis {
	
	Collection<Professor> professores;
	
	public ColecaoProfessor(Collection<Professor> professores) {
		this.professores = professores;
	}
	
	@Override
	public Collection<Nomeavel> getListaPorNome(String s) {
		Collection<Nomeavel> listaDeNomes = new LinkedList<Nomeavel>();
		for(Professor e: this.professores) {
			//intern() retorna a referencia da string na pool
			if(e.getNome() == s.intern()) {
				listaDeNomes.add(e);
			}
		}
		return listaDeNomes;
	}

}
