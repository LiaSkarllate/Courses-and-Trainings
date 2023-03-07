package sintaxe_variavies_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais...");
		
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) { // Separar a palavra-chave if da condição é usual.
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem-vindo");
		} else { // Separar a palavra-chave else das chaves é usual.
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar por estar acompanhado.");
			} else {
				System.out.println("Infelizmente, você não pode entrar.");
			}
		}

		// Embora seja opcional se a instrução (if, for, while, etc) em apenas uma instrução, usar sempre as
		// chaves é uma boa prática.
	}
}
