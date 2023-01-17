package sintaxe_variavies_e_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contator = 0; contator <= 10; contator++) {
				System.out.print(contator * multiplicador);
				System.out.print(" ");
			}

			System.out.println();
		}
	}
}