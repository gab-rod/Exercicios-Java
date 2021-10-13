package exercicioscontrole;

import java.util.Scanner;

public class Exercicio7 {
 
	public static void main(String[] args) {
	
// Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
// caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		System.out.println("Bem-vindo ao jogo. Todos os números informados serão somados. Para encerrar o jogo basta digitar um número negativo.");
		
		do {
			System.out.print(" Digite um número: ");
		numero = entrada.nextInt();
		
		if (numero >= 0) {
		soma = soma + numero;
		System.out.println("Soma = " +soma);
		}
		
		} while (numero >= 0);
		System.out.println("Você encerrou a soma, o resultado final é: " +soma);
	}
}
