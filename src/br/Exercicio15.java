package br;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		num = teclado.nextInt();
		
		if (num == 0) {
		    System.out.printf("O n�mero %d � neutro.", num);
		}else if (num %2 == 0 && num > 0) {
		    System.out.printf("O n�mero %d � par e positivo.", num);
		}else if (num %2 == 0 && num < 0) {
			System.out.printf("O n�mero %d � par e negativo.", num);
		}else if (num %2 != 0 && num > 0) {
			System.out.printf("O n�mero %d � �mpar e positivo.", num);
		}else if (num %2 != 0 && num < 0) {
			System.out.printf("O n�mero %d � �mpar e negativo.", num);
		}
		teclado.close();	
			
	}

}

