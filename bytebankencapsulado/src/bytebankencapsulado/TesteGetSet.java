package bytebankencapsulado;

public class TesteGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(147, 1478995);
		// conta.numero = 1334;
		// agora conta est� encapsulada
		// n�o pode ser acionada diretamente
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		

		conta.setAgencia(778);
		System.out.println(conta.getAgencia());
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		//� preciso invocar os dois m�todos
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
