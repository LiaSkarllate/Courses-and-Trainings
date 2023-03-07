package bytebank_encapsulado;

public class TestaGettersSetters {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 25);
		conta.setNumero(7113);
		
		System.out.println(conta.getNumero());
	
		Cliente cliente = new Cliente();
		cliente.setNome("William");
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("William Fernandes Dorante");
		conta.getTitular().setProfissao("Desenvolvedor");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
	}
}