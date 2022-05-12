
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaGabi = new Conta();
		System.out.println(contaGabi.getSaldo());
		
		contaGabi.titular = new Cliente();

		contaGabi.titular.nome = "Gabi";
		System.out.println(contaGabi.titular.nome);
	}
}
