package br;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String[]args) {
		
		int defeito1 = 0, defeito2 = 0, defeito3 = 0, defeito4 = 0, total = 0, codigo, defeito;
		float potencia1, potencia2, potencia3, potencia4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código de identificação: ");
		codigo = teclado.nextInt();
		
		while (codigo != 0) {
			System.out.println("Defeitos:");
			System.out.println("1- Necessita de esfera.");
			System.out.println("2- Necessita de limpeza.");
			System.out.println("3- Necessita de troca do cabo ou conector.");
			System.out.println("4- Quebrado ou inutilizado.");
			System.out.println("Informe o tipo de defeito: ");
			defeito = teclado.nextInt();
			
			while (defeito > 4 || defeito < 1) {
				System.out.println("Defeito inexistente!");
				System.out.println("Informe o tipo de defeito: ");
				defeito = teclado.nextInt();	
			}
			if (defeito == 1) {
				defeito1 = defeito1 + 1;
			    total = total + 1;
		    }else if (defeito == 2) {
		    	defeito2 = defeito2 + 1;
			    total = total + 1;
		    }else if (defeito == 3) {
		    	defeito3 = defeito3 + 1;
		    	total = total + 1;
		    }else if (defeito == 4) {
		    	defeito4 = defeito4 + 1;
		    	total = total + 1;
		    }
			System.out.println("Informe o código de identificação: ");
			codigo = teclado.nextInt();
	    }
		potencia1 = (defeito1 * 100f) / total;
		potencia2 = (defeito2 * 100f) / total;
		potencia3 = (defeito3 * 100f) / total;
		potencia4 = (defeito4 * 100f) / total;
	    
	    System.out.printf("Quantidade de mouses: %d\n", total);
	    System.out.println("             Situação                             Quantidade               Percentual");
	    System.out.printf("1- Necessita de esfera                                %d                       %.2f%%\n", defeito1, potencia1);
	    System.out.printf("2- Necessita de limpeza                               %d                       %.2f%%\n", defeito2, potencia2);
	    System.out.printf("3- Necessita de troca do cabo ou conector             %d                       %.2f%%\n", defeito3, potencia3);
	    System.out.printf("4- Quebrado ou inutilizado                            %d                       %.2f%%\n", defeito4, potencia4);
	     
	    teclado.close();
	}

}
