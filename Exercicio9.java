package exercicioscontrole;

import java.util.Scanner;

public class Exercicio9 {
 public static void main(String[] args) {
	 
// Crie um programa que recebe 10 valores e ao final imprima o maior número.
	 
	 Scanner entrada = new Scanner (System.in);
	 
	 int qtdnumero;
	 int numero;
	 int maiornumero = 0;
	 
	 System.out.println("Começou o jogo. Informe 10 números e ao final diremos qual foi o maior número informado.");
	 qtdnumero = 0;
	 
	 do {
		 qtdnumero++;
		 System.out.printf("%dº - ", qtdnumero); 
		 System.out.print("Informe o número desejado: ");
		 numero = entrada.nextInt();
		 
		 if (numero > maiornumero)
			 maiornumero = numero;
		 
	 } while (qtdnumero < 10);
	 System.out.println("O maior número digitado foi: "+ maiornumero);
}
}
