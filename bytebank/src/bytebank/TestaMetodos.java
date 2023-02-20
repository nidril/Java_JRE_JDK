package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//usar a variavel no mesmo nome da classe para teste
		
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		conta.saca(30);
		System.out.println(conta.saldo);
		boolean conseguiu = conta.saca(20);
		System.out.println(conseguiu);
		
		Conta contadaMarcela = new Conta();
		contadaMarcela.deposita(1000);
		
		System.out.println(contadaMarcela.saldo);
		System.out.println(conta.saldo);
		
		contadaMarcela.transfere(300, conta);
		System.out.println(contadaMarcela.saldo);
		System.out.println(conta.saldo);
		
		
	}
}
