package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.alura.java.io.model.Cliente;

public class TestaSerializacaoComCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cliente clienteEscrito = new Cliente();
		clienteEscrito.setNome("Nico");
		clienteEscrito.setProfissao("Dev");
		clienteEscrito.setCpf("234113131");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(clienteEscrito);
		oos.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteLido = (Cliente) ois.readObject();
		ois.close();
		System.out.println(clienteLido.getCpf());
	}
}