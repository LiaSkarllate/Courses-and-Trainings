package alura_mais_enums;

public class TestaEnums {
	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread t = new Thread(() -> System.out.println("Running..."));
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		
		Prioridade pMax = Prioridade.MAX;
		Prioridade pMin = Prioridade.MIN;
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
	}
}
