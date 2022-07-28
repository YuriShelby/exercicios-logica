package br;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int codigo, horasTrabalhadas;
		float horas, horasExtras;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o c�digo: ");
		codigo = teclado.nextInt();
		System.out.println("Informe o n�mero de horas trabalhadas no m�s: ");
		horasTrabalhadas = teclado.nextInt();
		
		if (horasTrabalhadas > 50) {
			horasExtras = ((float) horasTrabalhadas - 50) * (float) 20.00;
			horas = 50 * (float) 10.00;
			System.out.printf("Seu sal�rio total � de R$ %.2f. O valor recebido por horas extras foi R$ %.2f.", (horasExtras + horas), horasExtras);
		}else {
			horas = ((float) horasTrabalhadas * (float) 10.00);
			System.out.printf("Seu sal�rio total � de R$ %.2f. N�o houve horas excedentes nesse m�s.", horas);
		}
		teclado.close();
	}

}
