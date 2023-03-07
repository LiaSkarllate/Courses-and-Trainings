package bytebank_herdado_conta;

public abstract class Conta {
	// Atributos (de instância):
	private double saldo;
	private int agencia/* = 42 */; // O valor padrão de atributos pode ser alterado.
	private int numero;
	// É preciso ter cuidado com atributos de referência não inicializados, pois não nulo por padrão.
	// Isso é uma composição:
	private Cliente titular /* = new Cliente()*/; // Toda nova conta é de um cliente novo?

	// Atributos (de classe):
	private static int total = 0;
	
	// Construtores:
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("Total of Conta = " + Conta.getTotal());
		
		this.setAgencia(agencia);
		this.setNumero(numero);
	}
	
	public Conta() {
		
	}
	
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
	
	// Getters e setters:
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	// Nesse caso, para o atributo "saldo", o uso de um método modificador (do
	// inglês, setter) não faz sentido.
}