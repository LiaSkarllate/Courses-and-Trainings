package br.com.alura.java.io.test;

import java.io.IOException;
import java.io.PrintStream;

public class TestaEscritaPrintStreamOuPrintWriter {
	public static void main(String[] args) throws IOException {
		// Fluxo de saída:
		PrintStream p = new PrintStream("lorem2.txt");
		// PrintWriter p = new PrintWriter("lorem2.txt", "UTF-8");

		p.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		p.println();
		p.println();
		p.println();
		p.println("asfasdfsafdas dfs sdf asf assdß");
				
		p.close();
		
		System.out.println();
	}
}