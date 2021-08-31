package classes;

public class Casa {
	
	//atributos ou caracteristicas
	String endereco;
	String cor;
	float area;
	float preco;
	int quantidadeDeQuartos;
	int quantidadeDeBanheiros;
	int quantidadeDeAndares;
	boolean areaDeServico;
	boolean quintal;
	boolean ocupada;
	
	//construtor
	public Casa (String novoEndereco, String novaCor, float novaArea,
			float novoPreco, int novoQuartos, int novoBanheiro,
			int novoAndares, boolean novaAreaDeServico,
			boolean novoQuintal, boolean novoOcupada) {
		this.endereco = novoEndereco;
		this.cor = novaCor;
		this.area = novaArea;
		this.preco = novoPreco;
		this.quantidadeDeQuartos = novoQuartos;
		this.quantidadeDeBanheiros = novoBanheiro;
		this.quantidadeDeAndares = novoAndares;
		this.areaDeServico = novaAreaDeServico;
		this.quintal = novoQuintal;
		this.ocupada = novoOcupada;
		
	}

	// Metodos ou funcoes
	String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String novaCor) {
		this.cor = novaCor;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidadeDeQuartos() {
		return quantidadeDeQuartos;
	}

	public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
		this.quantidadeDeQuartos = quantidadeDeQuartos;
	}

	public int getQuantidadeDeBanheiros() {
		return quantidadeDeBanheiros;
	}

	public void setQuantidadeDeBanheiros(int quantidadeDeBanheiros) {
		this.quantidadeDeBanheiros = quantidadeDeBanheiros;
	}

	public int getQuantidadeDeAndares() {
		return quantidadeDeAndares;
	}

	public void setQuantidadeDeAndares(int quantidadeDeAndares) {
		this.quantidadeDeAndares = quantidadeDeAndares;
	}

	public boolean isAreaDeServico() {
		return areaDeServico;
	}

	public void setAreaDeServico(boolean areaDeServico) {
		this.areaDeServico = areaDeServico;
	}

	public boolean isQuintal() {
		return quintal;
	}

	public void setQuintal(boolean quintal) {
		this.quintal = quintal;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
	

}
