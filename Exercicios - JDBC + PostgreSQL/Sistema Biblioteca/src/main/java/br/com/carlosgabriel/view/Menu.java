package br.com.carlosgabriel.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import br.com.carlosgabriel.DAO.EmprestimosDAOImpl;
import br.com.carlosgabriel.DAO.LivrosDAOImpl;
import br.com.carlosgabriel.model.Emprestimos;
import br.com.carlosgabriel.model.Livros;

public class Menu {

    private Scanner scan = new Scanner(System.in);
    LivrosDAOImpl livrosDAO = new LivrosDAOImpl();
    EmprestimosDAOImpl emprestimoDAO = new EmprestimosDAOImpl();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");

    public void exibirMenu() {
        int op = 0;

        while (op != 3) {
            System.out.println("\nMENU");
            System.out.println("1. Livros");
            System.out.println("2. Empréstimo");
            System.out.println("3. Finalizar programa");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    exibirMenuLivros();
                }
                case 2 -> {
                    exibirMenuEmprestimo();
                }
                case 3 -> {
                    System.out.println("Finalizando o programa...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }

        scan.close();
    }

    private void exibirMenuLivros() {
        int op = 0;

        while (op != 7) {
            System.out.println("\nMENU");
            System.out.println("1. Adicionar Livros");
            System.out.println("2. Buscar Livro por Id");
            System.out.println("3. Listar Livros disponíveis");
            System.out.println("4. Listar livros emprestados");
            System.out.println("5. Atualizar Livro");
            System.out.println("6. Excluir Livro");
            System.out.println("7. Voltar para o Menu Principal");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("\nTitulo do Livro: ");
                    String titulo = scan.nextLine();

                    System.out.print("Autor do Livro: ");
                    String autor = scan.nextLine();

                    Livros livro = new Livros(titulo, autor);
                    livrosDAO.cadastrarLivro(livro);
                }
                case 2 -> {
                    System.out.print("\nID do Livro: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Livros livro = livrosDAO.buscarLivroPorId(id);

                    System.out.println("\nID: " + livro.getId());
                    System.out.println("Titulo: " + livro.getTitulo());
                    System.out.println("Autor: " + livro.getAutor());
                    System.out.println("Disponível: " + livro.getDisponivel());
                }
                case 3 -> {
                    List<Livros> livros = livrosDAO.listarDisponiveis();

                    for (Livros livro : livros) {
                        System.out.println("\nID: " + livro.getId());
                        System.out.println("Titulo: " + livro.getTitulo());
                        System.out.println("Autor: " + livro.getAutor());
                        System.out.println("Disponível: " + livro.getDisponivel());
                    }
                }
                case 4 -> {
                    List<Livros> livros = livrosDAO.buscarEmprestados();

                    for (Livros livro : livros) {
                        System.out.println("\nID: " + livro.getId());
                        System.out.println("Titulo: " + livro.getTitulo());
                        System.out.println("Autor: " + livro.getAutor());
                        System.out.println("Disponível: " + livro.getDisponivel());
                    }
                }
                case 5 -> {
                    List<Livros> livros = livrosDAO.listarDisponiveis();

                    for (Livros livro : livros) {
                        System.out.println("\nID: " + livro.getId());
                        System.out.println("Titulo: " + livro.getTitulo());
                        System.out.println("Autor: " + livro.getAutor());
                        System.out.println("Disponível: " + livro.getDisponivel());
                    }

                    System.out.print("\nInsira o ID do livro que você deseja atualizar: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Livros livro = livrosDAO.buscarLivroPorId(id);

                    System.out.print("\nNovo título: ");
                    String titulo = scan.nextLine();

                    System.out.print("Novo autor: ");
                    String autor = scan.nextLine();

                    livro.setTitulo(titulo);
                    livro.setAutor(autor);

                    livrosDAO.atualizarLivro(livro);
                }
                case 6 -> { 
                    System.out.print("\nInsira o ID do Livro que você deseja excluir: ");
                    int id = scan.nextInt();

                    livrosDAO.excluirLivro(id);
                }
                case 7 -> {
                    System.out.println("\nVoltando para o Menu Principal...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }
    }

    private void exibirMenuEmprestimo() {
        int op = 0;

        while (op != 7) {
            System.out.println("\nMENU");
            System.out.println("1. Registrar Emprestimo");
            System.out.println("2. Buscar Emprestimo por Id");
            System.out.println("3. Listar Emprestimos");
            System.out.println("4. Atualizar Emprestimo");
            System.out.println("5. Registrar devolução");
            System.out.println("6. Excluir Emprestimo");
            System.out.println("7. Voltar para o Menu Principal");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    List<Livros> livros = livrosDAO.listarDisponiveis();

                    for (Livros livro : livros) {
                        System.out.println("\nID: " + livro.getId());
                        System.out.println("Titulo: " + livro.getTitulo());
                        System.out.println("Autor: " + livro.getAutor());
                        System.out.println("Disponível: " + livro.getDisponivel());
                    }

                    System.out.print("\nID Livro: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Livros livro = livrosDAO.buscarLivroPorId(id);

                    System.out.print("Data empréstimo (dia/mes/ano): ");
                    LocalDate data_emprestimo = LocalDate.parse(scan.nextLine(), dtf);

                    Emprestimos emprestimo = new Emprestimos(livro, data_emprestimo);
                    emprestimoDAO.registrarEmprestimo(emprestimo);
                }
                case 2 -> {
                    System.out.print("\nID do Emprestimo: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Emprestimos emprestimo = emprestimoDAO.buscarEmprestimoPorId(id);

                    System.out.println("\nID: " + emprestimo.getId());
                    System.out.println("Livro vinculado: " + emprestimo.getLivro().getTitulo());
                    System.out.println("Data empréstimo: " + emprestimo.getData_emprestimo());
                    System.out.println("Data devolução: " + emprestimo.getData_devolucao());
                }
                case 3 -> {
                    List<Emprestimos> emprestimos = emprestimoDAO.listarEmprestimos();

                    for (Emprestimos emprestimo : emprestimos) {
                        System.out.println("\nID: " + emprestimo.getId());
                        System.out.println("Livro vinculado: " + emprestimo.getLivro().getTitulo());
                        System.out.println("Data empréstimo: " + emprestimo.getData_emprestimo());
                        System.out.println("Data devolução: " + emprestimo.getData_devolucao());
                    }
                }
                case 4 -> {
                    List<Emprestimos> emprestimos = emprestimoDAO.listarEmprestimos();

                    for (Emprestimos emprestimo : emprestimos) {
                        System.out.println("\nID: " + emprestimo.getId());
                        System.out.println("Livro vinculado: " + emprestimo.getLivro().getTitulo());
                        System.out.println("Data empréstimo: " + emprestimo.getData_emprestimo());
                        System.out.println("Data devolução: " + emprestimo.getData_devolucao());
                    }

                    System.out.print("\nInsira o ID do emprestimo que você deseja atualizar: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Emprestimos emprestimo = emprestimoDAO.buscarEmprestimoPorId(id);

                    System.out.print("\nNova data de emprestimo (dia/mes/ano): ");
                    LocalDate novoEmprestimo = LocalDate.parse(scan.nextLine(), dtf);

                    emprestimo.setData_emprestimo(novoEmprestimo);

                    emprestimoDAO.atualizarEmprestimo(emprestimo);
                }
                case 5 -> {
                    List<Emprestimos> emprestimos = emprestimoDAO.listarEmprestimos();

                    for (Emprestimos emprestimo : emprestimos) {
                        System.out.println("\nID: " + emprestimo.getId());
                        System.out.println("Livro vinculado: " + emprestimo.getLivro().getTitulo());
                        System.out.println("Data empréstimo: " + emprestimo.getData_emprestimo());
                        System.out.println("Data devolução: " + emprestimo.getData_devolucao());
                    }

                    System.out.print("\nInsira o ID do emprestimo ao qual você deseja fazer a devolução do livro: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Emprestimos emprestimo = emprestimoDAO.buscarEmprestimoPorId(id);

                    System.out.print("\nData de empréstimo(dia/mes/ano): ");
                    LocalDate novoEmprestimo = LocalDate.parse(scan.nextLine(), dtf);

                    emprestimo.setData_devolucao(novoEmprestimo);

                    emprestimoDAO.registrarDevolucao(emprestimo);
                }
                case 6 -> {
                    System.out.print("\nInsira o ID do emprestimo que você deseja excluir: ");
                    int id = scan.nextInt();

                    emprestimoDAO.excluirEmprestimo(id);
                }
                case 7 -> {
                    System.out.println("Voltando para o Menu Principal...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }
    }

}
