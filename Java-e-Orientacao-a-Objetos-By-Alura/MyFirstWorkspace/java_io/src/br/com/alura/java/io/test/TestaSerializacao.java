package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestaSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String nomeEscrito = "Nico Steppat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nomeEscrito);
		oos.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeLido = (String) ois.readObject();
		ois.close();
		System.out.println(nomeLido);
	}
}