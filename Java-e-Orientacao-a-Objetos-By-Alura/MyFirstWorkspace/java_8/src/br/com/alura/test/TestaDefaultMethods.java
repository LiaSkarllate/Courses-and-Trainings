package br.com.alura.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestaDefaultMethods {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("be powerfukl");
		palavras.add("don't stop");
		palavras.add("it's hard");
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor); // É um método padrão (do inglês, default method).
		
		// Alternativamente,
		palavras.forEach(new Consumer<String>() {
		    public void accept(String s) {
		        System.out.println(s);
		    }
		});
	}
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}