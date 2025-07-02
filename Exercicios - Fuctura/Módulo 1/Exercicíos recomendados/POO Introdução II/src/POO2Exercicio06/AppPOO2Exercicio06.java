package POO2Exercicio06;

import java.util.Scanner;

public class AppPOO2Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Cor da tinta: ");
        String corTinta = scan.nextLine();

        System.out.print("Tamanho da ponta [Pequena, media ou grande]: ");
        String tamanhoPonta = scan.nextLine();

        System.out.print("Marca: ");
        String marca = scan.nextLine();

        Caneta caneta = new Caneta();
        caneta.setCorDaTinta(corTinta);
        caneta.setTamanhoDaPonta(tamanhoPonta);
        caneta.setMarca(marca);
        caneta.setNivelDeTinta(100);

        System.out.println();


        boolean continuar = true;
        while(continuar != false){

            System.out.println("CANETA:");
            System.out.println("Cor da tinta: " + caneta.getCorDaTinta());
            System.out.println("Tamanho da ponta: " + caneta.getTamanhoDaPonta());
            System.out.println("Marca: " + caneta.getMarca());

            System.out.println();

            System.out.println("MENU");
            System.out.println("1. ESCREVER");
            System.out.println("2. TROCAR COR DA TINTA");
            System.out.println("3. VERIFICAR NÍVEL DE TINTA");
            System.out.println("4. SAIR DO MENU");
            System.out.print("Opção desejada: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            System.out.println();

        
            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira o que você quer que seja escrito com a caneta abaixo: ");
                    String texto = scan.nextLine();

                    System.out.println("\n" + caneta.escrever(texto) + "\n");
                }
                case 2 -> {
                    System.out.print("A cor " + caneta.getCorDaTinta().toLowerCase() + " será alterada para: ");
                    String novaTintaCaneta = scan.nextLine();

                    System.out.println("\n" + caneta.trocarTinta(novaTintaCaneta) + "\n");
                }
                case 3 -> {
                   System.out.println(caneta.verificarNivelTinta() + "\n");
                }
                case 4 -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Valor inválido. \n");
            }
        }
        

        scan.close();

    }

}