package sintaxe_variaveis_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Escopo de variáveis");
		
		// as variaveis só existem dentro do bloco onde for declarada
		
		String biscoito = "biscoito";
		int teste = 0;
		
		System.out.println(biscoito);
		
		if (teste == 0) {
			System.out.println(biscoito);
		}
		
		//quando declarada fora do bloco ela existe para todos os blocos
		
		if (teste > 10) {
			String resultado = "Deu certo!";
			System.out.println(resultado);
		}
		
		// System.out.println(resultado);
		// aqui a variável resultado não existe
		
	}
}
