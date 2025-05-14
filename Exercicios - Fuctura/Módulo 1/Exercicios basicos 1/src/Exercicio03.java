import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*Crie um programa que leia a distância percorrida por um carro (em km) e o tempo gasto 
		  (em horas) e escreva a velocidade média do carro. 
		  A fórmula de velocidade média é: vm = distancia(em metros) / tempo(em segundos)*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos KM's você percorreu? ");
		int distancia = scan.nextInt();
		System.out.print("Quantas horas levou para você percorrer essa distância? ");
		int tempo = scan.nextInt();
		
		double velocidadeMedia = (double) distancia * 1000 / (tempo * 3600);
		
		System.out.printf("Velocidade média: %.2f%n", velocidadeMedia);
		
		scan.close();
		
	}
	
}