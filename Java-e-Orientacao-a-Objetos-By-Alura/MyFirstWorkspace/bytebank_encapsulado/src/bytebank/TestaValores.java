package bytebank;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2455);
		Conta conta2 = new Conta(1337, 3236);
	
		// Nesse ponto, embora sintaticamente correta, a conta está inconsistente com as
		// regras de negócio.
		
		conta.setAgencia(-5);
		conta.setNumero(0);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		System.out.println(Conta.getTotal());
	}
}
