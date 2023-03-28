package java_pilha;

public class FluxoComError {
	// Método principal:
	public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
        
        System.out.println("Fim do main");
    }

	// Métodos:
    private static void metodo1() {
    	System.out.println("Ini do metodo1");
    	
        // try {
        	metodo2();
		// } catch(ArithmeticException e) {
			// System.out.println(e);
		// }
       
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();	
        System.out.println("Fim do metodo2");
    }
}
