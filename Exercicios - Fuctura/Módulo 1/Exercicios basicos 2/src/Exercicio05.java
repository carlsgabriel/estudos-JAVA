import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args){

        /*Escreva um programa que leia o mês do ano em número (1 a 12) e diga quantos dias ele tem. Considere que o ano não é bissexto.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o mês do ano (de 1-12): ");
        int mes = scan.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro tem 31 dias.");
                break;
            case 2:
                System.out.println("Fevereiro tem 28 dias.");
                break;
            case 3:
                System.out.println("Março tem 31 dias.");
                break;
            case 4:
                System.out.println("Abril tem 30 dias.");
                break;
            case 5:
                System.out.println("Maio tem 31 dias.");
                break;
            case 6:
                System.out.println("Junho tem 30 dias.");
                break;
            case 7:
                System.out.println("Julho tem 31 dias.");
                break;
            case 8:
                System.out.println("Agosto tem 31 dias.");
                break;
            case 9:
                System.out.println("Setembro tem 30 dias.");
                break;
            case 10:
                System.out.println("Outubo tem 31 dias.");
                break;
            case 11:
                System.out.println("Novembro tem 30 dias.");
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias.");
                break;
            default:
                System.out.println("Valor inválido, tem que ser de 1-12.");
                break;
        }

        scan.close();

    }

}
