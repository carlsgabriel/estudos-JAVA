import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args){

        /*Escreva um programa que leia um número inteiro entre 1 e 7 e mostre o dia da semana correspondente. Se o número não estiver nesse intervalo, mostre uma mensagem de erro.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de 1-7: ");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor inválido... digite de 1-7.");
                break;
        }
        
        scan.close();

    }


}
