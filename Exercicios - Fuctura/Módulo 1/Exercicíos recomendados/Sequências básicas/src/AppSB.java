import java.util.Scanner;

public class AppSB {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Escreva um programa que mostre na tela a mensagem "Olá, Mundo!" */
        System.out.println("1) [IMPRIMIR OLÁ MUNDO]");
        System.out.println("Olá, mundo!");
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de
         * boas-vindas para ela:
         * Ex:
         * Qual é o seu nome? João da Silva
         * Olá João da Silva, é um prazer te conhecer!
         */
        System.out.println("2) [MENSAGEM DE BOAS VINDAS]");
        System.out.print("Qual seu nome? ");
        String nome = scan.nextLine();
        System.out.println();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um programa que leia o nome e o salário de um funcionário, mostrando no
         * final uma mensagem.
         * Ex:
         * Nome do Funcionário: Maria do Carmo
         * Salário: 1850,45
         * O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
         */
        System.out.println("3) [NOME E SALÁRIO]");
        System.out.print("Nome do funcionário: ");
        nome = scan.nextLine();
        System.out.print("Salário do funcionário: R$");
        double numDouble = scan.nextDouble();
        System.out.println();
        System.out.printf("O funcionário %s tem um salário de R$%.2f em Junho.%n", nome, numDouble);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
         * entre eles.
         * Ex:
         * Digite um valor: 8
         * Digite outro valor: 5
         * A soma entre 8 e 5 é igual a 13.
         */
        System.out.println("4) [SOMATÓRIO]");
        System.out.print("Digite um valor: ");
        int numInt = scan.nextInt();
        System.out.print("Digite outro valor: ");
        int numInt2 = scan.nextInt();
        int soma = numInt + numInt2;
        System.out.println();
        System.out.println("A soma entre " + numInt + " e " + numInt2 + " é igual a " + soma);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
         * na tela a sua média na disciplina.
         * Ex:
         * Nota 1: 4.5
         * Nota 2: 8.5
         * A média entre 4.5 e 8.5 é igual a 6.5
         */
        System.out.println("5) [MÉDIA]");
        System.out.print("Nota 1: ");
        numDouble = scan.nextDouble();
        System.out.print("Nota 2: ");
        double numDouble2 = scan.nextDouble();
        double media = (numDouble + numDouble2) / 2;
        System.out.println();
        System.out.println("A média entre " + String.format("%.1f", numDouble) + " e "
                + String.format("%.1f", numDouble2) + " é igual a " + String.format("%.1f", media));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
         * sucessor.
         * Ex:
         * Digite um número: 9
         * O antecessor de 9 é 8
         * O sucessor de 9 é 10
         */
        System.out.println("6) [ANTECESSOR E SUCESSOR]");
        System.out.print("Digite um número: ");
        numInt = scan.nextInt();
        System.out.println();
        System.out.println("O antecessor de " + numInt + " é " + (numInt - 1));
        System.out.println("O sucessor de " + numInt + " é " + (numInt + 1));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
         * sua terça parte.
         * Ex:
         * Digite um número: 3.5
         * O dobro de 3.5 é 7.0
         * A terça parte de 3.5 é 1.16666
         */
        System.out.println("7) [DOBRO E TERCA PARTE]");
        System.out.print("Insira o número real: ");
        numDouble = scan.nextDouble();
        double multiDouble = numDouble * 2;
        double diviDouble = numDouble / 3;
        System.out.println();
        System.out.printf("O dobro de %.1f é %.1f%n", numDouble, multiDouble);
        System.out.printf("O terça parte de %.1f é %.5f%n", numDouble, diviDouble);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Desenvolva um programa que leia uma distância em metros e mostre os valores
         * relativos em outras medidas.
         * Ex:
         * Digite uma distância em metros: 185.72
         * A distância de 185.7m corresponde a:
         * 0.18572km — 1.8572hm
         * 18.572dam — 1857.2dm
         * 18572.0cm — 185720.0mm
         */
        System.out.println("8) [MEDIDAS]");
        System.out.print("Digite uma distância em metros: ");
        numDouble = scan.nextDouble();
        System.out.println();
        System.out.println("A distância de " + String.format("%.1f", numDouble) + " metros corresponde a:");
        double hm = numDouble / 100;
        double km = numDouble / 1000;
        double cm = numDouble * 100;
        double dam = numDouble / 10;
        double dm = numDouble * 10;
        double mm = numDouble * 1000;
        System.out.printf("%.5fkm - %.4fhm%n", km, hm);
        System.out.printf("%.3fdam - %.1fdm%n", dam, dm);
        System.out.printf("%.1fcm - %.1fmm%n", cm, mm);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
         * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$4,95.
         */
        System.out.println("9) [DOLARES]");
        System.out.print("Dinheiro na carteira: ");
        numDouble = scan.nextDouble();
        double conversao = numDouble / 4.95;
        System.out.println();
        System.out.printf("O dinheiro que você tem na carteira (R$%.2f) em dólares é: U$%.2f%n", numDouble, conversao);
        System.out.println("U$1,00 = R$4,95");
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre
         * a área a ser pintada e a quantidade de tinta necessária para o serviço,
         * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
         */
        System.out.println("10) [LITRO DE TINTA]");
        System.out.print("Largura da parede: ");
        numDouble = scan.nextDouble();
        System.out.print("Altura da parede: ");
        numDouble2 = scan.nextDouble();
        double area = numDouble * numDouble2;
        int litros = (int) Math.ceil(area / 2);
        System.out.println();
        System.out.println("A área a ser pintada tem " + area + " metros quadrados.");
        System.out.println(
                "Sabendo que cada litro pinta uma área de 2m quadrados, a quantidade de litros de tinta a ser usados é de: "
                        + litros + "L.");
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
         * segundo grau e mostre o valor de Delta.
         */
        System.out.println("11) [EQUAÇÃO SEGUNDO GRAU]");
        System.out.print("Insira o valor de A (Lembrando que não pode ser 0): ");
        int a = scan.nextInt();
        if (a < 0) {
            System.out.println("Esse valor é menos do que 0... tente novamente.");
            System.out.print("Insira o valor de A (Lembrnado que não pode ser 0): ");
            a = scan.nextInt();
        }
        System.out.print("Insira o valor de B: ");
        int b = scan.nextInt();
        System.out.print("Insira o valor de C: ");
        int c = scan.nextInt();
        System.out.println();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Valor de delta: " + delta);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um programa que leia o preço de um produto, calcule e mostre o seu
         * PREÇO PROMOCIONAL, com 5% de desconto.
         */
        System.out.println("12) [DESCONTO 5%]");
        System.out.print("Preço do produto: R$");
        numDouble = scan.nextDouble();
        double desconto = numDouble * 0.05;
        double total = numDouble - desconto;
        System.out.println();
        System.out.print("Preço do produto com desconto: R$" + total + "\n");
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
         * seu novo salário, com 15% de aumento.
         */
        System.out.println("13) [AUMENTO DE SALÁRIO]");
        System.out.print("Insira seu salário: R$");
        numDouble = scan.nextDouble();
        numDouble2 = numDouble * 1.15;
        System.out.println();
        System.out.println("Seu novo salário (com um aumento de 15%) é: R$" + String.format("%.2f", numDouble2));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
         * um programa que pergunte a quantidade de km percorridos por um carro alugado
         * e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a
         * pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
         */
        System.out.println("14) [LOCADORA DE CARROS]");
        System.out.print("KM's percorridos: ");
        numDouble = scan.nextDouble();
        System.out.print("Quantidade de dias: ");
        numInt = scan.nextInt();
        total = (90 * numInt) + (0.20 * numDouble);
        System.out.println();
        System.out.println("Valor a pagar: R$" + String.format("%.2f", total));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um programa que leia o número de dias trabalhados em um mês e mostre o
         * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha
         * R$25 por hora trabalhada.
         */
        System.out.println("15) [SALARIO COM BASE NOS DIAS TRABALHADOS]");
        System.out.print("Quantidade de dias trabalhados no mês: ");
        numInt = scan.nextInt();
        numDouble = 25 * 8 * numInt;
        System.out.println();
        System.out.printf("Com base nos dias trabalhados, seu salário será: R$%.2f%n", numDouble);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. 
         Considere que um fumante perde 10min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
         */
        System.out.println("DESAFIO - [CIGARRO]");
        System.out.print("Quantidade de cigarros por dia: ");
        numInt = scan.nextInt();
        System.out.print("Anos como fumante: ");
        numInt2 = scan.nextInt();
        int porDia = numInt * 10;
        int porAno = porDia * 365;
        int valorTotal = porAno * numInt2;
        double convert = (double) valorTotal / 1440;
        System.out.println();
        System.out.println("Com base na quantidade de cigarros que você fuma ou já fumou, você perdeu " + String.format("%.1f",convert) + " anos de vida");

        scan.close();

    }

}
