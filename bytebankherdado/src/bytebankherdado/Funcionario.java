package bytebankherdado;

//a classe funcionario só trará os parametros
//mas não podemos criar um funcionario que seja so funcionario
//todos tem uma funcao por isso a classe é abstrata
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	//metodo abstrato não tem implementação, seus filhos que fazem
	public abstract double getBonificacao();
	
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
