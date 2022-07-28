package br;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		float altura, peso;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		peso = (float) 72.7 * altura - 58;
		System.out.printf("Seu peso ideal é: %.2f", peso);
		
		teclado.close();		
	}

}
