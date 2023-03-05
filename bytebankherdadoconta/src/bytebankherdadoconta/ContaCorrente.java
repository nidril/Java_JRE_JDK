package bytebankherdadoconta;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		 super(agencia, numero);
	}
	
	//a conta corrente ter� um saque diferenciado
	//no caso ele ter� uma taxa de 0.2 por saque
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
}
