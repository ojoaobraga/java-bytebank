public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Static significa que é um membro da classe, não de instância
	private static int total;
	
	public Conta(int agencia, int numero) {
		if(agencia < 0 || numero < 0) {
			System.out.println("Não pode criar uma conta com valores negativos");
			
		}else {
		Conta.total++;
		System.out.println("Total de contas criadas: "+total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando conta: Numero - " + this.numero + " | Agencia - " + this.agencia);
		
		}
	}

	// Void = metodo
	// Double valor = o que ele recebe
	public void deposita(double valor) {
		if (valor > 0) {
			// This referência a esta conta (resultado é o mesmo sem)
			this.saldo = this.saldo + valor;
		} else {
			System.out.println("Não pode depositar valor menor que 0");

		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode numero menor que 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode agência menor que 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Dentro de um contexto estático não existe o this, existe o contexto de classe
	public static int getTotal() {
		return Conta.total;
	}

}