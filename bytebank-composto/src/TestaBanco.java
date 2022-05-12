
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		
		joao.nome = "João Braga";
		joao.cpf = "462.967.968-54";
		joao.profissao = "Programador";
		
		Conta contaJoao = new Conta();
		
		contaJoao.deposita(100);
		
		//Associa Cliente a titular Joao 
		contaJoao.titular = joao;
		
		System.out.println(contaJoao.titular.cpf);
		System.out.println(contaJoao.titular.nome);
		System.out.println(contaJoao.titular.profissao);
	}
	
}
