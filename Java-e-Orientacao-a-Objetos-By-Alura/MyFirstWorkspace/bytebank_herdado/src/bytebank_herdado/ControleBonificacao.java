package bytebank_herdado;

public class ControleBonificacao {
	// Atributos:
	private double soma;
	
	// Métodos:
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	// Getters a setters:
	public double getSoma() {
		return this.soma;
	}
}