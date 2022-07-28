package br;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = teclado.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.printf("Infantil A - %d anos.", idade);
		}else if (idade >= 8 && idade <= 11) {
			System.out.printf("Infantil B - %d anos.", idade);
		}else if (idade >= 12 && idade <= 13) {
			System.out.printf("Juvenil A - %d anos.", idade);
		}else if (idade >= 14 && idade <= 17) {
			System.out.printf("Juvenil B - %d anos.", idade);
		}else if (idade >= 18) {
			System.out.printf("Adulto - %d anos.", idade);
		}else {
			System.out.println("Idade insuficiente.");
		}
		teclado.close();
	}

}
