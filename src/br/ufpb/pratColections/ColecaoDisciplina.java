package br.ufpb.pratColections;

import java.util.Collection;
import java.util.LinkedList;

public class ColecaoDisciplina implements Selecionaveis {
	
	Collection<Disciplina> disciplinas;
	
	public ColecaoDisciplina(Collection<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public Collection<Nomeavel> getListaPorNome(String s) {
		Collection<Nomeavel> listaDeNomes = new LinkedList<Nomeavel>();
		for(Disciplina e: this.disciplinas) {
			//intern() retorna a referencia da string na pool
			if(e.getNome() == s.intern()) {
				listaDeNomes.add(e);
			}
		}
		return listaDeNomes;
	}

}
