import java.util.Scanner;
import java.util.Random;

public class AppCC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numInt = 0;
        int numInt2 = 0;
        double numDouble = 0;
        double numDouble2 = 0;
        double numDouble3 = 0;
        double numDouble4 = 0;
        String valorString = "";
        String valorString2 = "";
        char valorChar = 0;

        /*
         * Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
         * na tela uma das mensagens abaixo:
         * — O primeiro valor é o maior
         * — O segundo valor é o maior
         * — Não existe valor maior, os dois são iguais
         */
        System.out.println("Exercicio 01 - Maior, menor ou igual");
        System.out.print("Insira o primeiro número: ");
        numInt = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        numInt2 = scan.nextInt();
        System.out.println();
        if (numInt > numInt2) {
            System.out.println("O primeiro valor é maior.");
        } else if (numInt < numInt2) {
            System.out.println("O segundo valor é maior.");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Crie um programa que leia duas notas de um aluno e calcule a sua média,
         * mostrando uma mensagem no final, de acordo com a média atingida:
         * — Média até 4,9: Reprovado
         * — Média entre 5,0 e 6,9: Recuperação
         * — Média 7,0 ou superior: Aprovado
         */
        System.out.println("Exercicio 02 - Média");
        System.out.print("Insira a primeira nota: ");
        numDouble = scan.nextDouble();
        System.out.print("Insira a segunda nota: ");
        numDouble2 = scan.nextDouble();
        System.out.println();
        numDouble3 = (numDouble + numDouble2) / 2;
        if(numDouble > 10){
            System.out.println("Valor inválido.");
        } else if (numDouble3 < 5) {
            System.out.println("Reprovado.");
        } else if (numDouble3 < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Faça um programa que leia a largura e o comprimento de um terreno
         * retangular, calculando e mostrando a sua área em m². O programa também
         * deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
         * Abaixo de 100m² = TERRENO POPULAR
         * Entre 100m² e 500m² = TERRENO MASTER
         * Acima de 500m² = TERRENO VIP
         */
        System.out.println("Exercicio 03 - Terreno");
        System.out.print("Insira a largura: ");
        numDouble = scan.nextDouble();
        System.out.print("Insira o comprimento: ");
        numDouble2 = scan.nextDouble();
        numDouble3 = numDouble * numDouble2;
        System.out.println();
        if (numDouble3 < 100.0) {
            System.out.println("TERRENO POPULAR.");
        } else if (numDouble3 <= 500.0) {
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO VIP");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Desenvolva um programa que leia o nome de um funcionário, seu salário,
         * quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
         * acordo com a tabela a seguir:
         * → Até 3 anos de empresa: aumento de 3%
         * → Entre 3 e 10 anos: aumento de 12.5%
         * → 10 anos ou mais: aumento de 20%
         */
        scan.nextLine();
        System.out.println("Exercicio 04 - Aumento");
        System.out.print("Nome: ");
        valorString = scan.nextLine();
        System.out.print("Salário: ");
        numDouble = scan.nextDouble();
        System.out.print("Quantidade em anos na empresa: ");
        numInt = scan.nextInt();
        System.out.println();
        if (numInt < 3) {
            numDouble2 = numDouble + numDouble * 0.03;
            System.out.println(valorString + ", seu novo salário será: R$" + String.format("%.2f", numDouble2));
        } else if (numInt < 10) {
            numDouble2 = numDouble + numDouble * (12.5 / 100);
            System.out.println(valorString + ", seu novo salário será: R$" + String.format("%.2f", numDouble2));
        } else {
            numDouble2 = numDouble + numDouble * 0.2;
            System.out.println(valorString + ", seu novo salário será: R$" + String.format("%.2f", numDouble2));
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Refaça o exercício do triângulo, acrescentando o recurso de mostrar que tipo
         * de triângulo será formado:
         * 
         * → EQUILÁTERO: todos os lados iguais
         * → ISÓSCELES: dois lados iguais
         * → ESCALENO: todos os lados diferentes
         */
        System.out.println("1º Desafio - Triângulo");
        System.out.print("Insira o valor do primeiro lado A: ");
        numDouble = scan.nextDouble();
        System.out.print("Insira o valor do primeiro lado B: ");
        numDouble2 = scan.nextDouble();
        System.out.print("Insira o valor do primeiro lado C: ");
        numDouble3 = scan.nextDouble();
        System.out.println();
        if (numDouble < numDouble2 + numDouble3 && numDouble2 < numDouble + numDouble3
                && numDouble3 < numDouble + numDouble2) {
            System.out.println("É possível formar um triângulo com esses valores para cada lado.");
            if (numDouble == numDouble2 && numDouble == numDouble3) {
                System.out.println("E esse é um triângulo EQUILÁTERO: Todos os lados são iguais.");
            } else if (numDouble == numDouble2 && numDouble != numDouble3
                    || numDouble2 == numDouble3 && numDouble2 != numDouble
                    || numDouble == numDouble3 && numDouble != numDouble2) {
                System.out.println("E esse é um triângulo ISÓSCELES: Tem dois lados iguais.");
            } else {
                System.out.println("E esse é um triângulo ESCALENO: Todos os lados são diferentes.");
            }
        } else {
            System.out.println("Não é possivel formar um triângulo com esses valores para cada lado.");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /* Crie um jogo de JoKenPo (Pedra-Papel-Tesoura) */
        scan.nextLine();
        System.out.println("2º Desafio - JoKenPo");
        System.out.print("Jogador 1, faça sua jogada [pedra-papel-tesoura]: ");
        valorString = scan.nextLine().toUpperCase();
        System.out.print("Jogador 2, faça sua jogada [pedra-papel-tesoura]: ");
        valorString2 = scan.nextLine().toUpperCase();
        System.out.println();
        if (valorString.equals("PEDRA") && valorString2.equals("PAPEL")) {
            System.out.println("A pedra foi embrulhada pelo papel... Jogador 2 venceu.");
        } else if (valorString.equals("PAPEL") && valorString2.equals("PEDRA")) {
            System.out.println("A pedra foi embrulhada pelo papel... Jogador 1 venceu.");
        } else if (valorString.equals("PEDRA") && valorString2.equals("TESOURA")) {
            System.out.println("A pedra amassou a tesoura... Jogador 1 venceu.");
        } else if (valorString.equals("TESOURA") && valorString2.equals("PEDRA")) {
            System.out.println("A pedra amassou a tesoura... Jogador 2 venceu.");
        } else if (valorString.equals("PAPEL") && valorString2.equals("TESOURA")) {
            System.out.println("O papel foi cortado pela tesoura... Jogador 2 venceu.");
        } else if (valorString.equals("TESOURA") && valorString2.equals("PAPEL")) {
            System.out.println("O papel foi cortado pela tesoura... Jogador 1 venceu.");
        } else if (valorString.equals("PEDRA") && valorString2.equals("PEDRA")
                || valorString.equals("PAPEL") && valorString2.equals("PAPEL")
                || valorString.equals("TESOURA") && valorString2.equals("TESOURA")) {
            System.out.println("Mãos iguais.");
        } else {
            System.out.println("Valores inválidos.");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
         * jogador vai tentar descobrir qual foi o valor sorteado.
         */

        System.out.println("3º Desafio - Número sorteado");
        numInt = random.nextInt(1,6);
        System.out.print("Palpite: ");
        numInt2 = scan.nextInt();
        System.out.println();
        if (numInt2 == numInt) {
            System.out.println("Acertou!");
        } else {
            System.out.println("Infelizmente você errou.");
        }
        System.out.println("O número era: " + numInt);
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Escreva um programa para aprovar ou não o empréstimo bancário para a compra
         * de uma casa.
         * O programa vai perguntar o valor da casa, o salário do comprador e em quantos
         * anos ele vai pagar.
         * Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do
         * salário ou então o empréstimo será negado.
         */
        System.out.println("Exercicio 05 - Empréstimo");
        System.out.print("Valor da casa: ");
        numDouble = scan.nextDouble();
        System.out.print("Salário do comprador: ");
        numDouble2 = scan.nextDouble();
        System.out.print("Quantidades de meses que você vai pagar: ");
        numInt = scan.nextInt();
        numDouble3 = numDouble / numInt;
        numDouble4 = numDouble2 * 0.3;
        System.out.println();
        System.out.println("Valor da parcela: R$" + String.format("%.2f", numDouble3));
        System.out.print("30% do seu salário: R$" + String.format("%.2f", numDouble4));
        if (numDouble3 > numDouble4) {
            System.out.println("\nO valor excede os 30%, infelizmente empréstimo recusado.");
        } else {
            System.out.println("\nEmpréstimo aprovado!");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
         * peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
         * indivíduo dentro de certas faixas.
         * → Abaixo de 18.5: Abaixo do peso
         * → Entre 18.5 e 25: Peso ideal
         * → Entre 25 e 30: Sobrepeso
         * → Entre 30 e 40: Obesidade
         * → Acima de 40: Obesidade mórbida
         * 
         * Observação: O IMC é calculado pela expressão peso/altura²
         * (peso dividido pelo quadrado da altura)
         */
        System.out.println("Exercicio 06 - IMC");
        System.out.print("Insira sua altura: ");
        numDouble = scan.nextDouble();
        System.out.print("Insira seu peso: ");
        numDouble2 = scan.nextDouble();
        numDouble3 = numDouble2 / Math.pow(numDouble, 2);
        System.out.println();
        if (numDouble3 < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (numDouble3 < 25) {
            System.out.println("Peso ideal.");
        } else if (numDouble3 < 30) {
            System.out.println("Sobrepeso.");
        } else if (numDouble3 < 40) {
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade mórbida.");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*
         * Uma empresa de aluguel de carros precisa cobrar pelos seus serviços.
         * O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
         * para carro de luxo.
         * Além disso, o cliente paga por Km percorrido.
         * 
         * Faça um programa que leia o tipo de carro alugado (popular ou luxo),
         * quantos dias de aluguel e quantos Km foram percorridos.
         * 
         * No final mostre o preço a ser pago de acordo com a tabela a seguir:
         * 
         * → Carros populares (aluguel de R$90 por dia)
         * Até 100Km percorridos: R$0,20 por Km
         * Acima de 100Km percorridos: R$0,10 por Km
         * 
         * → Carros de luxo (aluguel de R$150 por dia)
         * Até 200Km percorridos: R$0,30 por Km
         * Acima de 200Km percorridos: R$0,25 por Km
         */
        scan.nextLine();
        System.out.println("Exercicio 07 - Aluguel carros");
        System.out.print("Tipo do carro alugado [Popular - Luxo]: ");
        valorString = scan.nextLine().toUpperCase();
        System.out.print("Dias de aluguel: ");
        numInt = scan.nextInt();
        System.out.print("KM's percorridos: ");
        numDouble = scan.nextDouble();
        System.out.println();
        if (valorString.equals("POPULAR")) {
            numDouble2 = 90.0 * numInt;
            if (numDouble <= 100.0) {
                numDouble2 = numDouble2 + numDouble * 0.20;
                System.out.println("Tipo: " + valorString);
                System.out.println("Dias: " + numInt);
                System.out.println("KM's percorridos: " + numDouble);
                System.out.println("Valor aluguel: " + String.format("%.2f", numDouble2));
            } else {
                numDouble2 = numDouble2 + numDouble * 0.10;
                System.out.println("Tipo: " + valorString);
                System.out.println("Dias: " + numInt);
                System.out.println("KM's percorridos: " + numDouble);
                System.out.println("Valor aluguel: " + String.format("%.2f", numDouble2));
            }
        } else if (valorString.equals("LUXO")) {
            numDouble2 = 150.0 * numInt;
            if (numDouble <= 200.0) {
                numDouble2 = numDouble2 + numDouble * 0.30;
                System.out.println("Tipo: " + valorString);
                System.out.println("Dias: " + numInt);
                System.out.println("KM's percorridos: " + numDouble);
                System.out.println("Valor aluguel: " + String.format("%.2f", numDouble2));
            } else {
                numDouble2 = numDouble2 + numDouble * 0.25;
                System.out.println("Tipo: " + valorString);
                System.out.println("Dias: " + numInt);
                System.out.println("KM's percorridos: " + numDouble);
                System.out.println("Valor aluguel: " + String.format("%.2f", numDouble2));
            }
        } else {
            System.out.println("Dados inválidos.");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*Um programa de vida saudável quer dar pontos para atividades físicas que podem ser trocados por dinheiro. 
        O sistema funciona assim: 
        Cada hora de atividade física no mês vale pontos: 
        → Até 10h de atividade no mês: ganha 2 pontos por hora 
        → De 10h até 20h de atividade no mês: ganha 5 pontos por hora 
        → Acima de 20h de atividade no mês: ganha 10 pontos por hora 
        A cada ponto ganho, o cliente fatura R$0,05 (5 centavos).
        Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.*/
        System.out.println("Exercicio 08 - Programa de vida saudável");
        System.out.print("Quantidade de horas de atividades mensal: ");
        numInt = scan.nextInt();
        System.out.println();
        if(numInt < 10){
            numInt2 = numInt * 2;
            numDouble = numInt2 * 0.05;
            System.out.println("Você teve um total de " + numInt + " horas, que resultou em " + numInt2 + " pontos. Você receberá: R$" + String.format("%.2f", numDouble));
        } else if (numInt < 20) { 
            numInt2 = numInt * 5;
            numDouble = numInt2 * 0.05;
            System.out.println("Você teve um total de " + numInt + " horas, que resultou em " + numInt2 + " pontos. Você receberá: R$" + String.format("%.2f", numDouble));
        } else {
            numInt2 = numInt * 10;
            numDouble = numInt2 * 0.05;
            System.out.println("Você teve um total de " + numInt + " horas, que resultou em " + numInt2 + " pontos. Você receberá: R$" + String.format("%.2f", numDouble));
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        /*Uma empresa precisa reajustar o salário dos seus funcionários, 
        dando um aumento de acordo com alguns fatores. 
        Faça um programa que leia o salário atual, o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
        No final, mostre o seu novo salário, baseado na tabela a seguir: 

        → Mulheres: 
        — Menos de 15 anos de empresa: +5% 
        — De 15 até 20 anos de empresa: +12% 
        — Mais de 20 anos de empresa: +23% 

        → Homens: 
        — Menos de 20 anos de empresa: +3% 
        — De 20 até 30 anos de empresa: +13% 
        — Mais de 30 anos de empresa: +25%*/
        System.out.println("Exercicio 08 - Reajuste salarial");
        System.out.print("Insira o salário atual: R$");
        numDouble = scan.nextDouble();
        System.out.print("Gênero [M/F]: ");
        valorChar = scan.next().charAt(0);
        System.out.print("Anos na empresa: ");
        numInt = scan.nextInt();
        System.out.println();
        if(valorChar == 'm' || valorChar == 'M'){
            if(numInt < 20){
                numDouble2 = numDouble + numDouble * 0.03;
                System.out.println("Seu novo salário será: R$" + String.format("%.2f", numDouble2));
            } else if (numInt <= 30){
                numDouble2 = numDouble + numDouble * 0.13;
                System.out.println("Seu novo salário será: R$" + String.format("%.2f", numDouble2));
            } else {
                numDouble2 = numDouble + numDouble * 0.25;
                System.out.println("Seu novo salário será: R$" + String.format("%.2f", numDouble2));
            }
        } else {
            if(numInt < 15){
                numDouble2 = numDouble + numDouble * 0.05;
                System.out.println("Seu novo salário será: R$" + String.format("%.2f", numDouble2));
            } else if (numInt <= 20){
                numDouble2 = numDouble + numDouble * 0.12;
                System.out.println("Seu novo salário será: R$" + String.format("%.2f", numDouble2));
            } else {
                numDouble2 = numDouble + numDouble * 0.23;
                System.out.println("Seu novo salário será: R$" + String.format("%.2f", numDouble2));
            }
        }
        
        scan.close();

    }

}