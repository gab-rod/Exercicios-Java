package exercicioscontrole;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
// Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime 
// no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime
// no console "Reprovado".
		
	Scanner entrada = new Scanner(System.in);
	double media = 0;
	
		System.out.print("Informe a primeira nota do aluno: ");
			double nota1 = entrada.nextDouble();
		 
		System.out.print("Informe a segundo nota do aluno: ");
			double nota2 = entrada.nextDouble();
			
		media = (nota1+nota2)/2;
		
		if (media >= 7.0 && media <= 10.0) {
			System.out.println("Aprovado!");
		} else if (media < 7.0 && media >= 4.0) {
			System.out.println("Recuperação!");
		} else if (media < 4.0 && media >= 0.0) {
			System.out.println("Reprovado!");
		}	else {
			System.out.println("Nota incorreta"); }
		
		entrada.close();
		
	}
}
