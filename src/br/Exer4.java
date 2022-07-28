package br;

import java.util.Random;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int valor = random.nextInt(10);
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero de 0 a 10: ");
		num = teclado.nextInt();
		
		while (num < 0 || num > 10) {
			System.out.println("Informe um n�mero de 0 a 10: ");
			num = teclado.nextInt();
		}
		while (num != valor) {
			if (num > valor) {
				System.out.println("Voc� errou, chute maior que o n�mero aleat�rio.");
			    System.out.println("Informe um n�mero de 0 a 10: ");
			    num = teclado.nextInt();
		    }else if (num < valor) {
			System.out.println("Voc� errou, chute menor que o n�mero aleat�rio.");
		    System.out.println("Informe um n�mero de 0 a 10: ");
		    num = teclado.nextInt();
		    }
		}
		if (num == valor) {
			System.out.println("Voc� acertou!");
		}
		teclado.close();
	}

}
