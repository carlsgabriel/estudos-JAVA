package POO2Exercicio03;

import java.util.Scanner;

public class AppPOO2Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Título da música: ");
        String titulo = scan.nextLine();

        System.out.print("Artista: ");
        String artista = scan.nextLine();

        System.out.print("Gênero: ");
        String genero = scan.nextLine();

        Musica musica = new Musica();
        musica.setTitulo(titulo);
        musica.setArtista(artista);
        musica.setGenero(genero);
        musica.setOnOff(false);

        boolean continuar = true;
        do{

            System.out.println("\nMENU");
            System.out.println("1. REPRODUZIR");
            System.out.println("2. PAUSAR");
            System.out.println("3. EXIBIR DESCRIÇÃO");
            System.out.println("4. SAIR DO MENU");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch (opcao) {
                case 1 -> System.out.println(musica.reproduzir());
                case 2 -> System.out.println(musica.pausar());
                case 3 -> System.out.println(musica.exibirDescricao());
                case 4 -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Dados inválidos.");
            }

            System.out.print("\nDeseja continuar no menu (sim/nao): ");
            String desejaContinua = scan.nextLine();

            if(desejaContinua.equalsIgnoreCase("sim")){
                continuar = true;
            } else {
                continuar = false;
            }

        }while(continuar != false);
        
        scan.close();
    }

}

