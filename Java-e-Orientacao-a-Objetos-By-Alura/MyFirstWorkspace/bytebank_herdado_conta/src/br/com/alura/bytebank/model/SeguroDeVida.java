package br.com.alura.bytebank.model;

public class SeguroDeVida implements Tributavel {
	@Override
	public double getValorImposto() {
		return 42d;
	}
}