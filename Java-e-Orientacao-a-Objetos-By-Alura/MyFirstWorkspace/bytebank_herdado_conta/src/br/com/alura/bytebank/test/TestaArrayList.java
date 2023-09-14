package br.com.alura.bytebank.test;

import java.util.ArrayList;

import br.com.alura.bytebank.model.Conta;
import br.com.alura.bytebank.model.ContaCorrente;

public class TestaArrayList {
	public static void main(String[] args) {
		// ArrayLists usam arrays internamente:
		// Genéricos são planejados para evitar problemas de tipagem:
		ArrayList<Conta> lista = new ArrayList<>(); 

		ContaCorrente cc = new ContaCorrente(111, 111);
		lista.add(cc);

		ContaCorrente cc1 = new ContaCorrente(111, 111);
		lista.add(cc1);

		System.out.println("Size = " + lista.size());
		System.out.println(lista.get(0));

		lista.remove(0);

		System.out.println("Size = " + lista.size());

		ContaCorrente cc2 = new ContaCorrente(111, 111);
		lista.add(cc2);

		ContaCorrente cc3 = new ContaCorrente(111, 111);
		lista.add(cc3);

		for (int i = 0; i < lista.size(); i++) {
			// Com essa conversão, o desenvolvedor garante que essa referência é do tipo Conta:
			// Se a conversão falhar, uma CastClassExpection é lançada:
			Conta ref = /*(Conta)*/ lista.get(i); 
			System.out.println(ref);
		}

		System.out.println();

		// Esse laço é internamente igual ao anterior, embora apresente uma sintaxe menos verbosa:
		// Essa nova sintaxe foi introduzida no Java 5:
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
