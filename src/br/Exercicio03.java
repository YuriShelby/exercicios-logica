package br;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float quantidadeMinima, quantidadeMaxima, estoqueMedio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade m�nima: ");
		quantidadeMinima = teclado.nextFloat();
		System.out.print("Infome a quantidade m�xima: ");
		quantidadeMaxima = teclado.nextFloat();
		
		estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
		
		System.out.print("O estoque m�dio �: " + estoqueMedio);
		
		teclado.close();
	}

}
