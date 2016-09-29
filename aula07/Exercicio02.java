package aula07;

public class Exercicio02 {
	public static void main(String[] args) {

		Coordenadas c1 = new Coordenadas();
		c1.x = 10;
		c1.y = 15;
		c1.z = 20;
	
		Coordenadas c2 = new Coordenadas();
		c2.x = 10;
		c2.y = 15;
		c2.z = 20;
		
		System.out.println(c1 == c2);
	}

}
