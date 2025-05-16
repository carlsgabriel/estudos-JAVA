import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia o peso de uma encomenda (em kg) e escreva
		  o valor do frete (considerando que cada kg custa R$5,00).*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o peso da encomenda? ");
		double peso = scan.nextDouble();
		
		double frete = (peso >= 1) ? peso * 5.0 : 5.0;
		
		System.out.printf("O valor do frete é R$%.2f reais.%n", frete);
		
		scan.close();
		
	}

}