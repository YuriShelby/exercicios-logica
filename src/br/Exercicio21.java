package br;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		int num, maior = 0, menor = 9999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Informe o %d� n�mero: \n", i);
			num = teclado.nextInt();
			while (num <= 0){
				System.out.println("O valor deve ser inteiro e positivo.");
				System.out.printf("Informe o %d� n�mero: \n", i);
				num = teclado.nextInt();
			}if (num > 0){
			    if (num > maior) {
				    maior = num;}
			    if (num < menor) {
				    menor = num;
				    }
			}   soma = soma + num;
		}
		media = soma / 10f;
		
		System.out.printf("O maior n�mero � o %d\n", maior);
		System.out.printf("O menor n�mero � o %d\n", menor);
		System.out.printf("A m�dia dos valores � %.2f\n", media);
		
		teclado.close();
	}

}
