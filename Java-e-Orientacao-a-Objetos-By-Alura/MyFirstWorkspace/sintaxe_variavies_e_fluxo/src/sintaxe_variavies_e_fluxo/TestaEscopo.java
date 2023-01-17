package sintaxe_variavies_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais...");

		int idade = 20;
		int quantidadePessoas = 3;

		// Variáveis locais/temporárias de um método, diferente de atributos de uma
		// classe, não tem valor padrão e precisam estar inicilizadas antes de serem usadas.

		boolean acompanhado;
		// System.out.println(acompanhado);

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) { // Separar a palavra-chave if da condição é usual.
			System.out.println("Seja bem-vindo.");
		} else { // Separar a palavra-chave else das chaves é usual.
			System.out.println("Infelizmente, você não pode entrar.");
		}

		// Embora seja opcional se if ou o else tem apenas uma instrução, usar sempre as
		// chaves é uma boa prática.
	}
}