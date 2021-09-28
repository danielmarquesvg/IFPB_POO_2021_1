package pessoa;

public class Daniel extends Pessoa{

	int idade;
	
	public Daniel(String novoNome, int novaIdade) {
		super(novoNome);
		this.idade = novaIdade;
		
	}
	
	//polimorfismo
	public String rir() {
		String risada = "hahahahahaha";
		return risada;
	}
	
}
