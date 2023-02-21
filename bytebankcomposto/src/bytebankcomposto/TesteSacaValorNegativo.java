package bytebankcomposto;

public class TesteSacaValorNegativo {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		
		novaConta.deposita(100);
//		System.out.println(novaConta.saldo);
		// novaConta.saca(200);
		System.out.println(novaConta.saca(200));
//		System.out.println(novaConta.saldo);
		
		
		//PROIBIR ESSA AÇÃO
		// forçando o saldo a mudar manualmente:
//		novaConta.saldo = novaConta.saldo - 101;
//		System.out.println(novaConta.saldo);
		
// NÃO É MAIS POSSÍVEL ACESSAR O SALDO, AGORA PRECISA USAR O METODO:
		System.out.println(novaConta.getSaldo());
		
	}
}
