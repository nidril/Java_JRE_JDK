package bytebankherdado;

public class ControleBonificacao {
	
	private double soma;
	
	//COMO TODOS SÃO FUNCIONARIOS, PODE USAR APENAS ESSE METODO
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}
	
	
	
// TRÊS METODOS PARA FAZER A MESMA FUNÇÃO:	
//	public void registra(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;
//	}
//		
//	public void registra(Funcionario f) {
//		double boni = f.getBonificacao();
//		this.soma = this.soma + boni;
//		
//	}
//	
//	public void registra(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma = this.soma + boni;
//		
//	}
	
	
	
	

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	
	
}
