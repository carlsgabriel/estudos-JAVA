import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){

        /*Seu Creso tem uma loja de animais e precisa de um programa que armazene o nome de cada animal, sua espécie e idade em anos.
        Além disso, ele quer saber quanto cada um dos animais come em gramas de ração por dia.
        Crie variáveis para armazenar essas informações e exiba tudo de maneira organizada para Seu Creso revisar. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos animais serão cadastrados? ");
        int qtd = scan.nextInt();
        scan.nextLine();

        String[] nomes = new String[qtd];
        String[] especies = new String[qtd];
        int[] anos = new int[qtd];
        int[] gramas = new int[qtd];

        for(int i=0;i<qtd;i++){

            System.out.print("Insira o nome do animal: ");
            String nome = scan.nextLine();

            System.out.print("Qual a espécie do animal inserido? ");
            String especie = scan.nextLine();

            System.out.print("Quantos anos tem o animal? ");
            int ano = scan.nextInt();

            System.out.print("Por ultimo, quantos gramas de ração por dia esse animal come? ");
            int g = scan.nextInt();
            scan.nextLine();

            System.out.println("");


            nomes[i] = nome;
            especies[i] = especie;
            anos[i] = ano;
            gramas[i] = g;

        }

        for(int i=0;i<qtd;i++){
            System.out.println("Informações do " + (i+1) + "º animal: ");
            System.out.println("Nome do animal: " + nomes[i]);
            System.out.println("Espécie: " + especies[i]);
            System.out.println("Idade: " + anos[i]);
            System.out.println("Quantidade em gramas de ração consumida: " + gramas[i]);
            System.out.println("");
        }

        scan.close();

    }

}
