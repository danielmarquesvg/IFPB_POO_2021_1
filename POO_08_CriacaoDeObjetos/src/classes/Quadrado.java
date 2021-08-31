package classes;

public class Quadrado {
	
	// atributo ou caracteristica
	float medidaDoLado;
	
	// construtor
	public Quadrado(float novaMedidaDoLado) {
		this.medidaDoLado = novaMedidaDoLado;
	}
	
	public float getMedidaDoLado() {
		return medidaDoLado;
	}

	public void setMedidaDoLado(float medidaDoLado) {
		this.medidaDoLado = medidaDoLado;
	}

	// metodos ou funcoes
	public float calcularPerimetro() {
		float perimetro = this.medidaDoLado * 4;
		return perimetro;
	}
	
	public float calcularArea() {
		float area = this.medidaDoLado * this.medidaDoLado;
		return area;
	}
	

}
