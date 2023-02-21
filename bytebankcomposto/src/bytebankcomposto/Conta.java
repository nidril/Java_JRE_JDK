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
	//como o saldo agora é privado precisa do método para acessar ele
	
	
	public void deposita(double valor) {
		this.saldo += valor;
		//usamos this para referenciar o atributo a conta em uso
		//é opcional porem é bom utilizar dentro do metodo
	}
	//esse comportamento não devolve nada, por isso void
	
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

//a conta é a classe
//esses são os ATRIBUTOS da classe conta
//as contas em si serão os
//objetos criados com esse parâmetro
//se o atributo da classe não for definido
//ele terá os valores default, 0 para numeros

//COMPORTAMENTOS = METODOS