package br;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		float peso, excesso, multa;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe o peso dos peixes: ");
		peso = teclado.nextFloat();
		
		if (peso > 50) {
			excesso = (peso - 50);
			multa = (excesso * 4);
			System.out.printf("O valor da sua multa pelo excesso de peso é de R$ %.2f.", multa);
		}else {
			System.out.println("Não existe excesso nem multa a serem pagas.");
		}
		teclado.close();
	}

}
