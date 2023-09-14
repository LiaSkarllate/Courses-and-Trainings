package br.com.alura.bytebank.test;

import java.util.List;
import java.util.Vector;

import br.com.alura.bytebank.model.Conta;
import br.com.alura.bytebank.model.ContaCorrente;

public class TestaVector {
	public static void main(String[] args) {
		List<Conta> lista = new Vector<Conta>(); //Vector é uma implementação thread-safe de lista no Java.

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