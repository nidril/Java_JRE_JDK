package bytebankencapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1471, 21458);
		
		conta.setAgencia(-50);
		conta.setNumero(-30);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337, 2147);
		System.out.println(conta2.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
