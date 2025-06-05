import java.util.Scanner;

public class AppOMP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         * Escreva um programa que solicite dois números ao usuário e, em seguida,
         * calcule a soma desses números usando o operador de adição (+).
         * Em seguida, exiba o resultado.
         */
        System.out.println("[SOMA]");
        System.out.print("Insira o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um programa que calcule a média de três números inteiros usando o
         * operador de adição (+) e o operador de divisão (/).
         * Peça ao usuário para inserir os três números e, em seguida, calcule a média e
         * exiba o resultado.
         */
        System.out.println("[MEDIA]");
        System.out.print("Insira o primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = scan.nextInt();
        System.out.print("Insira o terceiro número: ");
        int num3 = scan.nextInt();
        double media = (num1 + num2 + num3) / 3;
        System.out.println();
        System.out.print("Média: " + media);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um programa que calcule a diferença entre dois números inteiros usando o
         * operador de subtração (-).
         * Peça ao usuário para inserir os números e exiba a diferença.
         */
        System.out.println("[DIFERENÇA]");
        System.out.print("Insira o valor do primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Insira o valor do segundo número: ");
        num2 = scan.nextInt();
        int diferenca = num1 - num2;
        System.out.println();
        System.out.println("Diferença: " + diferenca);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Escreva um programa que calcule o troco em reais ao comprar um item de valor
         * X com uma nota de valor Y, usando o operador de subtração (-).
         * Solicite ao usuário que insira o valor do item e o valor da nota, e exiba o
         * troco.
         */
        System.out.println("[TROCO]");
        System.out.print("Preço do item: ");
        double preco = scan.nextDouble();
        System.out.print("Valor da nota: R$");
        double nota = scan.nextDouble();
        double troco = preco - nota;
        System.out.println();
        System.out.println("Troco: R$" + String.format("%.2f", Math.abs(troco)));

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Desenvolva um programa que calcule o produto de dois números inteiros usando
         * o operador de multiplicação (*).
         * Peça ao usuário para inserir os números e exiba o resultado.
         */
        System.out.println("[PRODUTO]");
        System.out.print("Primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Segundo número: ");
        num2 = scan.nextInt();
        int produto = num1 * num2;
        System.out.println();
        System.out.println("Produto: " + produto);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um programa que converta a quantidade de minutos em horas usando o
         * operador de divisão (/).
         * Peça ao usuário para inserir a quantidade de minutos e exiba o equivalente em
         * horas.
         */
        System.out.println("[MINUTOS EM HORAS]");
        System.out.println("Insira a quantidade de minutos: ");
        num1 = scan.nextInt();
        double horas = num1 / 60;
        System.out.println();
        System.out.println("Hora(s): " + String.format("%.1f", horas));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Faça um programa que calcule o quociente da divisão entre dois números
         * inteiros usando o operador de divisão (/).
         * Peça ao usuário para inserir os números e exiba o quociente.
         */
        System.out.println("[QUOCIENTE]");
        System.out.print("Insira o primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = scan.nextInt();
        double quociente = num1 / num2;
        System.out.println();
        System.out.println("Quociente: " + String.format("%.1f", quociente));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Escreva um programa que calcule o preço por unidade de um produto, dado o
         * preço total e a quantidade, usando o operador de divisão (/). Solicite ao
         * usuário que insira o preço total e a quantidade e exiba o preço por unidade.
         */
        System.out.println("[PREÇO UNIDADE]");
        System.out.print("Preço total: R$");
        preco = scan.nextDouble();
        System.out.print("Quantidade: ");
        num1 = scan.nextInt();
        double unidade = preco / num1;
        System.out.println();
        System.out.println("Unidade custa: R$" + String.format("%.2f", unidade));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Desenvolva um programa que calcule o resto da divisão entre dois números
         * inteiros usando o operador de módulo (%).
         * Peça ao usuário para inserir os números e exiba o resultado.
         */
        System.out.println("[RESTO DA DIVISÃO]");
        System.out.print("Insira o primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = scan.nextInt();
        int resto = num1 % num2;
        System.out.println();
        System.out.println("Resto da divisão: " + resto);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        /*
         * Crie um programa em Java que siga as etapas a seguir:
         * 1) Solicite ao usuário que insira três números do tipo double
         * 2) Calcule a soma desses três números
         * 3) Multiplique a soma obtida por 3
         * 4) Calcule e exiba o resto da divisão do resultado anterior por 5.
         */
        System.out.println("[PROGRAMA EM JAVA]");
        System.out.print("Insira o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.print("Insira o segundo número: ");
        double numero2 = scan.nextDouble();
        System.out.print("Insira o terceiro número: ");
        double numero3 = scan.nextDouble();
        double somaDouble = numero1 + numero2 + numero3;
        double multiDouble = somaDouble * 3;
        resto = (int) multiDouble / 5;
        System.out.println();
        System.out.println("Soma: " + String.format("%.2f", somaDouble));
        System.out.println("Divião por 3: " + String.format("%.2f", multiDouble));
        System.out.println("Resto da divião por 5 do resultado anterior: " + resto);

        scan.close();

    }

}
