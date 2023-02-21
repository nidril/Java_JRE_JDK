package bytebankencapsulado;


//a classe conta e seus atributos s� podem ser acessados atrav�s
//dela mesma ou pelos M�TODOS

class Conta {
	private double saldo;
	// deixar o atributo privado impede que ele seja modificado
	// LIDO, ou alterado fora da sua classe
	private int agencia;
	private int numero;
	private Cliente titular;
	//CALCULAR O TOTAL DE CONTAS ABERTAS
	private static int total;
	//o static garante que esse atributo � da classe
	//ele n�o pertence ao objeto
	
//CONSTRUTOR ------>
	public Conta(int agencia, int numero) {
		Conta.total++;
		// cada vez que uma conta � aberta soma 1
		System.out.println("O total de contas � " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando a conta " +  this.numero);
	}
	//agora o construtor automatico Conta() n�o ir� mais funcionar
	//sem que sejam passados os parametros definidos aqui, agencia e numero
	
//METODOS ------>
	public double getSaldo() {
		return this.saldo;
	}
	//acessar o saldo
	
	public void deposita(double valor) {
		this.saldo += valor;
		//usamos this para referenciar o atributo a conta em uso
		//� opcional porem � bom utilizar dentro do metodo
	}
	//esse comportamento n�o devolve nada, por isso void
	//depositar na conta
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}
	//saca da conta
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	//transfere da conta
	
	public int getNumero() {
		return this.numero;
	}
	//devolve o numero da conta
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valores negativos");
			return;
		}
		this.numero = numero;
	}
	//altera o numero da conta para um novo
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valores negativos");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	
	
}


// tipo Conta:
//	saldo
//	agencia
// 	numero
//	titular

//a conta � a classe
//esses s�o os ATRIBUTOS da classe conta
//as contas em si ser�o os
//objetos criados com esse par�metro
//se o atributo da classe n�o for definido
//ele ter� os valores default, 0 para numeros

//COMPORTAMENTOS = METODOS