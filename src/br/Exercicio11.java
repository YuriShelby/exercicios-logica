package br;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		float altura, peso;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		while (sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido.");
			System.out.println("Informe o sexo m/f: ");
			sexo = teclado.next().charAt(0);
	    }if (sexo == 'm') {
			peso = (float) (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é : %.2f", peso);
		}else if (sexo == 'f') {
			peso = (float) (62.1 * altura) - (float) 44.7;
			System.out.printf("Seu peso ideal é : %.2f", peso);
		}
		teclado.close();
   }

}