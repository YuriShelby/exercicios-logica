package br;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> vetor1 = new ArrayList<Integer>();
		ArrayList<Integer> vetor2 = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);
		int num;
		boolean cinc = false;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o %dº valor para o vetor: ", i + 1);
			num = teclado.nextInt();
			vetor1.add(num);
			if (num > 50) {
				vetor2.add(num);
			    cinc = true;
			}
		}
		if (cinc == true) {
			for (Integer n : vetor2) {
			System.out.println(n);
			}
		}else if (cinc == false) {
			System.out.println("Não existe número maior que 50 no vetor.");
		}
		teclado.close();
		
	}

}
