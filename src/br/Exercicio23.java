package br;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String[]args) {
		
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 10: ");
		num = teclado.nextInt();
		
		while (num < 1 || num > 10){
			System.out.println("Informe um número de 1 a 10: ");
			num = teclado.nextInt();
		}
		System.out.printf("Tabuada de %d\n", num);
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", num, i,(num * i));
				
		}
		teclado.close();
	}

}
