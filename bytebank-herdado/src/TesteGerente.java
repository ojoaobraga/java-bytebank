
public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Jo�o Braga");
		g1.setCpf("462.967.968-54");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
