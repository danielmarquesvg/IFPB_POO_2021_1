package empresa;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario (String novoNome, String novoCPF, double novoSalario) {
    	this.nome = novoNome;
    	this.cpf = novoCPF;
    	this.salario = novoSalario;
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
    
}
