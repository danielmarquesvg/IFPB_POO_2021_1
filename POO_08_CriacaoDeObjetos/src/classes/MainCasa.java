package classes;

public class MainCasa {
	
	public static void main(String[] args) {
		
		//atributos ou caracteristicas
		String endereco = "Rua Campos Sales";
		String cor = "Branca";
		float area = 80;
		float preco = 150000;
		int quantidadeDeQuartos = 3;
		int quantidadeDeBanheiros = 2;
		int quantidadeDeAndares = 1;
		boolean areaDeServico = true;
		boolean quintal = true;
		boolean ocupada = true;
		
		Casa casaDeCampina = new Casa(endereco, cor, area, preco,
				quantidadeDeQuartos, quantidadeDeBanheiros,
				quantidadeDeAndares, areaDeServico, quintal, ocupada);
		
		endereco = "Rua Floariano Peixoto";
		cor = "Amarela";
		area = 50;
		preco = 200000;
		quantidadeDeQuartos = 2;
		quantidadeDeBanheiros = 2;
		quantidadeDeAndares = 2;
		areaDeServico = true;
		quintal = false;
		ocupada = true;
		
		Casa casaDeDaniel = new Casa(endereco, cor, area, preco,
				quantidadeDeQuartos, quantidadeDeBanheiros,
				quantidadeDeAndares, areaDeServico, quintal, ocupada);
		
		// primeira cor da minha casa
		System.out.println("Cor da casa de Daniel: "+casaDeDaniel.getCor());
		
		//pintei a minha casa de vermelho
		casaDeDaniel.setCor("Vermelha");
		System.out.println("Cor da casa de Daniel: "+casaDeDaniel.getCor());
		
		//Comparacoes
		if(casaDeCampina.getQuantidadeDeQuartos() >= casaDeDaniel.getQuantidadeDeQuartos())
		{
			System.out.println("\n\nA casa de campina tem mais quartos ou a mesma quantidade da outra casa");
			System.out.println("Quartos da casa Campina: "+casaDeCampina.getQuantidadeDeQuartos());
			System.out.println("Quartos da casa de Daniel: "+casaDeDaniel.getQuantidadeDeQuartos());
		} else {
			System.out.println("A casa de daniel tem mais quartos");
			System.out.println("Quartos da casa Campina: "+casaDeCampina.getQuantidadeDeQuartos());
			System.out.println("Quartos da casa de Daniel: "+casaDeDaniel.getQuantidadeDeQuartos());
		}
	}

}
