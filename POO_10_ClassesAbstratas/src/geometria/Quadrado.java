package geometria;

public class Quadrado extends FiguraPlana {

	public double base;
	public double altura;
	
	public Quadrado(double novaBase, double novaAltura){
		this.base = novaBase;
		this.altura = novaAltura;
	}
	
	public double area() {
		double area = this.base * this.altura;
		return area;
	}

	public double perimetro() {
		double perimetro = (this.altura * 2) + (this.base * 2);
		return perimetro;
	}

}
