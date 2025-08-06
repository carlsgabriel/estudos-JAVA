import java.util.Scanner;

public class Menu {

    private Imobiliaria imobiliaria;
    private Scanner scan;

    public Menu() {
        imobiliaria = new Imobiliaria();
        scan = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao = 999;
        do {

            System.out.println("MENU");
            System.out.println("1. ADICIONAR CONSTRUÇÕES.");
            System.out.println("2. REMOVER CONSTRUÇÕES.");
            System.out.println("3. LISTAR CONSTRUCÕES.");
            System.out.println("4. INFORMAR ÁREA TOTAL DAS CONSTRUÇÕES.");
            System.out.println("5. SAIR DO MENU.");
            System.out.print("Opção desejada: ");
            int opcaoMenu = scan.nextInt();

            System.out.println();

            switch (opcaoMenu) {
                case 1 -> adicionarConstrucao();
                case 2 -> removerConstrucao();
                case 3 -> listarConstrucoes();
                case 4 -> informarAreaTotal();
                case 5 -> {
                    System.out.println("Saindo do menu...");
                    break;
                }
                default -> System.out.println("Valor inválido.");
            }

        } while (opcao != 5);
    }

    private void adicionarConstrucao() {
        System.out.println("Tipos de construção:");
        System.out.println("1. Casa");
        System.out.println("2. Prédio");
        System.out.println("3. Loja");
        System.out.print("Opção desejada: ");
        int tipo = scan.nextInt();
        scan.nextLine();

        System.out.println();

        System.out.print("Endereço: ");
        String endereco = scan.nextLine();

        System.out.print("Preço: ");
        double preco = scan.nextDouble();

        System.out.print("Comprimento: ");
        double comprimento = scan.nextDouble();

        System.out.print("Largura: ");
        double largura = scan.nextDouble();
        scan.nextLine();

        if (tipo == 1) {
            imobiliaria.adicionarConstrucao(new Casa(endereco, preco, comprimento, largura));

            System.out.println("\nCasa adicionada com sucesso.");
        } else if (tipo == 2) {
            System.out.print("Quantidade de andares: ");
            int quantidade = scan.nextInt();

            imobiliaria.adicionarConstrucao(new Predio(endereco, preco, comprimento, largura, quantidade));

            System.out.println("\nPredio adicionada com sucesso.");
        } else if (tipo == 3) {
            System.out.print("Nome da loja: ");
            String nomeLoja = scan.nextLine();

            imobiliaria.adicionarConstrucao(new Loja(endereco, preco, comprimento, largura, nomeLoja));

            System.out.println("\nLoja adicionada com sucesso.");
        } else {
            System.out.println("\nValor inválido.");
        }
    }

    private void removerConstrucao() {
        listarConstrucoes();

        System.out.println();

        System.out.print("Insira o índice/posição da construção que você quer remover: ");
        int remover = scan.nextInt();

        imobiliaria.removerConstrucao(imobiliaria.getImoveis().get(remover - 1));

    }

    private void listarConstrucoes() {
        int count = 1;

        System.out.println("Construções: ");
        for (Imovel imovel : imobiliaria.getImoveis()) {
            System.out.println(count + ". " + imovel.getDescricao());
            count++;
        }
    }

    private void informarAreaTotal() {
        double sum = 0;

        for (Imovel imovel : imobiliaria.getImoveis()) {
            sum += imovel.calcularArea();
        }

        System.out.println("Valor total das áreas das construções: " + String.format("%.1f", sum) + "m².");
    }

}
