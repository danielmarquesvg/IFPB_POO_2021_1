package geometria;

public class Main {
	
	public static void main(String[] args) {
		
		double base = 2;
		double altura = 2;
		
		Quadrado meuQuadrado = new Quadrado(base, altura);
		
		System.out.println("Inicializando a forma geométrica: Quadrado\n");
		
		System.out.println("Base: " + meuQuadrado.base);
		System.out.println("Altura: " + meuQuadrado.altura +"\n");
		
		System.out.println("Área: " + meuQuadrado.area());
		System.out.println("Perímetro: " + meuQuadrado.perimetro());
		
	}

}
