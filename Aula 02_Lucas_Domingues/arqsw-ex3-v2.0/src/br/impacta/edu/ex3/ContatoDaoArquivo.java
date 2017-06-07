package br.impacta.edu.ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDaoArquivo implements IContatoDao {

	private String nomeArquivo;
	
	public ContatoDaoArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void lerTodos() throws IOException {
		List<Contato> result = new ArrayList<>();
		try{
		FileReader fr = new FileReader(nomeArquivo);
		BufferedReader br = new BufferedReader(fr);
		String linha;
		while ( (linha = br.readLine()) != null) {
			String[] info = linha.split(";");
			String nome = info[0];
			String telefone = info[1];
			Contato c = new Contato(nome, telefone);
			result.add(c);
		}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
	}
	
	@Override
	public List<Contato> buscar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Contato c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existe(Contato c) {
		// TODO Auto-generated method stub
		return false;
	}

}
