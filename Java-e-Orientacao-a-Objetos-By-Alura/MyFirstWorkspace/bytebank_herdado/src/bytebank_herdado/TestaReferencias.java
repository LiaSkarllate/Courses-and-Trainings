package bytebank_herdado;

public class TestaReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSalario(2500);
		
		//Funcionario f1 = new Funcionario();
		//f1.setSalario(2000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(3000);
		
		Designer d1 = new Designer();
		d1.setSalario(3000);
		
		// A herança da POO permite a reutilização de código e o poliformismo.
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		//controle.registra(f1);
		controle.registra(ev1);
		controle.registra(d1);

		System.out.println(controle.getSoma());
	}
}