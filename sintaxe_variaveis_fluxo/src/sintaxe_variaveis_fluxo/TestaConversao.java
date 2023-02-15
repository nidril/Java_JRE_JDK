package sintaxe_variaveis_fluxo;

public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		//não é possível colocar uma variável flutuante
		//dentro de uma variável do tipo inteiro
		// int valor = salario;
		
		// é possível forçar o double a entrar no inteiro
		int valor = (int) salario;
		System.out.println(valor);
		//imprime 1270 (retirando a casa decimal)
		
		// outras variaveis numericas
		// int até 2bilhões
		// long guarda números gigantes
		// short para numeros pequenos 2131
		// byte números até 127
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		double total = valor1 + valor2;
		System.out.println(total);
		
		// como o número é flutuante ele soma as casas decimais
		// por isso não se usa muito o double para dinheiro
		
	}
}
