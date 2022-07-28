package br;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = teclado.nextInt();
		
		if (num == 0) {
		    System.out.printf("O número %d é neutro.", num);
		}else if (num %2 == 0 && num > 0) {
		    System.out.printf("O número %d é par e positivo.", num);
		}else if (num %2 == 0 && num < 0) {
			System.out.printf("O número %d é par e negativo.", num);
		}else if (num %2 != 0 && num > 0) {
			System.out.printf("O número %d é ímpar e positivo.", num);
		}else if (num %2 != 0 && num < 0) {
			System.out.printf("O número %d é ímpar e negativo.", num);
		}
		teclado.close();	
			
	}

}

