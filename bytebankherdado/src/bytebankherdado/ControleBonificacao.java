package bytebankherdado;

public class ControleBonificacao {
	
	private double soma;
	
	//COMO TODOS S�O FUNCIONARIOS, PODE USAR APENAS ESSE METODO
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}
	
	
	
// TR�S METODOS PARA FAZER A MESMA FUN��O:	
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
