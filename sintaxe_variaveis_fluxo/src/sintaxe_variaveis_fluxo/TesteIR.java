package sintaxe_variaveis_fluxo;

public class TesteIR {
	public static void main(String[] args) {
		double salario = 4200.0;
		
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("Faixa de 7,5%");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Faixa de 15%");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("Faixa de 22,5%");
		}
	}
}
