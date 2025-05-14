import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*Crie um programa que leia o preço de dois produtos e escreva o valor 
		  total da compra. Lembre-se que valores são números fracionados,
		  ou seja, declare-os com o tipo double.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o preço do primeiro produto: ");
		double produto = scan.nextDouble();
		System.out.print("Insira o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		double valorTotal = produto + produto2;
		
		System.out.printf("Valor total da compra R$%.2f reais.%n", valorTotal);
		
		scan.close();
		
	}
	
	
	
}