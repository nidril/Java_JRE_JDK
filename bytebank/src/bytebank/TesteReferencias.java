package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		//uma segunda refer�ncia ao mesmo objeto
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		//como a refer�ncia � ao mesmo objeto ele sempre
		//altera o objeto igual independente da vari�vel
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma coisa!");
			
			
		}
	}
}
