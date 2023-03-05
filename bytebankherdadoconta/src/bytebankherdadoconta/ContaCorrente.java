package bytebankherdadoconta;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		 super(agencia, numero);
	}
	
	//a conta corrente terá um saque diferenciado
	//no caso ele terá uma taxa de 0.2 por saque
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
}
