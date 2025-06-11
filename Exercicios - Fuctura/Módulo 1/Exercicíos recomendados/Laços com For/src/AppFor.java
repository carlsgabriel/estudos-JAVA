import java.util.Scanner;

public class AppFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numInt = 0;
        int numInt2 = 0;
        int numInt3 = 0;
        double numDouble = 0.0;
        double numDouble2 = 0.0;
        double numDouble3 = 0.0;
        char valChar = '0';

        /*Desenvolva um programa usando a estrutura “for” que mostre na tela a seguinte contagem:
        0 5 10 15 20 25 30 35 40 Acabou!*/
        System.out.println("Exercicio 01 - Contagem");
        for (int i = 0; i < 9; i++) {
            System.out.print(i * 5 + " ");
        }
        System.out.println("Acabou!");
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        /*Desenvolva um programa usando a estrutura “for” que mostre na tela a seguinte contagem:
        100 90 80 70 60 50 40 30 20 10 0 Acabou!*/
        System.out.println("Exercicio 02 - Contagem decrescente");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i * 10 + " ");
        }
        System.out.println("Acabou!");
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        /*Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura “for”.
        Ex: Digite um valor: 5
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15 ...*/
        System.out.println("Exercicio 03 - Tabuada");
        System.out.print("Digite um valor: ");
        numInt = scan.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numInt + " x " + i + " = " + (numInt * i));
        }
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        /*Faça um programa usando a estrutura “for” que leia um número inteiro positivo e mostre na tela uma contagem de 0 até o valor digitado:
        Ex: Digite um valor: 9
        Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/
        System.out.println("Exercicio 04 - Contagem até o número especificado");
        System.out.print("Digite um valor: ");
        numInt = scan.nextInt();
        System.out.println();
        System.out.print("Contagem: ");
        for (int i = 0; i <= numInt; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("FIM!");
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        /*Crie um programa que leia gênero e peso de 8 pessoas, usando a estrutura “for”. No final, mostre na tela:
        a) Quantas mulheres foram cadastradas
        b) Quantos homens pesam mais de 100Kg
        c) A média de peso entre as mulheres
        d) O maior peso entre os homens*/
        System.out.println("Exercicio 05 - Genêro e peso");
        numInt = 0;     
        numInt2 = 0;    
        numInt3 = 0;    
        numDouble2 = 0; 
        for (int i = 0; i < 8; i++) {
            System.out.print("Insira o " + (i + 1) + "º peso: ");
            numDouble = scan.nextDouble();
            System.out.print("Insira o gênero [m/f]: ");
            valChar = scan.next().charAt(0);
            System.out.println();
            // Mulheres cadastradas
            if (valChar == 'f' || valChar == 'F') {
                numInt++;
                numInt3 += numDouble;
            }
            // Homens com mais de 100kg
            if (valChar == 'm' || valChar == 'M') {
                if (numDouble > 100.0) {
                    numInt2++;
                }
                // Maior peso entre os homens
                if (numDouble > numDouble2) {
                    numDouble2 = numDouble;
                }
            }
        }
        // Média de peso das mulheres
        if (numInt > 0) {
            numDouble3 = numInt3 / numInt;
        }
        System.out.println();
        System.out.println("Quantas mulheres foram cadastradas: " + numInt);
        System.out.println("Quantidade de homens com mais de 100KG: " + numInt2);
        System.out.println("Média do peso das mulheres: " + String.format("%.1f", numDouble3));
        System.out.println("Maior peso entre os homens: " + numDouble2);
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        /*Faça um programa que mostre os 10 primeiros elementos da Sequência de Fibonacci:
        1 1 2 3 5 8 13 21... */
        System.out.println("Desafio - Sequência de Fibonacci");
        System.out.println();
        numInt = 1;
        numInt2 = 1;
        numInt3 = 0;
        for(int i=0;i<10;i++){
            System.out.print(numInt + " ");
            numInt3 = numInt + numInt2;
            numInt = numInt2;
            numInt2 = numInt3;
        }
        
        scan.close();
    }
}
