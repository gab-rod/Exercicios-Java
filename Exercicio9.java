package exercicioscontrole;

import java.util.Scanner;

public class Exercicio9 {
 public static void main(String[] args) {
	 
// Crie um programa que recebe 10 valores e ao final imprima o maior n�mero.
	 
	 Scanner entrada = new Scanner (System.in);
	 
	 int qtdnumero;
	 int numero;
	 int maiornumero = 0;
	 
	 System.out.println("Come�ou o jogo. Informe 10 n�meros e ao final diremos qual foi o maior n�mero informado.");
	 qtdnumero = 0;
	 
	 do {
		 qtdnumero++;
		 System.out.printf("%d� - ", qtdnumero); 
		 System.out.print("Informe o n�mero desejado: ");
		 numero = entrada.nextInt();
		 
		 if (numero > maiornumero)
			 maiornumero = numero;
		 
	 } while (qtdnumero < 10);
	 System.out.println("O maior n�mero digitado foi: "+ maiornumero);
}
}
