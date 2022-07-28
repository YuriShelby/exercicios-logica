package br;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[]args) {
		
		int num;
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Informe o %dº número: ", i);
			num = teclado.nextInt();
			vetor.add(num);
			if (num %2 == 0 && num > 0) {
				pares.add(num);
			}
		}
		for (Integer n : pares) {
			System.out.println(n);	
		}
		teclado.close();
	}

}
