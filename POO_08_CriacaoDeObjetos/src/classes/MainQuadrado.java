package classes;

public class MainQuadrado {
	
	public static void main(String[] args) {
		
		float tamanhoDoLado = 2;
		
		Quadrado meuQuadrado = new Quadrado(tamanhoDoLado);
		
		System.out.println("Tamanho do lado do quadrado: "+ meuQuadrado.getMedidaDoLado());
		System.out.println("Perimetro do quadrado: "+ meuQuadrado.calcularPerimetro());
		System.out.println("Area do quadrado: "+ meuQuadrado.calcularArea());
	}

}
