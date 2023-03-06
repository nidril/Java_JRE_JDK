package bytebankinterfaces;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Senha errada!");
		}
	}
}
