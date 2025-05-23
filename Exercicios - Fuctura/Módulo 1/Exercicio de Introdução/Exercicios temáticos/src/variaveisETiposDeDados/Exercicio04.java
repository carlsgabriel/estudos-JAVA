import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){

        /*Dona Cida quer saber quanto sua conta de luz vai custar este mês.
          Crie um programa que armazene a quantidadede kWh consumidos, o preço do kWh e o valor da taxa mínima.
          O programa deve calcular e exibir o valor total da conta.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de kWh consumidos: ");
        double kwh = scan.nextDouble();

        System.out.print("Qual o preço do kWh? ");
        double preco = scan.nextDouble();

        System.out.print("Qual o valor da taxa mínima? ");
        double taxaMin = scan.nextDouble();

        double total = kwh * preco + taxaMin;

        System.out.printf("O total a ser pago é R$%.2f reais.%n", total);

        scan.close();

    }

}
