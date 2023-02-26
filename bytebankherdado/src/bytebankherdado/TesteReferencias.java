package bytebankherdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		//todo Gerente é um Funcionario
		//então pode declarar a variável com a ref. genérica
		g1.setNome("João");
		String nome = g1.getNome();
		
		System.out.println(nome);
		
		//g1.autentica(2222);
		//o método autentica pertence ao Gerente
		//por isso ele não reconhece o método
		//para a variável g1 (funcionario)
	}
}
