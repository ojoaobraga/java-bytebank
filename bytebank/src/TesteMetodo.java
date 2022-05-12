
public class TesteMetodo {

	public static void main(String[] args) {
		//referencia da Classe Conta
		Conta contaJoao = new Conta();
		contaJoao.saldo = 100;
		
		//nomeDaReferencia.nomeDoMetodo();
		contaJoao.deposita(50);
		System.out.println(contaJoao.saldo);
		
		boolean conseguiuRetirar = contaJoao.saca(20);
		System.out.println(contaJoao.saldo);
		
		System.out.println(conseguiuRetirar);
		
		Conta contaGabi = new Conta();
		
		contaGabi.deposita(1000);
														//contaJoao é a conta Destino para sacar 
		                                                //contaGabi é a conta Destino para depositar
		boolean sucessoTransferencia =contaGabi.transfere(30, contaJoao); 
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia feita com Sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaGabi.saldo);
		System.out.println(contaJoao.saldo);
		
		
		contaJoao.titular = "João Braga";
		System.out.println(contaJoao.titular);
		System.out.println(contaGabi.titular);
		
	}
}
