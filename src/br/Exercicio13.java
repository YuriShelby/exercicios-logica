package br;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int codigo, horasTrabalhadas;
		float horas, horasExtras;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		horasTrabalhadas = teclado.nextInt();
		
		if (horasTrabalhadas > 50) {
			horasExtras = ((float) horasTrabalhadas - 50) * (float) 20.00;
			horas = 50 * (float) 10.00;
			System.out.printf("Seu salário total é de R$ %.2f. O valor recebido por horas extras foi R$ %.2f.", (horasExtras + horas), horasExtras);
		}else {
			horas = ((float) horasTrabalhadas * (float) 10.00);
			System.out.printf("Seu salário total é de R$ %.2f. Não houve horas excedentes nesse mês.", horas);
		}
		teclado.close();
	}

}
