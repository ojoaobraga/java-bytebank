// Gerente é um Funcionario, Gerente herda da classe Funcionario
// extends significa herdar de alguem
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando Bonficação Editor de Video");
		return 150;
	}

}
