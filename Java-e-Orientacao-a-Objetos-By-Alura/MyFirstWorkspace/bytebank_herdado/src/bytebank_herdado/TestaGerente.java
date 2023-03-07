package bytebank_herdado;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("William");
		g1.setCpf("456789123-89");
		g1.setSalario(5000.0);
		g1.setSenha(55);
		
		boolean autenticou = g1.autentica(55);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	}
}