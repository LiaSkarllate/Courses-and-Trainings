package br.com.alura.bytebank.test;

import java.util.ArrayList;

import br.com.alura.bytebank.model.Conta;
import br.com.alura.bytebank.model.ContaCorrente;

public class TestaArrayListEquals {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>(); 

		ContaCorrente cc = new ContaCorrente(22, 11);
		lista.add(cc);

		ContaCorrente cc1 = new ContaCorrente(22, 22);
		lista.add(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		//lista.add(cc2);
		
		System.out.println("Já existe? " + lista.contains(cc2));

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}