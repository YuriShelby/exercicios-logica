package br;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("O resultado da soma é: " + (num1 + num2));
		
		teclado.close();
	}

}
