package empresa;

public class Main {
	
	public static void main(String[] args) {
		
		// Atributos
		String nome = "Pedro";
		String cpf = "111.222.333-44";
		double salario = 1500;
		int senha = 123456;
		int numeroDeFuncionarios = 10;
		
		// criacao do objeto
		Gerente2 meuGerente2 = new Gerente2(nome, cpf, salario, senha, numeroDeFuncionarios);
		
		
		// testando o objeto
		System.out.println("Iniciando o sistema");
		
		System.out.println("Nome do gerente: " + meuGerente2.getNome());
		System.out.println("CPF do gerente: " + meuGerente2.getCpf());
		
		if(meuGerente2.autentica(senha) == true) {
			System.out.println("Senha autenticada");
		} else {
			System.out.println("Senha incorreta");
		}
	}

}
