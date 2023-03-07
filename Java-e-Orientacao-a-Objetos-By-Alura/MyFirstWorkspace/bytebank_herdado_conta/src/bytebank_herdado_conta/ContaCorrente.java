package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {
	// Construtores:
		// Construtorers não são herdados da classe-mãe.
	public ContaCorrente() {
		//super(); // A chamada ao construtor padrão da classe-mãe é implícita.
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); 
	}
	
	// Métodos:
	@Override
	boolean saca(double valor) {
		double valorASacar = valor + 0.2d;
		return super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01d;
	}
}
