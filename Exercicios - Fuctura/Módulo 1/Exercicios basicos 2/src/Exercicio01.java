import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){

        /* Escreva um programa que leia um número inteiro do usuário e diga se ele é par ou ímpar.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o número: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }

        scan.close();

    }

}
