import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args){

        /*Escreva um programa que leia a hora atual em formato 24 horas (0 a 23) e mostre uma saudação de acordo com o período do dia. 
        Se a hora não estiver nesse intervalo, o programa deve mostrar “Hora inválida”.
        Por exemplo, se a hora for 8, o programa deve mostrar “Bom dia”. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a hora atual no formato 24 horas (0-23): ");
        int hora = scan.nextInt();

        if(hora >= 0 && hora < 5) {
            System.out.println("Boa madrugada!");
        } else if (hora >= 5 && hora < 13) {
            System.out.println("Bom dia!");
        } else if (hora >= 13 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida.");
        }

        scan.close();

    }

}
