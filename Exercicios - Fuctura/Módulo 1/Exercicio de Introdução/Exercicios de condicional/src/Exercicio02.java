import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    /*Crie um programa que recebe uma nota musical (A, B, C, D, E ou F) e fornece informações sobre ela, como a frequência.*/

    System.out.print("Digite qual nota musical você deseja (A, B, C, D, E ou F): ");
    char nota = scan.next().charAt(0);
    double frequencia = 0;

    switch(nota){
        case 'A':
            frequencia = 440;
            System.out.println("A nota escolhida foi: " + nota);
            System.out.printf("A frequência dessa nota é: %.2f%n", frequencia);
            break;
        case 'B':
            frequencia = 493.88;
            System.out.println("A nota escolhida foi: " + nota);
            System.out.printf("A frequência dessa nota é: %.2f%n", frequencia);
            break;
        case 'C':
            frequencia = 261.63;
            System.out.println("A nota escolhida foi: " + nota);
            System.out.printf("A frequência dessa nota é: %.2f%n", frequencia);
            break;
        case 'D':
            frequencia = 293.66;
            System.out.println("A nota escolhida foi: " + nota);
            System.out.printf("A frequência dessa nota é: %.2f%n", frequencia);
            break;
        case 'E':
            frequencia = 329.63;
            System.out.println("A nota escolhida foi: " + nota);
            System.out.printf("A frequência dessa nota é: %.2f%n", frequencia);
            break;
        case 'F':
            frequencia = 349;
            System.out.println("A nota escolhida foi: " + nota);
            System.out.printf("A frequência dessa nota é: %.2f%n", frequencia);
            break;
        default:
            System.out.println("Nota musical inválida... escolha uma das notas: A, B, C, D, E ou F.");

    }

    scan.close();

    }

}