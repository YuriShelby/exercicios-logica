package br;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		int num, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		num = teclado.nextInt();
		
		while (num != 0) {
		    if (num > maior) {
		    	maior = num;
			    System.out.println("Informe o n�mero: ");
				num = teclado.nextInt();
		    }
		}
		System.out.printf("O maior n�mero � o %d.\n", maior);
		
		teclado.close();
	}

}
