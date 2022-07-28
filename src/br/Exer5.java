package br;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		int velocidade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor da velocidade: ");
		velocidade = teclado.nextInt();
		
		if (velocidade > 80 && velocidade <= 90) {
			System.out.println("Levou multa leve.");
		}else if (velocidade > 90 && velocidade <= 100) {
			System.out.println("Levou multa grave.");
		}else if (velocidade > 100) {
			System.out.println("Levou multa gravíssima.");
		}else {
			System.out.println("Não houve multa.");
		}
		teclado.close();
	}

}
