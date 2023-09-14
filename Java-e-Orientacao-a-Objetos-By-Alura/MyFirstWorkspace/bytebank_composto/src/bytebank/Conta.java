package bytebank;

public class Conta {
	// Atributos:
	private double saldo;
	int agencia/* = 42 */; // O valor padrão de atributos pode ser alterado.
	int numero;
	// É preciso ter cuidado com atributos de referência não inicializados, pois não nulo por padrão.
	private Cliente titular /*new Cliente()*/; // Toda nova conta é de um cliente novo?

	// Métodos:
	void deposita(double valor) {
		this.saldo += valor; // Embora seja opcional, usar sempre que possível a referência this é uma boa prática.
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
	
	// Getters e setters:
	public double getSaldo() {
		return this.saldo;
	}
	
	// Nesse caso, para o atributo "saldo", o uso de um método modificador (do
	// inglês, setter) não faz sentido, pois já há metodos suficientes para lidar
	// com esse atributo.
}