package bytebank_herdado;

public class EditorVideo extends Funcionario{
	@Override
	public double getBonificacao() {
		System.out.println("Chamando getBonificacao() do EditorVideo...");
		return 150;
	}
}