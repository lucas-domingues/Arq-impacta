package Model;

public class contato {
	private String nome;
	private String telefone;
	
	public contato(String nome, String telefone){
		this.setNome(nome);
		this.setTelefone(telefone);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 

}
