package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		//usar a variavel no mesmo nome da classe para teste
		
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.saca(30);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiu = contaDoPaulo.saca(20);
		System.out.println(conseguiu);
		
		Conta contadaMarcela = new Conta();
		contadaMarcela.deposita(1000);
		
		System.out.println(contadaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contadaMarcela.transfere(300, contaDoPaulo);
		System.out.println(contadaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
	}
}
