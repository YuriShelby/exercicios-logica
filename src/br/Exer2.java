package br;

import java.util.Scanner;

public class Exer2 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um n�mero: ");
		num = teclado.nextInt();
		
		while (num <= 0) {
			System.out.println("Apenas n�meros inteiros e positivos.");
			System.out.println("Informe um n�mero: ");
			num = teclado.nextInt();
		}
		int vari = num;
		
		while (vari > 1) {
			num = num * (vari - 1);
			vari--;	
		}
		System.out.printf("O resultado � %d.", num);
		
		teclado.close();
	}

}
