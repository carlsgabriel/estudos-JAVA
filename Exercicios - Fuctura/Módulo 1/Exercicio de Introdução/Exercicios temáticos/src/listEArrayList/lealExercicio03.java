import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lealExercicio03 {

    public static void main(String[] args){

        /*Wesley quer criar uma lista com suas músicas favoritas.
        Escreva um programa que permita adicionar músicas a uma lista e exibir a lista completa ao final.*/
        
        Scanner scan = new Scanner(System.in);
        List<String> musicas = new ArrayList<>();
        
        String nome;
        char opcao;
        
        do{
            System.out.println("Qual musica você quer adicionar? Insira abaixo:");
            nome = scan.nextLine();
            musicas.add(nome);

            System.out.println();

            System.out.print("Deseja inserir mais alguma música [s/n]? ");
            opcao = scan.next().charAt(0);
            scan.nextLine();
        } while(opcao != 'n');

        System.out.println();

        System.out.println("Lista de músicas:");
        for(int i=0;i<musicas.size();i++){
            System.out.println((i+1) + ". " + musicas.get(i));
        }

        scan.close();

    }

}