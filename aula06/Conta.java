package aula06;

public class Conta {
	
	//atributos
	int numero;
	String dono;
	double saldo;
	double limite;
	
	//metodos
	void sacar(double qtd){
		double novoSaldo = this.saldo - qtd;
		this.saldo = novoSaldo;
	}
	
	void depositar (double qtd){
		this.saldo += qtd;
	}
}
