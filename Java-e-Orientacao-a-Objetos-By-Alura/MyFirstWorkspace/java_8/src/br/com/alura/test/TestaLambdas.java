package br.com.alura.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestaLambdas {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("be powerfukl ");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		// Para percorrer a lista:
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		palavras.forEach((s) -> {
		    System.out.println(s);
		});
		
		palavras.forEach(s -> {
		    System.out.println(s);
		});
		
		palavras.forEach(s -> System.out.println(s));
		
		// Para ordenar a lista:
		palavras.sort((s1, s2) -> {
		    if (s1.length() < s2.length())
		        return -1;
		    if (s1.length() > s2.length())
		        return 1;
		    return 0;
		});
		
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length());
		});
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		Function<String, Integer> fuction = s -> s.length();
		palavras.sort(Comparator.comparing(fuction));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
	}
}