package br;

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, maior = -9999;
		
		for (int i = 0; i < 3; i ++) {
			
			System.out.printf("Informe o %dº número: ",i +1);
			num = teclado.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		
		}System.out.printf("O maior número é o %d.", maior);
		
		teclado.close();	
	}

}
