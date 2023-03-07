package alura_mais_enums;

// Uma enumeração é uma classe cujo construtor é privado.
// Uma enumeração cria todas as suas possíveis instâncias e as deixam disponíveis.
public enum Prioridade {
	// O ordinal de cada instância é determinado implicita e sequencialmente a partir do zero, se não definido explicitamente.
	MIN(1), NORM(5), MAX(10); // Cada um é uma instância criada pelo construtor e são todas as instâncias possíveis dessa classe.
	
	// Atributos:
	private int valor;
	
	// Construtores:
	private Prioridade(int valor) {
		this.valor = valor;
	}

	// Getters:
	public int getValor() {
		return this.valor;
	} 
}