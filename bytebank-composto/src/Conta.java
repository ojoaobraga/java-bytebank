public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	

	// Void = metodo
	// Double valor = o que ele recebe
	public void deposita(double valor) {
		// This referência a esta conta (resultado é o mesmo sem)
		this.saldo = this.saldo + valor;

	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
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
	
	public double getSaldo(){
		return this.saldo;
	}
	
}