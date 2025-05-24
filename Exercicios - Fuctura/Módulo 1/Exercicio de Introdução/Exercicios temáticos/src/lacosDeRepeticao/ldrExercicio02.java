import java.util.Scanner;

public class ldrExercicio02 {

    public static void main(String[] args){

        /*Seu Alfredo precisa calcular o valor total das latas de tinta vendidas em um dia.
        Para isso, crie um programa que deve perguntar quantas latas foram vendidas e o preço de cada uma, repetindo o processo até que todos os preços 
        sejam informados, e exibindo o total no final.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas latas foram vendidas? ");
        int qtd = scan.nextInt();

        double sum = 0;

        for(int i=0;i<qtd;i++){
            System.out.print("Insira o preço da " + (i+1) + "º lata: ");
            double preco = scan.nextDouble();
            sum += preco;
        }

        System.out.println();
        System.out.printf("Preço total: R$%.2f reais.", sum);

        scan.close();

    }

}