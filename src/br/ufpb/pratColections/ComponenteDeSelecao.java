package br.ufpb.pratColections;

import java.util.Collection;
import java.util.LinkedList;

public class ComponenteDeSelecao {
	Collection<Nomeavel> colecao;
	
	public ComponenteDeSelecao(Selecionaveis e, String s) {
		this.colecao = new LinkedList<Nomeavel>();
		colecao = e.getListaPorNome(s);
	}
	
	public void geraListBox() {
		StringBuilder e = new StringBuilder();
		for(Nomeavel i : colecao) {	
			e.append(i.getNome()+"\n");
		}
		System.out.println(e);
	}
	
}
