import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia a altura e largura de uma parede (em metros) 
		  e escreva a área da parede e a quantidade de tinta necessária para pintá-la
		  (considerando que cada litro de tinta pinta 2m²).
		  Fórmula para cálculo de área: area = altura * largura;*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a altura da parede? ");
		double altura = scan.nextDouble();
		System.out.print("Qual a largura da parede? ");
		double largura = scan.nextDouble();
		
		double area = altura * largura;
		double qtdTinta = area / 2;
		
		System.out.printf("Área: %.2f%n", area);
		System.out.printf("Quantidade de litro(s) de tinta que serão usados: %.2f%n", qtdTinta);
		
		scan.close();
		
	}

}