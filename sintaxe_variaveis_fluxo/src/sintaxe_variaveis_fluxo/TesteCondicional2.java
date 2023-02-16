package sintaxe_variaveis_fluxo;

public class TesteCondicional2 {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			//o || é OU e o && é E
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Não pode entrar!");
		}
		
		boolean acompanhado = true;
		// é o mesmo que 'quantidadePessoas >= 2' pois retorna TRUE
		
		if (acompanhado) {
			//como acompanhado já é true não precisa declarar novamente
			System.out.println("Ok, acompanhado!");
		}
		
		
	}
}
