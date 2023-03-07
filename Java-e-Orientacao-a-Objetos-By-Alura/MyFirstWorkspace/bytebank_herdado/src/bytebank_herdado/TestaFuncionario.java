package bytebank_herdado;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("1234567789-20");
		nico.setSalario(2500.5);
		
		System.out.println(nico.getBonificacao());
	}
}
