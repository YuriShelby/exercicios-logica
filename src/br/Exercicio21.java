package br;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		int num, maior = 0, menor = 9999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Informe o %dº número: \n", i);
			num = teclado.nextInt();
			while (num <= 0){
				System.out.println("O valor deve ser inteiro e positivo.");
				System.out.printf("Informe o %dº número: \n", i);
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
		
		System.out.printf("O maior número é o %d\n", maior);
		System.out.printf("O menor número é o %d\n", menor);
		System.out.printf("A média dos valores é %.2f\n", media);
		
		teclado.close();
	}

}
