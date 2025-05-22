import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){

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
