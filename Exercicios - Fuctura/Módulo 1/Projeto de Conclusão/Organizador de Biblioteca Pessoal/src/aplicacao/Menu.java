package aplicacao;

import java.util.Scanner;

import servico.ServicoAlbum;
import servico.ServicoCategoria;
import servico.ServicoItem;
import servico.ServicoLivro;
import servico.ServicoRevista;

public class Menu {

    Scanner scan = null;
    ServicoLivro servicoLivro = null;
    ServicoRevista servicoRevista = null;
    ServicoAlbum servicoAlbum = null;
    ServicoItem servicoItem = null;
    ServicoCategoria servicoCategoria = null;

    public Menu() {
        scan = new Scanner(System.in);
        servicoLivro = new ServicoLivro();
        servicoRevista = new ServicoRevista();
        servicoAlbum = new ServicoAlbum();
        servicoItem = new ServicoItem();
        servicoCategoria = new ServicoCategoria();
    }

    public void exibirMenu() {
        int op = 999;
        while (op != 5) {
            System.out.println("\n[MENU DA BIBLIOTECA PESSOAL]");
            System.out.println("1. Adicionar itens");
            System.out.println("2. Listar itens");
            System.out.println("3. Filtrar por categoria");
            System.out.println("4. Remover itens");
            System.out.println("5. Sair do programa");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> menuAdicionarItens();
                case 2 -> System.out.println("\n" + servicoItem.listar());
                case 3 -> menuFiltrarProCategoria();
                case 4 -> menuRemoverItens();
                case 5 -> {
                    System.out.println("\nSaindo do programa...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }
    }

    private void menuAdicionarItens() {
        int op = 999;
        while (op != 4) {
            System.out.println("\n[SUBMENU 1 - ADICIONAR ITENS]");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Revista");
            System.out.println("3. Adicionar Álbum");
            System.out.println("4. Voltar para o Menu Principal");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("\nTitulo do livro: ");
                    String titulo = scan.nextLine();

                    System.out.print("Autor ou artista do livro: ");
                    String autorOuArtista = scan.nextLine();

                    System.out.print("Categoria do livro: ");
                    String categoria = scan.nextLine();

                    System.out.println("\n" + servicoLivro.adicionar(titulo, autorOuArtista, categoria));
                }
                case 2 -> {
                    System.out.print("\nTitulo da revista: ");
                    String titulo = scan.nextLine();

                    System.out.print("Autor ou artista da revista: ");
                    String autorOuArtista = scan.nextLine();

                    System.out.print("Categoria do revista: ");
                    String categoria = scan.nextLine();

                    System.out.println("\n" + servicoRevista.adicionar(titulo, autorOuArtista, categoria));
                }
                case 3 -> {
                    System.out.print("\nTitulo do álbum: ");
                    String titulo = scan.nextLine();

                    System.out.print("Autor ou artista do álbum: ");
                    String autorOuArtista = scan.nextLine();

                    System.out.print("Categoria do álbum: ");
                    String categoria = scan.nextLine();

                    System.out.println("\n" + servicoAlbum.adicionar(titulo, autorOuArtista, categoria));
                }
                case 4 -> {
                    System.out.println("\nVoltando para o menu principal...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }
    }

    private void menuFiltrarProCategoria() {
        int op = 999;
        while (op != 4) {
            System.out.println("\n[SUBMENU 2 - LISTAR POR CATEGORIA]");
            System.out.println("Que tipo de item você quer verificar?");
            System.out.println("1. Livro");
            System.out.println("2. Revista");
            System.out.println("3. Album");
            System.out.println("4. Voltar para o Menu Principal");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    String tipo = "Livro";

                    System.out.print("\nInsira a categoria do livro: ");
                    String categoria = scan.nextLine();

                    System.out.println(servicoCategoria.filtrarCategoriaEspecifica(tipo, categoria));
                }
                case 2 -> {
                    String tipo = "Revista";

                    System.out.print("\nInsira a categoria da revista: ");
                    String categoria = scan.nextLine();

                    System.out.println(servicoCategoria.filtrarCategoriaEspecifica(tipo, categoria));
                }
                case 3 -> {
                    String tipo = "Album";

                    System.out.print("\nInsira a categoria do Álbum: ");
                    String categoria = scan.nextLine();

                    System.out.println(servicoCategoria.filtrarCategoriaEspecifica(tipo, categoria));
                }
                case 4 -> {
                    System.out.println("\nVoltando para o menu...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }
    }

    private void menuRemoverItens() {
        int op = 999;
        while (op != 4) {
            System.out.println("\n[SUBMENU 4 - REMOVER ITENS]");
            System.out.println("1. Remover Livro");
            System.out.println("2. Remover Revista");
            System.out.println("3. Remover Álbum");
            System.out.println("4. Voltar para o Menu Principal");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    String tipo = "Livro";

                    System.out.print("\nInsira o titulo do livro que você deseja remover: ");
                    String titulo = scan.nextLine();

                    System.out.println("\n" + servicoItem.remover(tipo, titulo));
                }
                case 2 -> {
                    String tipo = "Revista";

                    System.out.print("\nInsira o titulo da revista que você deseja remover: ");
                    String titulo = scan.nextLine();

                    System.out.println("\n" + servicoItem.remover(tipo, titulo));
                }
                case 3 -> {
                    String tipo = "Album";

                    System.out.print("\nInsira o titulo do álbum que você deseja remover: ");
                    String titulo = scan.nextLine();

                    System.out.println("\n" + servicoItem.remover(tipo, titulo));
                }
                case 4 -> {
                    System.out.println("\nVoltando para o menu principal...");
                    return;
                }
                default -> System.out.println("\nValor inválido.");
            }
        }
    }

}
