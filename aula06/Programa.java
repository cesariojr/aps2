package aula06;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.dono = "Zé";
		minhaConta.saldo = 1000.0;
		
		System.out.println("Saldo: " + minhaConta.saldo);
		
		minhaConta.sacar(200);
		
		minhaConta.depositar(500);
		
		System.out.println("Saldo: " + minhaConta.saldo);

		
		
	}

}
