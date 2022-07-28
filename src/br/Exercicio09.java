package br;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int n, a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		n = teclado.nextInt();
		
		while (n == 0) {
			System.out.println("O número não pode ser 0.");
			System.out.println("Informe o número: ");
			n = teclado.nextInt();
		}
		if (n > 0) {
		a = n;
	    System.out.println("Número " + a + ", positivo.");
		}else {
		b = n;	
		System.out.println("Número " + b + ", negativo.");	
		}
		teclado.close();
	}

}
