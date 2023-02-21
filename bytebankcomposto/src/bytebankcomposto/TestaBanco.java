package bytebankcomposto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "015.222.147-52";
		paulo.profissao = "Mec�nico";
		
		
		System.out.println(paulo.nome);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//associa a conta do paulo ao paulo da vari�vel:
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
	}
}
