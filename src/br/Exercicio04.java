package br;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = teclado.nextInt();
		System.out.println("O resultado da soma �: " + (num1 + num2));
		
		teclado.close();
	}

}
