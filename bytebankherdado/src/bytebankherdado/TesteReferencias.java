package bytebankherdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		//todo Gerente � um Funcionario
		//ent�o pode declarar a vari�vel com a ref. gen�rica
		g1.setNome("Jo�o");
		String nome = g1.getNome();
		
		System.out.println(nome);
		
		//g1.autentica(2222);
		//o m�todo autentica pertence ao Gerente
		//por isso ele n�o reconhece o m�todo
		//para a vari�vel g1 (funcionario)
	}
}
