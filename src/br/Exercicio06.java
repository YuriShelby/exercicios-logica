package br;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		float valor_hora, horas_trabalhadas, total;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		valor_hora = teclado.nextFloat();
		System.out.println("Informe quantas horas voc� trabalhou no m�s: ");
		horas_trabalhadas = teclado.nextFloat();
		total = valor_hora * horas_trabalhadas;
		System.out.printf("O total do seu sal�rio neste m�s � de R$ %.2f", total);
		
		teclado.close();
	}

}