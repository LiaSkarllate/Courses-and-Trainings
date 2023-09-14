package br.com.alura.bytebank.test;

import br.com.alura.bytebank.model.Conta;
import br.com.alura.bytebank.model.ContaCorrente;
import br.com.alura.bytebank.model.ContaPoupanca;

public class TestaArrays {
	public static void main(String[] args) {
		//Array de tipos primitivos.
		int[] numeros/*[]*/ = new int[5]; 
		int[] numerosFormaLiteral = {1, 2, 3 ,4, 5};
		
		Conta[] contas = new Conta[5]; //Array de referências.
		contas[0] = new ContaCorrente(1, 1);
		contas[1] = new ContaCorrente(2, 2);
		contas[2] = new ContaPoupanca(3, 3);
		
		ContaCorrente /*Conta*/ cc = (ContaCorrente) contas[1];
		
		System.out.println(cc.getNumero());
	}
}
