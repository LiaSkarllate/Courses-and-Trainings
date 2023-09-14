package br.com.alura.bytebank.test;

import br.com.alura.bytebank.model.ContaCorrente;
import br.com.alura.bytebank.model.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(111, 112);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}