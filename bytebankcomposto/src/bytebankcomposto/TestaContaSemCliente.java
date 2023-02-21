package bytebankcomposto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
//		System.out.println(contaDaMarcela.saldo);
		
		
		//USANDO O METODO PARA VER O SALDO:
		System.out.println(contaDaMarcela.getSaldo());
		
		// contaDaMarcela.titular.nome = "Marcela";
		// System.out.println(contaDaMarcela.titular.nome);
		// a conta da Marcela não foi associada a nenhum cliente
		
		contaDaMarcela.titular = new Cliente ();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	}
}
