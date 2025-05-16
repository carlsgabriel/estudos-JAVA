import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args){
        
        /*Escreva um programa que leia um ano e diga se ele é bissexto ou não. Um ano é bissexto se ele for divisível por 4, exceto se ele for divisível por 100 e não por 400. 
        Ex: 2000 é bissexto. 2100 não é bissexto. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um ano para saber se ele é bissexto: ");
        int ano = scan.nextInt();

        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }

        scan.close();

    }

}
