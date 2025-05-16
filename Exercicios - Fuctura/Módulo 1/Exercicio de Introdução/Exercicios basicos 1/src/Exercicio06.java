import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia a quantidade de litros de água consumidos 
		  por uma residência em um mês e escreva o valor da conta de água 
		  (considerando que cada litro de água custa R$0,02).*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de água consumida mensalmente? ");
		double qtd = scan.nextDouble();
		
		double conta = (qtd >= 1) ? qtd * 0.02 : 0.02;
		
		System.out.printf("O valor da conta é R$%.2f reais.%n", conta);
		
		scan.close();
		
	}

}