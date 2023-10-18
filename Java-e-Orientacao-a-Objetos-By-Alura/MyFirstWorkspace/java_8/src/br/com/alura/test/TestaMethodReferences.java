package br.com.alura.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class TestaMethodReferences {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("be powerfukl ");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		// Para percorrer a lista:
		palavras.forEach(s -> System.out.println(s));
		
		palavras.forEach(System.out::println);
		
		// Para ordenar a lista:
		// Function<String, Integer> f1 = s -> s.length();
		Function<String, Integer> f2 = String::length;
		Comparator<String> comparador = Comparator.comparing(f2);
		
		palavras.sort(comparador);
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
	}
}