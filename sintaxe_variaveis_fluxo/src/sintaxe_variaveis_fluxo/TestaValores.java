package sintaxe_variaveis_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		
		// mesmo que eu atribua outro valor ao primeiro DEPOIS
		// ele não irá atualizar o valor do segundo
		
		primeiro = 10;
		
		System.out.println(segundo);
	}
}
