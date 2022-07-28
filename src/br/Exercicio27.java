package br;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[]args) {
		
		int[]vetor1 = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i ++) {
			System.out.printf("Informe o %dº valor para o vetor: ", i + 1);
			vetor1[i] = teclado.nextInt();	
		}
		for (int i = (vetor1.length -1); i >= 0; i--) {
			System.out.println(vetor1[i]);
		}
		teclado.close();
	}

}
