package bytebank_herdado;

// Essa classe é um conceito abstrato e não concreto. Por isso, não pode ser instanciada.
public abstract class Funcionario {
	// Atributos:
	private String nome;
	private String cpf;
	private double salario;
	
	// Construtores:
	public Funcionario() {}
	
	// Métodos:	
		// Esse método é um comportamento abstrato e não concentro. Por isso, não tem corpo.
		// Deve ser implementado por um filho concreto na hierarquia.
	public abstract double getBonificacao();
	
	// Getters e setters:
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}