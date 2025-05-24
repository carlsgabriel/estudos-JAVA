import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lealExercicio02 {

    public static void main(String[] args){

        /*Seu Gumercindo tem uma pequena biblioteca em casa e quer catalogar seus livros. 
        Crie um programa que permita adicionar, remover e listar os títulos dos livros em uma lista.*/
        
        Scanner scan = new Scanner(System.in);
        List<String> livros = new ArrayList<>();
        int opcao;

        do{
            System.out.println("Opções do sistema:");
            System.out.println("1. Adicionar livros");
            System.out.println("2. Remover livros");
            System.out.println("3. Listar livros");
            System.out.println("0. Sair do sitema");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch(opcao){
                case 1:
                    System.out.println("Insira a baixo o nome do livro a ser adicionado:");
                    String nome = scan.nextLine();
                    System.out.println();
                    livros.add(nome);
                    break;
                case 2:
                    System.out.println("Insira a baixo o nome do livro a ser removido:");
                    nome = scan.nextLine();
                    System.out.println();
                    livros.remove(nome);
                    break;
                case 3:
                    for(int i=0;i<livros.size();i++){
                        System.out.println((i+1) + ". " + livros.get(i));
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println();
                    break;
            }

        }while (opcao != 0);
        
        scan.close();

    }

}