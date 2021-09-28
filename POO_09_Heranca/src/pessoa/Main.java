package pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		String nome = "Anonimo";
		Pessoa novaPessoa = new Pessoa(nome);
		
		nome = "Daniel";
		int idade = 30;
		Daniel novoDaniel = new Daniel(nome, idade);
		
		//comparando a risada de uma pessoa normal e de Daniel
		System.out.println("Risada da superclasse (Pessoa): " + novaPessoa.rir());
		System.out.println("Risada da subclasse (Daniel): " + novoDaniel.rir());
		
	}

}