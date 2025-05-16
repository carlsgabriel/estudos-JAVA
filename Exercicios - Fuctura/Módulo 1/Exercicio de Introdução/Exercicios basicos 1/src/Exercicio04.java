import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia o número de horas trabalhadas por um funcionário
		  e o valor da hora de trabalho e escreva o salário bruto desse funcionário.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de horas trabalhadas: ");
		double qtdHoras = scan.nextDouble();
		System.out.print("Insira o valor da hora: ");
		double valorHoras = scan.nextDouble();
		
		double salarioBruto = qtdHoras * valorHoras;
		
		System.out.printf("Salário bruto: R$%.2f%n", salarioBruto);
		
		scan.close();
		
	}

}
