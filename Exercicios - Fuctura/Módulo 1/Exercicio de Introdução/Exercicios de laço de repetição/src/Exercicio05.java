import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        /*Desenvolva um programa que use um loop while para gerar uma sequência de números pares a partir de 2 e imprima cada número na tela até que o número gerado seja maior do que 20.*/

        Scanner scan = new Scanner(System.in);

        int num = 2;

        while(num <= 20) {
            if(num % 2 == 0) {
                System.out.println(num);
            }
        num++;
        }

    scan.close();

    }

}