// Gerente é um Funcionario, Gerente herda da classe Funcionario
// extends significa herdar de alguem
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando Bonficação Designer");
		return 200;
	}

}
