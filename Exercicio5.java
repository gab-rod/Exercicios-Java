package exercicioscontrole;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

// Refatorar o exercício 04, utilizando a estrutura switch.
		
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
			int num = entrada.nextInt();
		
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				contador++;
		}
	}
		
		switch (contador) {
		case 0:		
			System.out.println("O número " + num + " é primo");
	break;
	
		default:	
			System.out.println("O número " + num + " não é primo");
		}
		
			entrada.close();
	}
}