package POO2Exercicio01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppPOO02Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Descricao da tarefa:");
        String desc = scan.nextLine();

        System.out.println();
        
        System.out.print("Pendente ou concluida: ");
        String op = scan.nextLine().toUpperCase();
        boolean opcao;
        if (op.equals("PENDENTE")) {
            opcao = false;
        } else if (op.equals("CONCLUIDA") || op.equals("CONCLUÍDA")) {
            opcao = true;
        } else {
            System.out.println("O estado da tarefa inserido é inválido... tente novamente.\n");

            System.out.print("Pendente ou concluida: ");
            op = scan.nextLine().toUpperCase();

            if (op.equals("PENDENTE")) {
                opcao = false;
            } else {
                opcao = true;
            }
        }

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(desc);
        tarefa.setDataDeCriacao(new Date());
        tarefa.setEstado(opcao);

        System.out.println();

        System.out.println("Descrição da tarefa: " + tarefa.getDescricao());
        System.out.println("Data de criação da tarefa: " + sdf.format(tarefa.getDataDeCriacao()));
        System.out.println("Tarefa concluída: " + tarefa.getEstado());

        System.out.println();

        if (tarefa.getEstado() == false) {
            System.out.println("Gostaria de mudar o estado da tarefa para true?");
            System.out.print("Sim ou não: ");
            op = scan.nextLine().toUpperCase();
            if (op.equals("SIM")) {
                tarefa.setEstado(true);
            }
        } else {
            System.out.println("Gostaria de mudar o estado da tarefa para false?");
            System.out.print("Sim ou não: ");
            op = scan.nextLine().toUpperCase();
            if (op.equals("SIM")) {
                tarefa.setEstado(false);
            }
        }

        System.out.println("\nGostaria de editar a descrição?");
        System.out.print("Sim ou não: ");
        op = scan.nextLine();
        if (op.equals("sim") || op.equals("Sim")) {
            System.out.println("Insira a nova descrição:");
            String novaDesc = scan.nextLine();
            tarefa.setDescricao(novaDesc);
        }

        System.out.println();

        System.out.println("Descrição da tarefa: " + tarefa.getDescricao());
        System.out.println("Data de criação da tarefa: " + sdf.format(tarefa.getDataDeCriacao()));
        System.out.println("Tarefa concluída: " + tarefa.getEstado());

        scan.close();

    }

}