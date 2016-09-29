package aula07;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenadas c1 = new Coordenadas();
		c1.x = 10;
		c1.y = 15;
		c1.z = 20;
	
		Coordenadas c2 = c1;
		c2.x = 11;
		c2.y = 16;
		c2.z = 21;
		
		System.out.println(c1 == c2);
	}

}
