package br;

import java.util.Scanner;

public class Exer2 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número: ");
		num = teclado.nextInt();
		
		while (num <= 0) {
			System.out.println("Apenas números inteiros e positivos.");
			System.out.println("Informe um número: ");
			num = teclado.nextInt();
		}
		int vari = num;
		
		while (vari > 1) {
			num = num * (vari - 1);
			vari--;	
		}
		System.out.printf("O resultado é %d.", num);
		
		teclado.close();
	}

}
