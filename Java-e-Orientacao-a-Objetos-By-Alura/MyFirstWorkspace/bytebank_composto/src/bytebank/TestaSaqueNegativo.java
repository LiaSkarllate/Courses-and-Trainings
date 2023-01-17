package bytebank;

public class TestaSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);

		System.out.println(conta.saca(200));

		// Usar a interface de um componente, ao invés de acessar as suas implementações
		// internas, é uma boa prática, pois mantém o encapsulamento do componente.

		// Trabalhar com objetos através dos seus métodos, ao invés de acessar os seus
		// atributos, é uma boa prática, pois mantém o encapsulamento do objeto.

		System.out.println(conta.getSaldo());
	}
}