package br.com.alura.bytebank.test;

import br.com.alura.bytebank.model.CalculadorDeImposto;
import br.com.alura.bytebank.model.ContaCorrente;
import br.com.alura.bytebank.model.SeguroDeVida;

public class TestaTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}
}