package br;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		float poluicao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nível de poluição: ");
		poluicao = teclado.nextFloat();
		
		if (poluicao >= 0.3 && poluicao < 0.4) {
			System.out.println("Indústrias do grupo 1, suspendam imediatamente suas atividades.");
		}else if (poluicao >= 0.4 && poluicao < 0.5) {
			System.out.println("Indústrias do grupo 1 e grupo 2, suspendam imediatamente suas atividades.");
		}else if (poluicao >= 0.5) {
			System.out.println("Indústrias do grupo 1, grupo 2 e grupo 3, suspendam imediatamente suas atividades.");
		}else {
		    System.out.println("Poluição aceitável.");
		}
		teclado.close();
	}

}
