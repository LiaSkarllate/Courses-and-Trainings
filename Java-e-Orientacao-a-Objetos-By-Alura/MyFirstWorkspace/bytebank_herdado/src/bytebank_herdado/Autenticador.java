package bytebank_herdado;

public class Autenticador implements Autenticavel{
	// Atributos:
	private int senha;
	
	// Métodos:
	public boolean autentica(int senha) {
		if (this.getSenha() == senha) {
			return true;
		} else {
			return false;
		}
	}

	// Getters e setters:
	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}