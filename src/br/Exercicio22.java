package br;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[]args) {
		
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do Usuário: ");
		nome = teclado.next();
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		while (nome.equals(senha)){
			System.out.println("A senha deve ser diferente do nome do usuário!");
			System.out.println("Informe a senha: ");
			senha = teclado.next();	
			
		teclado.close();
		
		}
    }

}
