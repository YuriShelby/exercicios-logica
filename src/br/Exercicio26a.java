package br;

import java.util.Scanner;

public class Exercicio26a {
	
	public static void main(String[]args) {
		
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] vetor3 = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i ++) {
			System.out.printf("Informe o %dº valor para o vetor 1: ", i + 1);
			vetor1[i] = teclado.nextInt();
			
			System.out.printf("Informe o %dº valor para o vetor 2: ", i + 1);
			vetor2[i] = teclado.nextInt();
			
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		for (int i = 0; i < 10; i ++) {
			System.out.println(vetor3[i]);
		}
		teclado.close();
	}

}
