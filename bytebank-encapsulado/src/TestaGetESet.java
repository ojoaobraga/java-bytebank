public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 123);
		
		// conta.numero = 1337;
		//conta.setNumero(1337);

		System.out.println(conta.getNumero());

		Cliente cliente = new Cliente();

		// conta.titular = cliente;

		conta.setTitular(cliente);

		cliente.setNome("Joao Braga");

		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//Agora com duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(cliente);
		System.out.println(conta.getTitular());
		
	}
}
