import java.util.Scanner;

public class AppDoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numInt = 0;
        int numInt2 = 0;
        int numInt3 = 0;
        int numInt4 = 0;
        int numInt5 = 0;
        double numDouble = 0.0;
        char valChar = '0';

        /*
         * Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
         * “do-while” 0 3 6 9 12 15 18 21 24 27 30 Acabou!
         */
        System.out.println("Exercicio 01 - Contagem");
        do {
            System.out.print(numInt + " ");
            numInt += 3;
        } while (numInt <= 30);
        System.out.println("Acabou!");
        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        /*
         * Faça um programa usando a estrutura “do-while” que leia a idade de
         * várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer
         * ou não continuar a digitar dados. No final, quando o usuário decidir parar,
         * mostre na tela:
         * a) Quantas idades foram digitadas
         * b) Qual é a média entre as idades digitadas
         * c) Quantas pessoas tem 21 anos ou mais.
         */

        System.out.println("Exercicio 02 - Idades");
        do {
            System.out.print("Idade: ");
            numInt = scan.nextInt();
            // quantidades de idades
            numInt2++;
            // soma média
            numInt3 += numInt;
            // 21+
            if (numInt > 21) {
                numInt4++;
            }
            System.out.print("Você deseja continuar inserindo idades [s/n]: ");
            valChar = scan.next().charAt(0);
            System.out.println("-----------");
        } while (valChar != 'n');
        // media das idades
        numDouble = numInt3 / numInt2;
        System.out.println();
        System.out.println("Quantidade de idades digitadas: " + numInt2);
        System.out.println("Média das idades digitadas: " + String.format("%.1f", numDouble));
        System.out.println("Pessoas com mais de 21 anos: " + numInt4);
        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        /*
         * Crie um programa usando a estrutura “do-while” que leia vários números.
         * A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
         * tela:
         * a) O somatório entre todos os valores
         * b) Qual foi o menor valor digitado
         * c) A média entre todos os valores
         * d) Quantos valores são pares
         */
        System.out.println("Exercicio 03 - Números");
        valChar = '0';
        numInt2 = 0;
        numInt3 = 999;
        numInt4 = 0;
        do {
            System.out.print("Insira o número: ");
            numInt = scan.nextInt();
            // somatório entre todos os valores
            numInt2 += numInt;
            // menor valor
            if (numInt < numInt3) {
                numInt3 = numInt;
            }
            // valores pares
            if (numInt % 2 == 0) {
                numInt5++;
            }
            numInt4++;
            System.out.print("Quer continuar inserindo números [s/n]: ");
            valChar = scan.next().charAt(0);
            System.out.println("----------------");
        } while (valChar != 'n');
        // soma entre os valores
        numDouble = numInt2 / numInt4;
        System.out.println();
        System.out.println("Somatório de todos os valores: " + numInt2);
        System.out.println("Menor valor digitado: " + numInt3);
        System.out.println("Média dos valores: " + String.format("%.1f", numDouble));
        System.out.println("Valores pares: " + numInt5);

        scan.close();

    }

}