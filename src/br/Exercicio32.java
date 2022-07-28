package br;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio32 {
	
    public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		
		System.out.print("Informe o nome completo: ");
		nome = teclado.nextLine();
		
		nome = nome.toLowerCase();
		
		String normalizer = Normalizer.normalize(nome, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		nome = pattern.matcher(normalizer).replaceAll("");
        
		String[] email = nome.split(" ");
		
		System.out.printf("\n%s.%s@gmail.com", email[0], email[email.length -1]);
		
		teclado.close();
	}

}
