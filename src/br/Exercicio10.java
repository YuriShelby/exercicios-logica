package br;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int n, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		n = teclado.nextInt();
		
		if (n == 0){
			System.out.println("O n�mero " + n +" � neutro.");
		}if (n %2 == 0 && n != 0){
			p = n;
			System.out.println("O n�mero " + p + " � par.");
		}if (n %2 != 0 && n != 0){
			i = n;
			System.out.println("O n�mero " + i + " � �mpar.");
		}
		teclado.close();

	}

}
