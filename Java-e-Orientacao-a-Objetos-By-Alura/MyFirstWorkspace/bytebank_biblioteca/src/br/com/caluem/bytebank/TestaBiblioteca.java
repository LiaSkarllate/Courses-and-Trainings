package br.com.caluem.bytebank;

import br.com.alura.bytebank.model.Conta;
import br.com.alura.bytebank.model.ContaCorrente;

public class TestaBiblioteca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1423, 534);
		conta.deposita(100.5f);
		
		System.out.println(conta.getSaldo());
	}
}