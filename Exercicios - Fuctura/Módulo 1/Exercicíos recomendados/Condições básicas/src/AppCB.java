import java.util.Scanner;

public class AppCB {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numInt = 0;
        int numInt2 = 0;
        double numDouble = 0.0;
        double numDouble2 = 0.0;
        double numDouble3 = 0.0;
        double media = 0.0;
        String nome = "";
        char sexo = '0';

        /*Escreva um programa que pergunte a velocidade de um carro. 
        Caso ultrapasse 80km/h, exiba uma mensagem dizendo que o usuário foi multado. 
        Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.*/
        System.out.println("Exercicio 01 - Multa");
        System.out.print("Velocidade: ");
        numInt = scan.nextInt();
        System.out.println();
        System.out.println("Sua velocidade: " + numInt + "km/h");
        if(numInt > 80){
            numInt2 = (numInt - 80) * 5;
            System.out.println("O km/h máximo é 80. Há uma multa de R$5 reais por km/h excedido.");
            System.out.println("Valor total da sua multa: R$" + numInt2);
        } else {
            System.out.println("Não há multas, parabéns!");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.*/
        System.out.println("Exercicio 02 - Pode votar ou não");
        System.out.print("Insira sua idade: ");
        numInt = scan.nextInt();
        System.out.println();
        if(numInt < 16 || numInt > 70){
            System.out.println("Não pode votar.");
        } else if (numInt >= 16 && numInt < 18){
            System.out.println("Pode votar mas é facultativo.");
        } else {
            System.out.println("Você é obrigado a votar!");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. 
        No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).*/
        System.out.println("Exercicio 03 - Aproveitamento");
        System.out.print("Insira a 1º nota: ");
        numDouble = scan.nextDouble();
        System.out.print("Insira a 2º nota: ");
        numDouble2 = scan.nextDouble();
        media = (numDouble + numDouble2) / 2;
        System.out.println();
        if(media > 7){
            System.out.println("Parabéns, você teve um ótimo aproveitamento.");
        } else if (media == 7){
            System.out.println("Seu aproveitamento foi razoável.");
        } else {
            System.out.println("Seu aproveitamento não foi bom... tente melhorar.");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.*/
        System.out.println("Exercicio 04 - PAR ou ÍMPAR");
        System.out.print("Insira o número ao qual você quer saber se é par ou ímpar: ");
        numInt = scan.nextInt();
        System.out.println();
        if(numInt % 2 == 0){
            System.out.println("É par.");
        } else {
            System.out.println("É ímpar.");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.*/
        //Lembrando: Bissexto é quando o número é divisível 400 OU quando é divisível por 4 mas não é por 100.
        System.out.println("Exercicio 05 - Bissexto ou não?");
        System.out.print("Insira o ano: ");
        numInt = scan.nextInt();
        System.out.println();
        if(numInt % 400 == 0 || (numInt % 4 == 0 && numInt % 100 != 0)){
            System.out.println("É bissexto.");
        } else {
            System.out.println("Não é bissexto.");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
        → Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
        → Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.*/
        System.out.println("Exercicio 06 - Alistamento militar");
        System.out.print("Insira sua idade: ");
        numInt = scan.nextInt();
        System.out.println();
        if(numInt < 18){
            System.out.println("Quantidade de anos que falta para poder se alistar: " + (18 - numInt) + " anos.");
        } else if (numInt == 18) {
            System.out.println("Está na hora de se alistar!");
        } else {
            System.out.println("Quantidade de anos que já passou e deveria ter se alistado: " + (numInt - 18) + " anos.");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres.
        Faça um programa que leia nome, gênero e valor das compras do cliente e calcule o preço com desconto. 
        Sabendo que:
        → Homens ganham 5% de desconto.
        → Mulheres ganham 13% de desconto.*/
        scan.nextLine();
        System.out.println("Exercicio 07 - Descontos");
        System.out.print("Insira seu nome: ");
        nome = scan.nextLine();
        System.out.print("Você é M ou F: ");
        sexo = scan.next().charAt(0);
        System.out.print("Valor total da compra: R$");
        numDouble = scan.nextDouble();
        System.out.println();
        if(sexo == 'f' || sexo == 'F'){
            numDouble2 = numDouble - (numDouble * 0.13);
        } else {
            numDouble2 = numDouble - (numDouble * 0.05);
        }
        System.out.printf("%s, o valor total com desconto vai ficar: R$%.2f", nome, numDouble2);
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em km. 
        Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.*/
        System.out.println("Exercicio 08 - Preço da passagem");
        System.out.print("Quantos KM's você deseja percorrer: ");
        numInt = scan.nextInt();
        System.out.println();
        if(numInt <= 200){
            numDouble = numInt * 0.50;
            System.out.printf("Preço da passagem: R$%.2f", numDouble);
        } else {
            numDouble = numInt * 0.45;
            System.out.printf("Preço da passagem: R$%.2f", numDouble);
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        /*Crie um programa que leia o tamanho de três segmentos de reta.
        Analise seus comprimentos e diga se é possível formar um triângulo com essas retas. 
        Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.*/
        System.out.println("DESAFIO - Forma um Triângulo?");
        System.out.print("Insira o valor do primeiro lado A: ");
        numDouble = scan.nextDouble();
        System.out.print("Insira o valor do primeiro lado B: ");
        numDouble2 = scan.nextDouble();
        System.out.print("Insira o valor do primeiro lado C: ");
        numDouble3 = scan.nextDouble();
        System.out.println();
        if(numDouble < numDouble2 + numDouble3 && numDouble2 < numDouble + numDouble3 && numDouble3 < numDouble + numDouble2){
            System.out.println("É possível formar um triângulo com esses valores para cada lado.");
        } else {
            System.out.println("Não é possivel formar um triângulo com esses valores para cada lado.");
        }

        scan.close();
        
    }
}
