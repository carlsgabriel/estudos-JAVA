import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia a cotação do dólar e um valor em reais 
		  e escreva o valor convertido em dólares.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a cotação do dolar: ");
		double cotacao = scan.nextDouble();
		System.out.print("Insira o valor em reais que vai ser convertido em dolares: ");
		double reais = scan.nextDouble();
		
		double dolares = reais / cotacao;
		
		System.out.printf("Você terá %.2f dolares.%n", dolares);
		
		scan.close();
		
	}

}