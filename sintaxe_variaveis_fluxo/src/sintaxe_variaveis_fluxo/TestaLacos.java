package sintaxe_variaveis_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		//imprimir tabuada de 01 a 10
		
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				//imprime sem pular linha
				System.out.print(" ");
				//da espaço entre a impressão
			}
			System.out.println();
			//pula linha
		}
	}
}
