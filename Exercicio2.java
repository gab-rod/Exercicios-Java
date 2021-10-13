package exercicioscontrole;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
// Criar um programa informa se o ano atual é um ano bissexto.
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			
			System.out.println("Ano é bissexto.");
		}
		
		else
			System.out.println("Ano não é bissexto.");
		
		entrada.close();
	}
	
}
