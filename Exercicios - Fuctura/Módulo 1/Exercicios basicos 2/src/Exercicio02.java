import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){

        /*Escreva um programa que leia dois números inteiros do usuário e diga qual é o maior, o menor ou se são iguais.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1 + "é o maior número, " + num2 + " é o menor número.");
        } else if (num2 > num1){
            System.out.println(num2 + "é o maior número, " + num1 + " é o menor número.");
        } else {
            System.out.println("Os números são iguais.");
        }


        scan.close();

    }

}
