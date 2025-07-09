package aplicacao;

import java.util.Scanner;
import servico.ServicoLivro;

public class Menu {

    Scanner scan = null;
    ServicoLivro servicoLivro = null;


    public Menu(){
        scan = new Scanner(System.in);
        servicoLivro = new ServicoLivro();
    }

    public void exibirMenu(){
        int op = 999;
        while(op != 5){
            System.out.println("\n[MENU DA BIBLIOTECA PESSOAL]");
            System.out.println("1. Adicionar itens");
            System.out.println("2. Remover itens");
            System.out.println("3. Listar itens");
            System.out.println("4. Filtrar itens por categoria");
            System.out.println("5. Sair do programa");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> menuAdicionarItens();
                // case 2 -> menuRemoverItens();
                // case 3 -> menuListarItens();
                // case 4 -> menuFiltrarPorCategoria();
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
            }
        }
    }

}
