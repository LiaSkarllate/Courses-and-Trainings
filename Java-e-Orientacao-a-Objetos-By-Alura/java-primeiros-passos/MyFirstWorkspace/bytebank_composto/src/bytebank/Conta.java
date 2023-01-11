package bytebank;

public class Conta {
	// Atributos:
	double saldo;
	int agencia/* = 42 */; // O valor padrão de atributos pode ser alterado.
	int numero;
	// É preciso ter cuidado com atributos de referência não inicializados.
	private Cliente titular /*new Cliente()*/; // Toda nova conta é de um cliente novo?

	// Métodos:
	void deposita(double valor) {
		this.saldo += valor; // Embora seja opcional, usar sempre a referência this é uma boa prática.
	}

	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);	
			return true;
		} else {
			return false;
		}
	}
}