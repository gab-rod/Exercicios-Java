package exercicioscontrole;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int numero = entrada.nextInt();
		
		if (numero <= 10 && numero >= 0 && numero % 2 == 0) {
			
			System.out.println("Número é "+ numero +" e é par");
		}
		else 
			System.out.println("Número inválido.");
			
		entrada.close();
	}
}
