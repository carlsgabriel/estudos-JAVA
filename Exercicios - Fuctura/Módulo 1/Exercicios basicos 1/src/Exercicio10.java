import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia o preço à vista de um produto e o 
		  número de parcelas e escreva  o valor de cada parcela 
		  (considerando juros simples de 2% ao mês).*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor do preço à vista: ");
		double aVista = scan.nextDouble();
		System.out.print("Numero de parcelas: ");
		int parcela = scan.nextInt();
		
		double valorParcela = (aVista + (aVista * 0.02)) / parcela;
		
		System.out.printf("Serão %d parcelas de R$%.2f reais.%n", parcela, valorParcela);
		
		scan.close();
		
		//Não sei se o programa está certo por causa da formula...
		
	}

}