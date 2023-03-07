package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {
	// Atributos:
	private Autenticador autenticador;
	
	// Construtores:
	public Administrador() {
		super();
		this.autenticador = new Autenticador(); // Isso é uma composição.
	}
	
	// Métodos:
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	// Delegação da implementação à classe Autenticador:
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// Getters e setters:
	@Override
	public int getSenha() {
		return this.autenticador.getSenha();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}