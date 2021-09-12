package pessoa;

public class Pessoa {
	
	// atributos
	String nome;
	
	// construtor
	public Pessoa(String novoNome) {
		this.nome = novoNome;
	}

	// metodos
	
	public String rir() {
		String risada = "kkkkkkkkk";
		return risada;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
