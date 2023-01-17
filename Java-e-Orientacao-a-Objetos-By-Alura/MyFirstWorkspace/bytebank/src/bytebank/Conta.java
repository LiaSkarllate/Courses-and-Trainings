package bytebank;

public class Conta {
	// Atributos:
	double saldo;
	int agencia/* = 42 */; // O valor padrão de atributos pode ser alterado.
	int numero;
	String titular;

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