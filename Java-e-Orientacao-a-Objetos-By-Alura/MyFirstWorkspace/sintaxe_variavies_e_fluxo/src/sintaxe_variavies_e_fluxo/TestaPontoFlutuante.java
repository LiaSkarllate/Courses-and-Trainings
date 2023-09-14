package sintaxe_variavies_e_fluxo;

public class TestaPontoFlutuante {
	public static void main(String args[]) {
		double salario; // Separar a declaração da atribuição é não usual.
		salario = 1250.70;

		System.out.println("O meu salário é " + salario + " reais.");

		// Conversão implícita:
		double idade = 37; // Um tipo inteiro cabe em um tipo de ponto flutuante.

		System.out.println(idade);

		double divisao = 3.14 / 2;
		int outraDivisao = 5 / 2; // Uma operação apenas com tipos inteiros resulta em um tipo inteiro.
		double novaTentativa = 5 / 2;
		double maisUmaTentativa = 5.0 / 2; // Uma operação com diferentes tipos resulta no tipo de maior escopo.

		System.out.println(divisao);
		System.out.println(outraDivisao);
		System.out.println(novaTentativa);
		System.out.println(maisUmaTentativa);
	}
}