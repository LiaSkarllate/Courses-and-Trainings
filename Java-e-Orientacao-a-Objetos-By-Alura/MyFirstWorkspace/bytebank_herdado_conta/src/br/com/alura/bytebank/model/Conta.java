package br.com.alura.bytebank.model;

/**
 * Classe que representa a forma de uma conta bancária.
 * 
 * @author william
 * @version 0.1
 */
public abstract class Conta implements Comparable<Conta>{
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
	/**
	 * Construtor para inicializa um objeto Conta dada uma agência e um número.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("Total of Conta = " + Conta.getTotal());
		
		this.setAgencia(agencia);
		this.setNumero(numero);
	}
	
	public Conta() {
		
	}
	
	// Métodos:
	public void deposita(double valor) {
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

	public boolean transfere(double valor, Conta destino) {
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
	
	//O método equals é utilizado pelas listas, como ArrayList e LinkedList, no Java:
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Conta other = (Conta) obj;
		return	agencia == other.agencia && 
				numero == other.numero;
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
	}
	
	// Define a "ordem natural" da classe:
	@Override
	public int compareTo(Conta outra) {
		return Integer.compare(this.numero, outra.numero);
	}
}