package aula08;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Carlos Vieira");
		gerente.setSalario(3000.58);
		gerente.setUsuario("carlos.vieira");
		gerente.setSenha("5523");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Pedro Castelo");
		funcionario.setSalario(1500);
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Luana Brana");
		telefonista.setSalario(1300.00);
		telefonista.setEstacaoDeTrabalho(20);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Maria Ribeiro");
		secretaria.setSalario(1125.25);
		secretaria.setRamal(5);
		
		System.out.println("##### Gerente #####");
		System.out.println("Nome.: "+gerente.getNome());
		System.out.println("Sal�rio.: "+gerente.getSalario());
		System.out.println("Usu�rio.: "+gerente.getUsuario());
		System.out.println("Senha.: "+gerente.getSenha());
		System.out.println("Bonifica��o.: "+gerente.calculaBonificacao());
		System.out.println();
		
		System.out.println("##### Funcion�rio #####");
		System.out.println("Nome.: "+funcionario.getNome());
		System.out.println("Sal�rio.: "+funcionario.getSalario());
		System.out.println("Bonifica��o.: "+funcionario.calculaBonificacao());
		System.out.println();
		
		System.out.println("##### Telefonista #####");
		System.out.println("Nome.: "+telefonista.getNome());
		System.out.println("Sal�rio.: "+telefonista.getSalario());
		System.out.println("Esta��o de Trabalho.: "+telefonista.getEstacaoDeTrabalho());
		System.out.println("Bonifica��o.: "+telefonista.calculaBonificacao());
		System.out.println();
		
		System.out.println("##### Secret�ria #####");
		System.out.println("Nome.: "+secretaria.getNome());
		System.out.println("Sal�rio.: "+secretaria.getSalario());
		System.out.println("Ramal.: "+secretaria.getRamal());
		System.out.println("Bonifica��o.: "+secretaria.calculaBonificacao());
		System.out.println();
	}

}
