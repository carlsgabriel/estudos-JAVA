import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args){

        /*Escreva um programa que leia a temperatura em graus Celsius e converta para graus Fahrenheit ou Kelvin, de acordo com a escolha do usuário. 
        A fórmula para converter Celsius para Fahrenheit é: 
        F = (C * 9/5) + 32. 
        A fórmula para converter Celsius para Kelvin é 
        K = C + 273.15. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temp = scan.nextDouble();
        System.out.print("Você quer que o valor inserido seja convertido para Fahrenheit ou Kelvin (F ou K)? ");
        char escolha = scan.next().charAt(0);

        if(escolha == 'F'){
            double tempConvertida = temp * 1.8 + 32;
            System.out.printf("O valor da temperatura em Celsius inserida anteriormente (%.2f) convertida para Fahrenheit é %.2f%n", temp, tempConvertida);
        } else if (escolha == 'K'){
            double tempConvertida = temp + 273.15;
            System.out.printf("O valor da temperatura em Celsius inserida anteriormente (%.2f) convertida para Kelvin é %.2f%n", temp, tempConvertida);
        } else {
            System.out.println("Escolha Fahrenheit (F) ou Kelvin (K).");
        }

        scan.close();

    }

}
