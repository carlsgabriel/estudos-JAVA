import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    /*Desenvolva um conversor que recebe uma unidade de medida (metro, centímetro, quilômetro) e converte para outra unidade com base na entrada.*/

    System.out.print("Insira o valor que você quer que seja convertido: ");
    double valor = scan.nextDouble();
    scan.nextLine();
    System.out.print("Qual a unidade de medida que você deseja usar (1. Metro - 2. Centímetro - 3. Quilômetro)? ");
    int unidade = scan.nextInt();
    System.out.print("Para qual unidade de medida você deseja converter (1. Metro - 2. Centímetro - 3. Quilômetro): ");
    int unidadeConversora = scan.nextInt();

    double resultado = 0;

    if(unidade == 1 && unidadeConversora == 1){
        resultado = valor;
        System.out.printf("O valor inserido em metros é: %.2f%n", resultado);
    } else if (unidade == 1 && unidadeConversora == 2) {
        resultado = valor * 100;
        System.out.printf("O valor inserido em centímetros é: %.2f%n", resultado);
    } else if (unidade == 1 && unidadeConversora == 3){
        resultado = valor / 1000;
        System.out.printf("O valor inserido em quilômetros é: %.2f%n", resultado);
    }

    if(unidade == 2 && unidadeConversora == 1){
        resultado = valor / 100;
        System.out.printf("O valor inserido em metros é: %.2f%n", resultado);
    } else if (unidade == 2 && unidadeConversora == 2) {
        resultado = valor;
        System.out.printf("O valor inserido em centímetros é: %.2f%n", resultado);
    } else if (unidade == 2 && unidadeConversora == 3){
        resultado = valor / 100000;
        System.out.printf("O valor inserido em quilômetros é: %.5f%n", resultado);
    }

    if(unidade == 3 && unidadeConversora == 1){
        resultado = valor * 1000;
        System.out.printf("O valor inserido em metros é: %.2f%n", resultado);
    } else if (unidade == 3 && unidadeConversora == 2) {
        resultado = valor * 100000;
        System.out.printf("O valor inserido em centímetros é: %.5f%n", resultado);
    } else if (unidade == 3 && unidadeConversora == 3){
        resultado = valor;
        System.out.printf("O valor inserido em quilômetros é: %.2f%n", resultado);
    }

    scan.close();

    }

}