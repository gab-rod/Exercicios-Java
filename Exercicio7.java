package exercicioscontrole;

import java.util.Scanner;

public class Exercicio7 {
 
	public static void main(String[] args) {
	
// Criar um programa que enquanto estiver recebendo n�meros positivos, imprime no console a soma dos n�meros inseridos, 
// caso receba um n�mero negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		System.out.println("Bem-vindo ao jogo. Todos os n�meros informados ser�o somados. Para encerrar o jogo basta digitar um n�mero negativo.");
		
		do {
			System.out.print(" Digite um n�mero: ");
		numero = entrada.nextInt();
		
		if (numero >= 0) {
		soma = soma + numero;
		System.out.println("Soma = " +soma);
		}
		
		} while (numero >= 0);
		System.out.println("Voc� encerrou a soma, o resultado final �: " +soma);
	}
}
