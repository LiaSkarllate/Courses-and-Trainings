package bytebank_herdado;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2444);
		
		Cliente cl = new Cliente();
		// cl.setSenha(8888);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cl);
	}
}