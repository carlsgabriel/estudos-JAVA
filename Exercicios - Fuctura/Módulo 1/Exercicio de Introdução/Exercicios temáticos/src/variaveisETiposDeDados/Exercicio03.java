import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){

        /*A família Silva vai fazer uma viagem de carro e quer saber quanto vai gastar.
          Escreva um programa que receba o número de quilômetros da viagem, o preço médio do litro de gasolina e o consumo do carro (km/L), e exiba o valor total que será gasto com combustível.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("São quantos KM's de viagem? ");
        int kms = scan.nextInt();

        System.out.print("Preço médio do litro da gasolina: ");
        double preco = scan.nextDouble();

        System.out.print("Quantos KM's seu carro faz com 1L? ");
        double consumo = scan.nextDouble();

        double gasto = kms / consumo * preco;

        System.out.printf("O valor que você vai gastar com essa viagem é: %.2f%n", gasto);

        scan.close();

    }

}
