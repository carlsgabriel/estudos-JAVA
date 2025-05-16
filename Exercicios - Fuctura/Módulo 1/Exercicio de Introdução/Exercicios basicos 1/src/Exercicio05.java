import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia o valor de um empréstimo, a taxa de juros mensal
		  e o número de meses e escreva o valor da parcela mensal do empréstimo.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor: ");
		double valor = scan.nextDouble();
		System.out.print("Taxa de juros mensal: ");
		double taxa = scan.nextDouble();
		System.out.print("Quantidade de meses: ");
		int meses = scan.nextInt();
		
		double parcelaMensal = (valor + (valor * (taxa / 100))) / meses;
		
		System.out.printf("Serão %d parcelas de R$%.2f reais.%n", meses, parcelaMensal);
		
		scan.close();
	}
	
	//Não sei se o programa está certo por causa da formula...

}
