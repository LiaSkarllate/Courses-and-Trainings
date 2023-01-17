package sintaxe_variavies_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;

		System.out.println(segundo);

		segundo = primeiro; // Passagem por valor.

		System.out.println(segundo);

		primeiro = 10;

		System.out.println(segundo);
	}
}