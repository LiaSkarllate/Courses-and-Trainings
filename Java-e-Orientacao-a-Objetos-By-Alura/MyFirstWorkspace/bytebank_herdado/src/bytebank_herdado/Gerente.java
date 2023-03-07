package bytebank_herdado;

// Um gerente é um funcionário e assina o contrato Autenticavel.
public class Gerente extends Funcionario implements Autenticavel  {
	// Atributos:
	private Autenticador autenticador;
	
	// Construtores:
	public Gerente() {
		super();
		this.autenticador = new Autenticador(); // Isso é uma composição.
	}
	
	// Métodos:
	@Override
	public double getBonificacao() {
		System.out.println("Chamando getBonificacao() do Gerente...");
		return super.getSalario(); // Embora seja opcional, usar sempre que possível a referência super é uma boa prática.
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