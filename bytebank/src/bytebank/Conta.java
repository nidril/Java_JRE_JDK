package bytebank;

class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//metodos
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