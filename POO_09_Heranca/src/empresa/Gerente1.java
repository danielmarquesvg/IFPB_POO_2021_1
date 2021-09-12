package empresa;

public class Gerente1 {

	private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int numeroDeFuncionarios;
    
    public Gerente1(String novoNome, String novoCPF, double novoSalario,
    		int novaSenha, int novoNumeroDeFuncionarios) {
    	this.nome = novoNome;
    	this.cpf = novoCPF;
    	this.salario = novoSalario;
    	this.senha = novaSenha;
    	this.numeroDeFuncionarios = novoNumeroDeFuncionarios;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

}
