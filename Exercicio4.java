package exercicioscontrole;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

// Criar um programa que receba um número e diga se ele é um número primo.
		
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
			int num = entrada.nextInt();
		
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				contador++;
		}
	}
		
		if (contador == 0) {
			System.out.println("O número " + num + " é primo");
		} else {
			System.out.println("O número " + num + " não é primo");
		}
		
			entrada.close();
	}
}
