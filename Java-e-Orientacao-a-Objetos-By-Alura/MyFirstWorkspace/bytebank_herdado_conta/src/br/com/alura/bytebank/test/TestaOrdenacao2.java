package br.com.alura.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.bytebank.model.Cliente;
import br.com.alura.bytebank.model.Conta;
import br.com.alura.bytebank.model.ContaCorrente;
import br.com.alura.bytebank.model.ContaPoupanca;

public class TestaOrdenacao2 {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);
		
		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
        List<Conta> lista = new ArrayList<Conta>();  
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        // As seguintes ordenações funcionam a partir do Java 8:
        lista.sort(null); // Usa a "ordem natural".
        lista.sort(new NumeroDaContaComparator());
        lista.sort(new TitularDaContaComparator());
        lista.sort(Comparator.comparing(Conta::getNumero));
        
        // Anteriormente, era da seguinte forma:
        Collections.sort(lista); // Usa a "ordem natural".
        Collections.sort(lista, new NumeroDaContaComparator2());
        Collections.sort(lista, new TitularDaContaComparator2());
        Collections.sort(lista, Comparator.comparing(Conta::getNumero)); // Introduzido no Java 8.
}

// Um arquivo .java geralmente contém uma (1) classe, mas pode conter mais:
class TitularDaContaComparator2 implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator2 implements Comparator<Conta> {
	@Override
	public int compare(Conta c1, Conta c2) {
        if(c1.getNumero() < c2.getNumero()) {
            return -1;
        }

        if(c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        return 0;
    }
}