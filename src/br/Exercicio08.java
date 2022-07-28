package br;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		n = teclado.nextInt();
		
		if (n > 100) {
		System.out.println(n);
		}else {
		System.out.println("0");
		}
		teclado.close();
	}

}
