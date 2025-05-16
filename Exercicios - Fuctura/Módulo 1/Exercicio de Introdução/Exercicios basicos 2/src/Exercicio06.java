import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args){

        /*Escreva um programa que leia uma letra do alfabeto e diga se ela é uma vogal ou uma consoante. Lembre-se que, na comparação de Strings, usa-se o método .equals() ou o .equalsIgnoreCase().*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("É uma vogal.");
        } else {
            System.out.println("É consoante.");
        }

        scan.close();

    }

}
