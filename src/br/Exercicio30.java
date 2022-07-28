package br;

import java.util.Scanner;

public class Exercicio30 {
	
	public static void main(String[]args) {
		
		float[]vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 5; i ++) {
		System.out.printf("Informe o %dº valor para o vetor: ", i + 1);
		vetor[i] = teclado.nextFloat();
	    }
		System.out.println("Informe o código: ");
	    codigo = teclado.nextInt();
	    
	    while (codigo < 0 || codigo > 2) {
	    	System.out.println("Código não encontrado.");
	    	System.out.println("Informe o código: ");
		    codigo = teclado.nextInt();
		}
	    if (codigo == 0){
	    	System.out.println("Programa encerrado.");
	    }else if (codigo == 1) {
	    	for (Float n : vetor) {
	    		System.out.println(n);
	    	}
	    }else if (codigo == 2) {
	    	for (int i = (vetor.length -1); i >= 0; i--) {
	    		System.out.println(vetor[i]);
	    	}
	    }
	    teclado.close();	
	}

}
