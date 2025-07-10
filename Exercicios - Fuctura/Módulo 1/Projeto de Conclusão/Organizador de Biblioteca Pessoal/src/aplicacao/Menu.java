package aplicacao;

import java.util.Scanner;

import servico.ServicoAlbum;
import servico.ServicoItem;
import servico.ServicoLivro;
import servico.ServicoRevista;

public class Menu {

    Scanner scan = null;
    ServicoLivro servicoLivro = null;
    ServicoRevista servicoRevista = null;
    ServicoAlbum servicoAlbum = null;
    ServicoItem servicoItem = null;

    public Menu(){
        scan = new Scanner(System.in);
        servicoLivro = new ServicoLivro();
        servicoRevista = new ServicoRevista();
        servicoAlbum = new ServicoAlbum();
        servicoItem = new ServicoItem();
    }

    public void exibirMenu(){
        int op = 999;
        while(op != 5){
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
                case 2 -> System.out.println(servicoItem.listar());
                case 5 -> {
                    System.out.println("\nSaindo do programa...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }
        }
    }

    private void menuAdicionarItens(){
        int op = 999;
        while(op != 4){
            System.out.println("\n[SUBMENU 1 - ADICIONAR ITENS]");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Revista");
            System.out.println("3. Adicionar Álbum de musica");
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

}
