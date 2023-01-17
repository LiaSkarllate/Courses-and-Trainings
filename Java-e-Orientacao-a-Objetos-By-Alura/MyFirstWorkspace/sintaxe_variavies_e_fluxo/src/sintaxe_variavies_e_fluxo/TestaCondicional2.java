package sintaxe_variavies_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais...");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) { // Separar a palavra-chave if da condição é usual.
			System.out.println("Seja bem-vindo.");
		} else { // Separar a palavra-chave else das chaves é usual.
			System.out.println("Infelizmente, você não pode entrar.");
		}
	}
}