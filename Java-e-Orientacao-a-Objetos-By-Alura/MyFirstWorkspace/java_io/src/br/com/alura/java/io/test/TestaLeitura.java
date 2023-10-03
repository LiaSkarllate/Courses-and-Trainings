package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class TestaLeitura {
	public static void main(String[] args) throws IOException {
		// Fluxo de entrada:
			// Lê bytes:
		InputStream is = new FileInputStream("lorem.txt"); // Arquivo.
		// InputStream is = System.in; // Entrada padrão.
		// InputStream is = new Socket("127.0.0.1", 80).getInputStream(); // Rede.
		
		// Converte um InputStream em um Reader:
		Reader isr = new InputStreamReader(is, "UTF-8"); // Lê caracteres. 
		
		// Armazena caracteres em um buffer de leitura:
		BufferedReader br = new BufferedReader(isr); 
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	
		br.close();
	}
}