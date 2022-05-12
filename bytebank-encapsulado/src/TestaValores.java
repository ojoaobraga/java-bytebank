
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		Conta conta2 = new Conta(1234, 142342);

		Conta conta3 = new Conta(3214, 445523);
		
		System.out.println(Conta.getTotal());
		
	}
}
