package br.impacta.edu.ex3;

import java.util.List;

public interface IContatoDao {
	List<Contato> buscar(String nome);
	void inserir(Contato c);
	boolean existe(Contato c);
}
