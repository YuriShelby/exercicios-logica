package br;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		float metro, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor em m�tro: ");
		metro = teclado.nextFloat();
		resultado = metro * 100;
		System.out.println("O valor em cent�metros �: " + resultado + " cm");
		
		teclado.close();
	}

}
