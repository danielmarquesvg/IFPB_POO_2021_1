package empresa;

public class Gerente2 extends Funcionario {
	
	private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public Gerente2(String novoNome, String novoCPF, double novoSalario, int novaSenha, int novoNumeroFuncionarios) {
		super(novoNome, novoCPF, novoSalario);
		// TODO Auto-generated constructor stub
		
		this.senha = novaSenha;
		this.numeroDeFuncionariosGerenciados = novoNumeroFuncionarios;
	}

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
}
