package java_pilha;

@SuppressWarnings("serial")
// Essa é uma exceção não-checada (do inglês, unchecked):
public class MinhaExcecao extends RuntimeException{
	// Construtores:
	public MinhaExcecao(String message) {
		super(message);
	}
}
