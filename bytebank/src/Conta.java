public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	// Void = metodo
	// Double valor = o que ele recebe
	public void deposita(double valor) {

		// This refer�ncia a esta conta (resultado � o mesmo sem)
		this.saldo = this.saldo + valor;

	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
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
}