package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaEscritaComFileWriter {
	public static void main(String[] args) throws IOException {
		// Fluxo de saída:
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdß");
				
		bw.close();
	}
}