import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class lealExercicio05 {

    public static void main(String[] args) {

        /*Jurema quer organizar seus 10 filmes favoritos. 
        Crie um programa que permita adicionar até 10 filmes a uma lista. 
        Caso mais de 10 filmes sejam inseridos, mostre uma mensagem de aviso. */

        List<String> filmes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int i = 1;

        do {
            if (i <= 10) {
                System.out.print("Nome do filme a ser adicionado: ");
                String nome = scan.nextLine();
                filmes.add(nome);
                i++;
            } else {
                System.out.print("Nome do filme a ser adicionado: ");
                String nome = scan.nextLine();
                System.out.println();
                System.out.println("Desculpe, mas você só pode adicionar no máximo 10 filmes.");
                System.out.println("O filme (" + nome + ") não foi adicionado a lista.");
                break;
            }
        } while (i <= 11);

        System.out.println();

        System.out.println("Lista de filmes você adicionou: ");
        for (int j = 0; j < 10; j++) {
            System.out.println((j + 1) + ". " + filmes.get(j));
        }

        scan.close();

    }

}