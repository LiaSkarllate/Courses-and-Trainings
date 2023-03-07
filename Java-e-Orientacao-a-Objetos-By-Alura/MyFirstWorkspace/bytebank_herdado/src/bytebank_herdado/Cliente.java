package bytebank_herdado;

public class Cliente implements Autenticavel {
	// Atributos:
	private Autenticador autenticador;
	
	// Construtores:
	public Cliente() {
		super();
		this.autenticador = new Autenticador(); // Isso é uma composição.
	}
	
	// Métodos:
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