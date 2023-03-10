package bytebankcomposto;

class Conta {
	private double saldo;
	// deixar o atributo privado impede que ele seja modificado
	// LIDO, ou alterado fora da sua classe
	int agencia;
	int numero;
	Cliente titular;
	
	//metodos
	public double getSaldo() {
		return this.saldo;
	}
	//como o saldo agora ? privado precisa do m?todo para acessar ele
	
	
	public void deposita(double valor) {
		this.saldo += valor;
		//usamos this para referenciar o atributo a conta em uso
		//? opcional porem ? bom utilizar dentro do metodo
	}
	//esse comportamento n?o devolve nada, por isso void
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
}


// tipo Conta:
//	saldo
//	agencia
// 	numero
//	titular

//a conta ? a classe
//esses s?o os ATRIBUTOS da classe conta
//as contas em si ser?o os
//objetos criados com esse par?metro
//se o atributo da classe n?o for definido
//ele ter? os valores default, 0 para numeros

//COMPORTAMENTOS = METODOS