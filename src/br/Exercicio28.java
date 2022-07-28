package br;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String[]args) {
		
		int []vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("Informe o %dº valor para o vetor: ", i + 1);
			vetor[i] = teclado.nextInt();
			
			soma = soma + vetor[i];
		}
		System.out.printf("A soma de todos os elementos do vetor é %d", soma);
		
		
		teclado.close();
	}

}