package aula06;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 15;
		int z = 14;
		boolean imprimir = true;
		
		if ((x==10) || (z>y)){
			if (imprimir) System.out.println("x:" + x);
		}
		else if (x==20){
			z += x + y;
			if (imprimir) System.out.println("z: " + z);
		}
		else System.out.println("Não sei!");
		

	}

}
