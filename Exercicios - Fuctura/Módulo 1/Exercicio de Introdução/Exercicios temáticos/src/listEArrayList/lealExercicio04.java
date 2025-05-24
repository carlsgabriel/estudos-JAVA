import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lealExercicio04 {

    public static void main(String[] args){

        /*Em uma turma, os alunos são registrados em uma lista.
        Escreva um programa que permita cadastrar o nome dos alunos e listar todos os nomes ao final, mostrando quantos alunos foram cadastrados.*/
        
        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        char opcao;
        int sum = 0;

        do{
            System.out.print("Insira o nome do aluno a ser cadastrado: ");
            String nome = scan.nextLine();
            nomes.add(nome);
            sum++;
        
            System.out.print("Quer continuar inserindo alunos [s/n]: ");
            opcao = scan.next().charAt(0);
            scan.nextLine();

            System.out.println();
        } while (opcao != 'n');

        System.out.println("Foram inseridos " + sum + " alunos, os nomes dos alunos inseridos vão ser exibidos abaixo: ");
        for(int i=0;i<nomes.size();i++){
            System.out.println((i+1) + ". " + nomes.get(i));
        }
        
            
        scan.close();

    }

}