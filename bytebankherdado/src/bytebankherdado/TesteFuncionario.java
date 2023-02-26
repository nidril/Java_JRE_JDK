package bytebankherdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario2 nico = new Funcionario2();
		nico.setNome("Nico Stepot");
		nico.setCpf("014.147.521-85");
		nico.setSalario(2600.00);
		
		System.out.println(nico);
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		nico.setTipo(2);
		System.out.println(nico.getBonificacao());
		
	}
}
