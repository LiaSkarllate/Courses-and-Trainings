package br.com.alura.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import br.com.alura.model.Curso;

public class TestaStreams {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println(x));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		IntStream stream = cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .mapToInt(Curso::getAlunos);
		
		int soma = cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .mapToInt(Curso::getAlunos)
		   .sum();
	}
}