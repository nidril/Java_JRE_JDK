package bytebankherdado;

public class Funcionario2 {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0;
	//definir qual tipo de funcion?rio ?
	//0 - funcionario
	//1 - gerente
	//2 - diretor
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	//A BONIFICA??O MUDA DE ACORDO COM O TIPO DE FUNCIONARIO
	public double getBonificacao() {
		if(this.tipo == 0) {
			return this.salario * 0.1;
		} else if(this.tipo == 1) {
			return this.salario;
		} else {
			return this.salario + 1000.00;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
