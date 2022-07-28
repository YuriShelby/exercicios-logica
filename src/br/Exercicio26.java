package br;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio26 {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> vetor1 = new ArrayList<Integer>();
		ArrayList<Integer> vetor2 = new ArrayList<Integer>();
		ArrayList<Integer> vetor3 = new ArrayList<Integer>();
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i ++) {
			System.out.printf("Informe o %dº valor para o vetor 1: ", i + 1);
			num1 = teclado.nextInt();
			vetor1.add(num1);
			
			System.out.printf("Informe o %dº valor para o vetor 2: ", i + 1);
			num2 = teclado.nextInt();
			vetor2.add(num2);
			
			num3 = num1 + num2;
			vetor3.add(num3);
		}
		for (Integer n : vetor3) {
			System.out.println(n);
		}

		teclado.close();
	}

}
