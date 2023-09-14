package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class TestaEscrita {
	public static void main(String[] args) throws IOException {
		// Fluxo de saída:
			// Escreve bytes:
		OutputStream os = new FileOutputStream("lorem2.txt"); //Arquivo.
		// OutputStream os = System.out; // Saída padrão.
		// OutputStream is = new Socket("127.0.0.1", 80).getOutputStream(); // Rede.

		// Converte um OutputStream em um Writer:
		Writer osw = new OutputStreamWriter(os); // Escreve caracteres. 
		
		// Armazena caracteres em um buffer de saída:
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdß");
				
		bw.close();
	}
}