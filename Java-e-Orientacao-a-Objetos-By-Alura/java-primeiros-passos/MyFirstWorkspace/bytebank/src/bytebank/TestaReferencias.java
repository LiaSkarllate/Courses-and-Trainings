package bytebank;

public class TestaReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		Conta segundaConta = primeiraConta;

		segundaConta.saldo += 100;

		System.out.println("Saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta é " + segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("Iguais");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
