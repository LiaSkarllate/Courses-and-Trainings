package bytebank_herdado_conta;

public class CalculadorDeImposto {
	// Atributos:
	public double totalImposto;
	
	// Métodos:
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
