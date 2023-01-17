package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;

		// System.out.println(primeiraConta.saldo);

		// primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;

		System.out.println("A primeira tem " + primeiraConta.saldo);
		System.out.println("A segunda tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}