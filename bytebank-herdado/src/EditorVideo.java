// Gerente � um Funcionario, Gerente herda da classe Funcionario
// extends significa herdar de alguem
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando Bonfica��o Editor de Video");
		return 150;
	}

}
