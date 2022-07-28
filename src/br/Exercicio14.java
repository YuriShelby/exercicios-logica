package br;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, quadrado1, quadrado2, quadrado3, quadrado4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o 1º número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o 2º número: ");
		num2 = teclado.nextInt();
		System.out.println("Informe o 3º número: ");
		num3 = teclado.nextInt();
		System.out.println("Informe o 4º número: ");
		num4 = teclado.nextInt();
		
		quadrado1 = (int) Math.pow(num1, 2);
		quadrado2 = (int) Math.pow(num2, 2);
		quadrado3 = (int) Math.pow(num3, 2);
		quadrado4 = (int) Math.pow(num4, 2);
		
		if (quadrado3 >= 1000) {
			System.out.println(quadrado3 + " Quadrado de " + num3);
		}else {
			System.out.println(quadrado1 + " Quadrado de " + num1);
			System.out.println(quadrado2 + " Quadrado de " + num2);
			System.out.println(quadrado3 + " Quadrado de " + num3);
			System.out.println(quadrado4 + " Quadrado de " + num4);
		}
		teclado.close();
	}

}
