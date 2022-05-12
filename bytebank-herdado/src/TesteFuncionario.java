
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente funcionario = new Gerente();
		
		funcionario.setNome("João Braga");
		funcionario.setCpf("123.456.789-10");
		funcionario.setSalario(5000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		
	}

}
