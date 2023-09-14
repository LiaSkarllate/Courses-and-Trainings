package br.com.alura.bytebank.test;



public class TestaStrings {
	public static void main(String[] args) {
		// Uma String é uma classe imutável.
		String str = "Alura"; // Isso é um objeto literal (do inglês, "object literal").  
		// String st2 = new String("Alura"); // Embora seja compilável, usar o construtor da classe String é uma má prática.
	
		String str2 = str.replace('A', 'a');
		// String str2 = str.replace("Al", "aL");
		
		String str3 = str.toLowerCase();
		// String str3 = str.toUpperCase();
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf("u"));
		System.out.println(str.substring(1));
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.trim());
		System.out.println(str.contains("lu"));
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}
}