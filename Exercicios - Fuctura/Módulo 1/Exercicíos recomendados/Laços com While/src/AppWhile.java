import java.util.Scanner;
import java.util.Random;

public class AppWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numInt = 0;
        int numInt2 = 0;
        int numInt3 = 0;
        int numInt4 = 0;
        int numInt5 = 0;
        int numInt6 = 0;
        int numInt7 = 0;
        double numDouble = 0.0;
        double numDouble2 = 0.0;
        double numDouble3 = 0.0;
        double numDouble4 = 0.0;
        char valueChar = '0';
        char valueChar2 = '0';
        String valueString = "";
        String valueString2 = "";
        String valueString3 = "";

         /*
          * Escreva um programa que mostre na tela a seguinte contagem:
          * 6 7 8 9 10 11 Acabou!
          */
         System.out.println("Exercicio 01 - Contagem crescente");
         numInt = 6;
         while (numInt <= 11) {
             System.out.print(numInt + " ");
             numInt++;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Faça um algoritmo que mostre na tela a seguinte contagem:
          * 10 9 8 7 6 5 4 3 Acabou!
          */
         System.out.println("Exercicio 02 - Contagem decrescente");
         numInt = 10;
         while (numInt >= 3) {
             System.out.print(numInt + " ");
             numInt--;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Crie um aplicativo que mostre na tela a seguinte contagem:
          * 0 3 6 9 12 15 18 Acabou!
          */
         System.out.println("Exercicio 03 - De 3 em 3 crescente");
         numInt = 0;
         while (numInt <= 18) {
             System.out.print(numInt + " ");
             numInt += 3;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Desenvolva um programa que mostre na tela a seguinte contagem:
          * 100 95 90 85 80 ... 0 Acabou!
          */
         System.out.println("Exercicio 04 - De 5 em 5 decrescente");
         numInt = 100;
         while (numInt >= 0) {
             System.out.print(numInt + " ");
             numInt -= 5;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
          * qualquer e mostre uma contagem até esse valor:
          * Ex: Digite um valor: 35
          * Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
          */
         System.out.println("Exercicio 05 - Contar até determinado valor");
         System.out.print("Insira o número: ");
         numInt = scan.nextInt();
         numInt2 = 1;
         System.out.println();
         while (numInt2 <= numInt) {
             System.out.print(numInt2 + " ");
             numInt2++;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
          * marcando os números que forem divisíveis por 4, exatamente como mostrado
          * abaixo:
          * 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
          */
         System.out.println("Exercício 06 - Contagem em ordem regressiva decorando certos números");
         numInt = 30;
         while (numInt >= 1) {
             if (numInt % 4 == 0) {
                 System.out.print("[" + numInt + "] ");
             } else {
                System.out.print(numInt + " ");
             }
             numInt--;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
          * incremento, mostrando em seguida todos os valores no intervalo:
          * Ex: Digite o primeiro Valor: 3
          * Digite o último Valor: 10
          * Digite o incremento: 2
          * Contagem: 3 5 7 9 Acabou!
          */
         System.out.println("Exercicio 07 - Contagem a pedidos do usuário");
         System.out.print("Digite o primeiro valor: ");
         numInt = scan.nextInt();
         System.out.print("Digite o último valor: ");
         numInt2 = scan.nextInt();
         System.out.print("Digite o valor do incremento: ");
         numInt3 = scan.nextInt();
         System.out.println();
         while (numInt <= numInt2) {
             System.out.print(numInt + " ");
             numInt += numInt3;
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * O programa acima vai ter um problema quando digitarmos o primeiro valor maior
          * que o último. Resolva esse problema com um código que funcione em qualquer
          * situação.
          */
         System.out.println("Exercicio 08 - Resolvendo possível erro do exercicio 07");
         System.out.print("Digite o primeiro valor: ");
         numInt = scan.nextInt();
         System.out.print("Digite o último valor: ");
         numInt2 = scan.nextInt();
         System.out.print("Digite o valor do incremento: ");
         numInt3 = scan.nextInt();
         System.out.println();
         if (numInt < numInt2) {
             while (numInt <= numInt2) {
                 System.out.print(numInt + " ");
                 numInt += numInt3;
             }
         } else {
             while (numInt >= numInt2) {
                 System.out.print(numInt + " ");
                 numInt -= numInt3;
             }
         }
         System.out.println("Acabou!");
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
          * 8 + 10 + 12 + 14 + ... + 98 + 100.
          */
         System.out.println("Exercicio 09 - Calculo da contagem");
         numInt = 6;
         numInt2 = 0;
         while (numInt <= 100) {
             numInt2 += numInt;
             if (numInt == 100) {
                 System.out.print(numInt + " ");
             } else {
                 System.out.print(numInt + " + ");
             }
             numInt += 2;
         }
         System.out.println("= " + numInt2);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
          * 450 + 400 + 350 + 300 + ... + 50 + 0
          */
         System.out.println("Exercicio 10 - Calculo da contagem");
         numInt = 500;
         numInt2 = 0;
         while (numInt >= 0) {
             numInt2 += numInt;
             if (numInt == 0) {
                 System.out.print(numInt + " = ");
             } else {
                 System.out.print(numInt + " + ");
             }
             numInt -= 50;
         }
         System.out.println(numInt2);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Faça um programa que leia 7 números inteiros e no final mostre o somatório
          * entre eles.
          */
         System.out.println("Exercicio 11 - Somatório de números recebidos");
         numInt = 1;
         numInt3 = 0;
         while (numInt <= 7) {
             System.out.print("Insira o " + numInt + "º número: ");
             numInt2 = scan.nextInt();
             numInt3 += numInt2;
             numInt++;
         }
         System.out.println();
         System.out.println("Soma dos números inseridos acima: " + numInt3);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Crie um programa que leia 6 números inteiros e no final mostre quantos deles
          * são pares e quantos são ímpares.
          */
         System.out.println("Exercicio 12 - Receber números e dizer quantos são ímpares e quantos são pares");
         numInt = 1;
         numInt3 = 0;
         numInt4 = 0;
         while (numInt <= 6) {
             System.out.print("Insira o " + numInt + "º número: ");
             numInt2 = scan.nextInt();
             if (numInt2 % 2 == 0) {
                 numInt3++;
             } else {
                 numInt4++;
             }
             numInt++;
         }
         System.out.println();
         System.out.println("Números pares: " + numInt3);
         System.out.println("Números ímpares: " + numInt4);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*
          * Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
          * mostre na tela:
          * a) Quais foram os números sorteados
          * b) Quantos números estão acima de 5
          * c) Quantos números são divisíveis por 3
          */
         System.out.println("Exercicio 13 - Programa entre 0 e 10");
         numInt = 1;
         numInt2 = 0;
         numInt3 = 0;
         numInt4 = 0;
         System.out.println("Números sorteados: ");
         while (numInt <= 20) {
             numInt2 = random.nextInt(11);
             if (numInt2 > 5) {
                 numInt3++;
             }
             if (numInt2 % 3 == 0) {
                 numInt4++;
             }
             System.out.print(numInt2 + " ");
             numInt++;
         }
         System.out.println();
         System.out.println("\nNúmeros acima de 5: " + numInt3);
         System.out.println("Números divisíveis por 3 (os zeros contam): " + numInt4);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*Faça um aplicativo que leia o preço de 8 produtos. 
         No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.*/
         System.out.println("Exercicio 14 - Qual foi o menor preço digitado");
         numInt = 1;
         numDouble2 = 9999999999999999.9;
         while (numInt <= 8) {
             System.out.print("Insira o " + numInt + "º preço: R$");
             numDouble = scan.nextDouble();
             if(numDouble < numDouble2){
                 numDouble2 = numDouble;
             }
             if(numDouble > numDouble3){
                 numDouble3 = numDouble;
             }
             numInt++;
         }
         System.out.println("Menor preço: R$" + String.format("%.1f", numDouble2));
         System.out.println("Maior preço: R$" + String.format("%.1f", numDouble3));
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();
        
         /*Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
         a) Qual é a média de idade do grupo
         b) Quantas pessoas tem mais de 18 anos
         c) Quantas pessoas tem menos de 5 anos
         d) Qual foi a maior idade lida*/
         System.out.println("Exercicio 15 - Idades");
         numInt = 1;
         numInt3 = 0;
         numInt4 = 0;
         numDouble = 0.0;
         while(numInt <= 10){
             System.out.print("Insira a " + numInt + "º idade: ");
             numInt2 = scan.nextInt();
             //calculo da media abaixo:
             numInt3 += numInt2;
             numDouble = numInt3 / 10;
             //calculo de quem é maior e menor
             if(numInt2 > 18){
                 numInt4++;
             }
             if(numInt2 < 5){
                 numInt5++;
             }
             //calculo de maior idade lida
             if(numInt2 > numInt6){
                 numInt6 = numInt2;
             }
             numInt++;
         }
         System.out.println("Média das idades: " + String.format("%.1f%n", numDouble));
         System.out.println("Maior de 18 anos: " + numInt4);
         System.out.println("Idades menores de 5 anos: " + numInt5);
         System.out.println("Maior idade lida: " + numInt6);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*Faça um programa que leia a idade e o gênero de 5 pessoas, mostrando no final:
         a) Quantos homens foram cadastrados
         b) Quantas mulheres foram cadastradas
         c) A média de idade do grupo
         d) A média de idade dos homens
         e) Quantas mulheres tem mais de 20 anos*/
         System.out.println("Exercicio 16 - Idade e genero");
         numInt = 1;
         numInt3 = 0;
         numInt4 = 0;
         numInt5 = 0;
         numInt6 = 0;
         while(numInt <= 5){
             System.out.print("Insira a " + numInt + "º idade: ");
             numInt2 = scan.nextInt();
             System.out.print("Gênero [M/F]: ");
             valueChar = scan.next().charAt(0);
             System.out.println("-----------------------");
             //if para saber quantos homens e mulheres foram cadastrados
             if(valueChar == 'M' || valueChar == 'm'){
                 numInt3++;
                 //soma da media dos homens
                 numInt6 += numInt2;
             } else {
                 numInt4++;
                 //verificar quantidade de mulheres com mais de 20 anos
                 if(numInt2 > 20){
                     numInt7 ++;
                 }
             }
             //soma da media do grupo
             numInt5 += numInt2;
             numInt++;
         }
         numDouble = numInt5 / 5;
         if(numInt6 == 0){
             numDouble2 = 0;
         } else {
             numDouble2 = numInt6 / numInt3;
         }
         System.out.println("\nQuantidade de homens cadastrados: " + numInt3);
         System.out.println("Quantidade de mulheres cadastradas: " + numInt4);
         System.out.println("Média de idade do grupo: " + String.format("%.1f", numDouble));
         System.out.println("Média de idade dos homens : " + String.format("%.1f", numDouble2));
         System.out.println("Quantidade de mulheres com mais de 20 anos: " + numInt7);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
         a) Qual foi a média de altura do grupo
         b) Quantas pessoas pesam mais de 90Kg
         c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
         d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.*/
         System.out.println("Exercicio 17 - Altura e peso");
         numInt = 1;
         numInt2 = 0;
         numInt3 = 0;
         numInt4 = 0;
         numDouble3 = 0.0;
         while(numInt <= 7){
             System.out.print("Insira o " + numInt + "º peso: ");
             numDouble = scan.nextDouble();
             System.out.print("Insira a " + numInt + "º altura: ");
             numDouble2 = scan.nextDouble();
             System.out.println("-----------------------");
             //soma da media de altura
             numDouble3 += numDouble2;
             //pessoas com mais de 90kg
             if(numDouble > 90){
                 numInt2++;
             }
             //pessoas com menos de 50kg e menos de 1.60
             if(numDouble < 50 && numDouble2 < 1.60){
                 numInt3++;
             }
             //pessoas com mais de 1.90 e mais de 100kg
             if(numDouble > 100 && numDouble2 > 1.90){
                 numInt4++;
             }
             numInt++;
         }
         //soma das alturas
         numDouble4 = numDouble3 / 7;
         System.out.println("Média de altura do grupo: " + String.format("%.1f", numDouble4));
         System.out.println("Quantidade de pessoas que pesam mais que 90KG: " + numInt2);
         System.out.println("Quantidade de pessoas que pesam menos que 50KG e tem menos que 1.50 de altura: " + numInt3);
         System.out.println("Quantidade de pessoas que pesam mais que 100KG e tem mais de 1.90 de altura: " + numInt4);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

         /*Vamos melhorar o jogo que fizemos no exercício de adivinhação. 
         A partir de agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.*/
         System.out.println("Exercicio 18 - Jogo de advinhação melhorado");
         System.out.println();
         numInt = random.nextInt(10) + 1;
         numInt2 = 1;
         while(numInt2 <= 4){
             System.out.print(numInt2 + "º palpite: ");
             numInt3 = scan.nextInt();
             if(numInt3 == numInt){
                 System.out.println("Parabéns... você acertou na " + numInt2 + "º tentativa.");
                 break;
             } else {
                 System.out.println("Infelizmente você errou... tente novamente!");
             }
             System.out.println("---------------------");
             numInt2++;
         }
         System.out.println();
         System.out.println("O número era: " + numInt);
         System.out.println();
         System.out.println("---------------------------");
         System.out.println();

        /*Crie um programa que leia vários números pelo teclado e mostre no final o somatório entre eles.
        Obs: O programa será interrompido quando o número 1111 for digitado */
        System.out.println("Exercicio 19 - Soma dos números digitados");
        numInt = 1;
        numInt2 = 1;
        numInt3 = 0;
        while(numInt2 != 1111){
                System.out.print("Insira o " + numInt + "º numero: ");
                numInt2 = scan.nextInt();
                if(numInt2 == 1111){
                    numInt3 += 0;
                } else {
                    numInt3 += numInt2;
                }
                numInt++;
        }
        System.out.println();
        System.out.println("A soma dos numeros inseridos foi: " + numInt3);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*Faça um algoritmo que leia a idade de vários alunos de uma turma.
        O programa vai parar quando for digitada a idade 999.
        No final, mostre quantos alunos existem na turma e qual é a média de idade do grupo.*/
        System.out.println("Exercicio 20 - Várias idades");
        numInt = 1;
        numInt2 = 1;
        numInt3 = 0;
        numInt4 = 0;
        numDouble = 0.0;
        while(numInt2 != 999){
            System.out.print("Insira o " + numInt + "º numero: ");
            numInt2 = scan.nextInt();
            //quantas pessoasforam adicionadas
            //soma media
            if(numInt2 == 999){
                numInt2 += 0;
            } else {
                numInt4 += numInt2;
                numInt3++;
            }
            System.out.println("--------------");
            numInt++;
        }
        numDouble = numInt4 / numInt3;
        System.out.println();
        System.out.println("Quantidade de alunos inseridos: " + numInt3);
        System.out.println("Média de idade do grupo: " + String.format("%.1f", numDouble));
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
        O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
        a) O nome da pessoa mais velha
        b) O nome da mulher mais jovem
        c) A média de idade do grupo
        d) Quantos homens tem mais de 30 anos
        e) Quantas mulheres tem menos de 18 anos*/
        System.out.println("Exercicio 21 - Nome, idade e sexo");
        scan.nextLine();
        valueChar2 = 's';
        numInt2 = 0;
        numInt3 = 999;
        numInt4 = 0;
        numInt5 = 0;
        numInt6 = 0;
        numInt7 = 0; 
        while(valueChar2 != 'n'){
            System.out.print("Nome: ");
            valueString = scan.nextLine();
            System.out.print("Idade: ");
            numInt = scan.nextInt();
            System.out.print("Sexo [M/F]: ");
            valueChar = scan.next().charAt(0);
            //verificando quem é a pessoa mais velha do grupo
            if(numInt > numInt2){
                numInt2 = numInt;
                valueString2 = valueString;
            }
            //verificando quem é a pessoa mais nova
            if(numInt < numInt3){
                numInt3 = numInt;
                valueString3 = valueString;
            }
            //soma da média das idades
            numInt4 += numInt;
            //homens +30
            if(valueChar == 'm' || valueChar == 'M'){
                if(numInt > 30){
                    numInt5++;
                }
            }
            //mulheres -18
            if(valueChar == 'f' || valueChar == 'F'){
                if(numInt < 18){
                    numInt6++;
                }
            }
            numInt7++;
            System.out.print("Deseja continuar [s/n]: ");
            valueChar2 = scan.next().charAt(0);
            System.out.println();
            scan.nextLine();
        }
        numDouble = numInt4 / numInt7;
        System.out.println("Pessoa mais velha: " + valueString2);
        System.out.println("Pessoa mais nova: " + valueString3);
        System.out.println("Média das idades: " + String.format("%.1f", numDouble));
        System.out.println("Homens com mais de 30: " + numInt5);
        System.out.println("Mulheres com menos de 18: " + numInt6);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*Crie um programa que leia o gênero e a idade de várias pessoas. O programa vai perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
        a) qual é a maior idade lida
        b) quantos homens foram cadastrados
        c) qual é a idade da mulher mais jovem
        d) qual é a média de idade entre os homens */
        System.out.println("Exercicio 22 - Gênero e idade");
        valueChar = 's';
        valueChar2 = '0';
        numInt = 0;
        numInt2 = 0;
        numInt3 = 0;
        numInt4 = 0;
        numInt5 = 999;
        numInt6 = 0;
        while(valueChar != 'n'){
            System.out.print("Idade: ");
            numInt2 = scan.nextInt();
            System.out.print("Gênero [M/F]: ");
            valueChar2 = scan.next().charAt(0);
            //maior idade lida
            if(numInt2 > numInt3){
                numInt3 = numInt2;
            }
            //quantos homens foram cadastrados
            if(valueChar2 == 'm' || valueChar2 == 'M'){
                numInt4++;
                //soma da média dos homens
                numInt6 += numInt2;
            }
            //mulher mais jovem
            if(valueChar2 == 'f' || valueChar2 == 'F'){
                if(numInt2 < numInt5){
                    numInt5 = numInt2;
                }
            }
            //quantas pessoas foram cadastradas
            numInt++;
            System.out.print("Quer continuar cadastrando pessoas [s/n]? ");
            valueChar = scan.next().charAt(0);
            System.out.println();
        }
        if(numInt5 == 999){
            numInt5 = 0;
        }
        System.out.println();
        numDouble = numInt6 / numInt4;
        System.out.println("Maior idade lida: " + numInt3);
        System.out.println("Quantos homens foram cadastrados: " + numInt4);
        System.out.println("Idade da mulher mais jovem: " + numInt5);
        System.out.println("Média da idade dos homens: " + String.format("%.2f", numDouble));
        
        scan.close();

    }

}