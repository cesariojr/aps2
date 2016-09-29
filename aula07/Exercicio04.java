package aula07;

class Cliente {
    private String nome, cpf;	
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	// Construtor para classe Cliente
    Cliente (String nomeCliente, String cpfCliente) {
         nome = nomeCliente;
         cpf = cpfCliente;
    }
}

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente jose = new Cliente("Joao","236.658.542-25");
		
		System.out.println(jose.setNome("jose"));
		
		System.out.println(jose.getNome());
		System.out.println(jose.getCpf());
	}

}
