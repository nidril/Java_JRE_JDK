package bytebankcomposto;

public class TesteSacaValorNegativo {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		
		novaConta.deposita(100);
//		System.out.println(novaConta.saldo);
		// novaConta.saca(200);
		System.out.println(novaConta.saca(200));
//		System.out.println(novaConta.saldo);
		
		
		//PROIBIR ESSA A��O
		// for�ando o saldo a mudar manualmente:
//		novaConta.saldo = novaConta.saldo - 101;
//		System.out.println(novaConta.saldo);
		
// N�O � MAIS POSS�VEL ACESSAR O SALDO, AGORA PRECISA USAR O METODO:
		System.out.println(novaConta.getSaldo());
		
	}
}
