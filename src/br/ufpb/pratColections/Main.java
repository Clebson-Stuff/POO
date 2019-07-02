package br.ufpb.pratColections;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main (String [] args) {
		List<Aluno> alunos = new LinkedList<Aluno>();
		
		alunos.add(new Aluno("joão"));
		alunos.add(new Aluno("Maria"));
		Selecionaveis e = new ColecaoAlunos(alunos);
		ComponenteDeSelecao cds;
		cds = new ComponenteDeSelecao(e,"Maria");
		cds.geraListBox();
		
		List<Disciplina> disciplinas = new LinkedList<Disciplina>();
		disciplinas.add(new Disciplina("Programação"));
		disciplinas.add(new Disciplina("Programação"));
		disciplinas.add(new Disciplina("Matematica"));
		Selecionaveis d = new ColecaoDisciplina(disciplinas);
		
		cds = new ComponenteDeSelecao(d, "Programação");
		cds.geraListBox();
		
		
	}
	
}
