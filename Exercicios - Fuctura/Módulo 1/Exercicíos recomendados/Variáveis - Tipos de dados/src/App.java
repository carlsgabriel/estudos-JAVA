import java.util.Scanner;

public class App {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        /*
         * Declare uma variável chamada "nome" e atribua seu nome a ela. Mostre o valor
         * dessa variável no console.
         */
        System.out.println("Exercicio 01:");
        String nome = "Carlos Gabriel";
        System.out.println(nome);
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        /*
         * Declare uma variável chamada "idade" e inicialize-a com o valor 30. Imprima o
         * valor dessa variável no console duas vezes
         */
        System.out.println("Exercicio 02:");
        int idade = 30;
        System.out.println(idade);
        System.out.println(idade);
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // Declare uma variável de ponto flutuante chamada "peso" e atribua o valor 75.5
        // a ela. Faça com que apareça a seguinte frase no console: "Seu peso é: 75.5”
        System.out.println("Exercicio 03:");
        double peso = 75.5;
        System.out.println("Seu peso é: " + peso);
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // Crie uma variável booleana chamada "temInternet" e inicialize-a com um valor
        // verdadeiro. Imprima se você tem internet ou não.
        System.out.println("Exercicio 04:");
        boolean temInternet = true;
        System.out.print("Tem internet: " + temInternet);
        System.out.println();
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        /*
         * Declare uma variável de caractere chamada "letra" e inicialize-a com qualquer
         * letra do alfabeto. Escreva essa letra conforme o exemplo:
         * letra = 'a';
         * a x a x a x a x a
         * ou
         * letra = ‘B’;
         * B x B x B x B x B
         */
        System.out.println("Exercicio 05:");
        char letra = 'a';
        System.out.print(letra + " x " + letra + " x " + letra + " x " + letra + " x " + letra + "\n");
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // Declare uma variável de string chamada "cidade" e peça ao usuário para
        // inserir o nome da cidade onde você mora. Em seguida, imprima o nome da
        // cidade.
        System.out.println();
        System.out.println("Exercicio 06:");
        System.out.print("Insira o nome da cidade: ");
        String cidade = scan.nextLine();
        System.out.println(cidade);
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        /*
         * Declare três variáveis do tipo inteiro chamadas "a", "b" e "c". Inicialize
         * cada uma delas com valores diferentes.
         * Modifique o valor de "a", imprima os valores de "a", "b" e "c".
         */
        System.out.println("Exercicio 07:");
        System.out.println();
        int a = 23;
        int b = 25;
        int c = 27;
        a = 934893;
        System.out.println("a: " + a + " \nb: " + b + " \nc: " + c);
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        /*
         * Declare uma variável do tipo String chamada "filmeFavorito" e peça ao usuário
         * para inserir o nome do seu filme favorito.
         * Modifique o nome do filme e imprima o novo nome.
         */
        System.out.println();
        System.out.println("Exercicio 08:");
        System.out.print("Insira o nome do seu filme favorito: ");
        String filmeFavorito = scan.nextLine();
        filmeFavorito += " da mulesta";
        System.out.println(filmeFavorito);

        scan.close();

    }

}
