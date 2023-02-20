package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		//cria um caminho para o objeto baseado na classe
		//o tipo da variável é baseado na classe
		primeiraConta.saldo = 200;
		//declara o valor da variável saldo baseada na conta
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
	}
}
