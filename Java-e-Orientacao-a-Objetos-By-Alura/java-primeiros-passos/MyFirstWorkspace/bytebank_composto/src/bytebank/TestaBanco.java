package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente william = new Cliente();
		william.nome = "William Fernandes Dorante";
		william.cpf = "22222222222";
		william.profissao = "Programador";

		Conta contaDoWilliam = new Conta();
		contaDoWilliam.deposita(100);

		// Associação de um Cliente a uma Conta (composição):
		// contaDoWilliam.titular = william;

		System.out.println(william);
		// System.out.println(contaDoWilliam.titular);
		// System.out.println(contaDoWilliam.titular.nome);
	}
}
