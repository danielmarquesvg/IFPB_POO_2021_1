package geometria;

public class Main {
	
	public static void main(String[] args) {
		
		double base = 2;
		double altura = 2;
		
		Quadrado meuQuadrado = new Quadrado(base, altura);
		
		System.out.println("Inicializando a forma geom�trica: Quadrado\n");
		
		System.out.println("Base: " + meuQuadrado.base);
		System.out.println("Altura: " + meuQuadrado.altura +"\n");
		
		System.out.println("�rea: " + meuQuadrado.area());
		System.out.println("Per�metro: " + meuQuadrado.perimetro());
		
	}

}
