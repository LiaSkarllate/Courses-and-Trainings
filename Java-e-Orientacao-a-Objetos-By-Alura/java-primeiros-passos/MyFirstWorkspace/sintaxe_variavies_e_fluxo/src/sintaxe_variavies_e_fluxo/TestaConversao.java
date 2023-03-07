package sintaxe_variavies_e_fluxo;

public class TestaConversao {
	public static void main(String args[]) {
		double salario = 1270.50;

		// Conversão explícita:
		int valor = (int) salario;
		// É preciso ter cuidado ao converter tipos, dado que o compilador apenas o
		// deixa fazê-lo explicitamente.

		System.out.println(valor);

		double valorPromovido = 3; // Isso é uma promoção de tipo: de inteiro para ponto flutuante.

		System.out.println(valorPromovido);

		// long numeroGrande = 8323983901283091283l;
		// short numeroPequeno = 2422;
		// byte numeroMenorAinda = 120;
	}
}