package bytebank_herdado;

// Uma interface é uma classe abstrata cujos métodos são também abstratos.
// Uma interface é um contrato que quem asina precisa implementatar os seus métodos. 
public abstract interface Autenticavel {
	// Métodos:
	public abstract boolean autentica(int senha);
	
	//Getters and setters:
	public abstract int getSenha();

	public abstract void setSenha(int senha);
}