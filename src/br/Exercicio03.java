package br;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float quantidadeMinima, quantidadeMaxima, estoqueMedio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade mínima: ");
		quantidadeMinima = teclado.nextFloat();
		System.out.print("Infome a quantidade máxima: ");
		quantidadeMaxima = teclado.nextFloat();
		
		estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
		
		System.out.print("O estoque médio é: " + estoqueMedio);
		
		teclado.close();
	}

}
