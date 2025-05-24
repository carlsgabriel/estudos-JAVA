import java.util.Scanner;

public class ecExercicio01 {

    public static void main(String[] args){

        /*No zoológico, crianças até 12 anos não pagam ingresso, enquanto adultos pagam R$ 20,00 e idosos (acima de 60) pagam metade.
          Escreva um programa que pergunte a idade de uma pessoa e exiba o valor do ingresso.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");
        int idade = scan.nextInt();

        double ingresso;

        if(idade <= 12){
            ingresso = 0;
        } else if (idade > 12 && idade <= 60){
            ingresso = 20;
        } else {
            ingresso = 10;
        }

        System.out.print("O valor do ingresso é: R$" + ingresso + " reais.");

        scan.close();

    }

}
