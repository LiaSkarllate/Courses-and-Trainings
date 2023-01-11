package bytebank;

public class TestaSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);

		System.out.println(conta.saca(200));
		System.out.println(conta.saldo);

		// Usar a interface de um componente, ao invés de acessar as suas implementações
		// internas, é uma boa prática, pois mantém o encapsulamento do componente.

		// Trabalhar com objetos através dos seus métodos, ao invés dos seus atributos,
		// é uma boa prática, pois mantém o encapsulamento do objeto.

		//

		conta.saldo = conta.saldo - 101;
		System.out.println(conta.saldo);
	}
}
