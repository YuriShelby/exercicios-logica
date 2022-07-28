package br;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		float valor_hora, horas_trabalhadas, total;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		valor_hora = teclado.nextFloat();
		System.out.println("Informe quantas horas você trabalhou no mês: ");
		horas_trabalhadas = teclado.nextFloat();
		total = valor_hora * horas_trabalhadas;
		System.out.printf("O total do seu salário neste mês é de R$ %.2f", total);
		
		teclado.close();
	}

}