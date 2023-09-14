package br.com.alura.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestaWrappers {
	public static void main(String[] args) {
		//int[] ages = new int[5];
		//String[] names = new String[5];
		
		List<Integer> listOfAges = new ArrayList<>();
		
		//Integer age = new Integer(29);
		Integer age = Integer.valueOf(0);
		
		int value = age.intValue(); //Essa conversão de objeto para primitiva é chamada de unboixing.
		
		//De maneira geral, o processo de analisar e de converter strings é chamado de parsing:
		Integer argumentBoxed = Integer. valueOf(args[0]); //"10", por exemplo.
		int argumentUnboxed = Integer.parseInt(args[0]); //"10", por exemplo.
		
		System.out.println(argumentBoxed.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		listOfAges.add(value); //Essa conversão de primitivo para objeto é automática e é chamada de autoboxing.
		listOfAges.add(argumentBoxed);
		listOfAges.add(argumentUnboxed);
	}
}