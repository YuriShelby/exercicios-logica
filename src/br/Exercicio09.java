package br;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int n, a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		n = teclado.nextInt();
		
		while (n == 0) {
			System.out.println("O n�mero n�o pode ser 0.");
			System.out.println("Informe o n�mero: ");
			n = teclado.nextInt();
		}
		if (n > 0) {
		a = n;
	    System.out.println("N�mero " + a + ", positivo.");
		}else {
		b = n;	
		System.out.println("N�mero " + b + ", negativo.");	
		}
		teclado.close();
	}

}
