package bytebankherdadoconta;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 3411);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 34455);
		cp.deposita(400);
		
		System.out.println(cc.getSaldo());
		
		cc.transfere(10, cp);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}
}
