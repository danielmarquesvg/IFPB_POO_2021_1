package animais;

public abstract class Animal {

	int distanciaPercorrida = 0;
	
	public abstract void fazerBarulho();
	
	
	public void andar() {
		distanciaPercorrida = distanciaPercorrida + 1;
	}
	
	public void treinar() {
		andar();
		fazerBarulho();
	}
}
