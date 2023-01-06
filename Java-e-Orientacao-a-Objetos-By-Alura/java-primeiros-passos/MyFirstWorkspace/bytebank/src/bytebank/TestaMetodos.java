package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 100;
		minhaConta.deposita(50);

		// System.out.println(minhaConta.saldo);
		// System.out.println(minhaConta.saca(50));
		// System.out.println(minhaConta.saldo);

		Conta minhaOutraConta = new Conta();
		minhaOutraConta.deposita(100);
		minhaOutraConta.transfere(10, minhaConta);

		System.out.println(minhaOutraConta.saldo);
		System.out.println(minhaConta.saldo);
		
		minhaConta.titular = "William";
		System.out.println(minhaConta.titular);
	}
}