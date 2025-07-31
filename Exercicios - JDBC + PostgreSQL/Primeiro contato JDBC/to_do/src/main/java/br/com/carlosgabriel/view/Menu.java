package br.com.carlosgabriel.view;

import java.util.List;
import java.util.Scanner;

import br.com.carlosgabriel.DAO.TarefasDAOImpl;
import br.com.carlosgabriel.model.Tarefas;

public class Menu {

    public void exibirMenu() {

        Scanner scan = new Scanner(System.in);
        TarefasDAOImpl tarefasDAO = new TarefasDAOImpl();

        int op = 0;
        while (op != 7) {
            System.out.println("\nMENU");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Buscar Tarefa por Id");
            System.out.println("3. Listar por status");
            System.out.println("4. Atualizar status da Tarefa");
            System.out.println("5. Excluir Tarefa");
            System.out.println("6. Contar Tarefas");
            System.out.println("7. Finalizar programa");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("\nInsira a descrição da tarefa abaixo:");
                    String descricao = scan.nextLine();

                    Tarefas tarefa = new Tarefas(descricao);
                    tarefasDAO.criarTarefa(tarefa);
                }
                case 2 -> {
                    System.out.print("\nInsira o Id da Tarefa: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Tarefas tarefa = tarefasDAO.buscarTarefaPorId(id);

                    System.out.println("\nID: " + tarefa.getId());
                    System.out.println("Descricao: " + tarefa.getDescricao());
                    System.out.println("Status: " + tarefa.getStatus());
                    System.out.println("Data de criacao: " + tarefa.getData_criacao());
                }
                case 3 -> {
                    System.out.println("\n[STATUS]:");
                    System.out.println("Pendente");
                    System.out.println("Em andamento");
                    System.out.println("Concluida");
                    System.out.print("Opção desejada: ");
                    String status = scan.nextLine();

                    if (status.equalsIgnoreCase("pendente") || status.equalsIgnoreCase("em andamento")
                            || status.equalsIgnoreCase("concluida")) {
                        List<Tarefas> tarefas = tarefasDAO.listarTarefasPorStatus(status.toLowerCase());

                        for (Tarefas t : tarefas) {
                            System.out.println("\nID: " + t.getId());
                            System.out.println("Descricao: " + t.getDescricao());
                            System.out.println("Status: " + t.getStatus());
                            System.out.println("Data de criacao: " + t.getData_criacao());
                        }
                    } else {
                        System.out.println("\nNão há um status desse tipo.");
                    }
                }
                case 4 -> {
                    List<Tarefas> tarefas = tarefasDAO.listarTarefas();

                    for (Tarefas t : tarefas) {
                        System.out.println("\nID: " + t.getId());
                        System.out.println("Descricao: " + t.getDescricao());
                        System.out.println("Status: " + t.getStatus());
                        System.out.println("Data de criacao: " + t.getData_criacao());
                    }

                    System.out.print("\nInsira o ID da Tarefa que você deseja atualizar o status: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Tarefas tarefa = tarefasDAO.buscarTarefaPorId(id);

                    System.out.println("\nPra qual status você deseja alterar?");
                    System.out.println("Pendente");
                    System.out.println("Em andamento");
                    System.out.println("Concluida");
                    System.out.print("Opção desejada: ");
                    String status = scan.nextLine().toLowerCase();

                    if (status.equalsIgnoreCase("pendente") || status.equalsIgnoreCase("em andamento")
                            || status.equalsIgnoreCase("concluida")) {
                        tarefa.setStatus(status);

                        tarefasDAO.atualizarStatusTarefa(tarefa);
                    } else {
                        System.out.println("\nNão há um status desse tipo.");
                    }
                }
                case 5 -> {
                    List<Tarefas> tarefas = tarefasDAO.listarTarefas();

                    for (Tarefas t : tarefas) {
                        System.out.println("\nID: " + t.getId());
                        System.out.println("Descricao: " + t.getDescricao());
                        System.out.println("Status: " + t.getStatus());
                        System.out.println("Data de criacao: " + t.getData_criacao());
                    }

                    System.out.print("\nInsira o ID da Tarefa que você deseja excluir: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    tarefasDAO.excluirTarefa(id);
                }
                case 6 -> {
                    System.out.println("\n" + tarefasDAO.contarTarefas());
                }
                case 7 -> {
                    System.out.println("\nFinalizando do programa...");
                    break;
                }
                default -> System.out.println("Dado inválido.");
            }
        }

    }

}
