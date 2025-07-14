package POO2Exercicio10;

import java.util.Scanner;

public class AppPOO2Exercicio10 {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        CaixaSupermercado caixaSupermercado = new CaixaSupermercado(1);

        int count = 0;
        boolean continuar = true;
        while (continuar) {

            System.out.println("----- CAIXA -----");
            System.out.println("1. ADICIONAR PRODUTO");
            System.out.println("2. REMOVER PRODUTO");
            System.out.println("3. CALCULAR TOTAL DA COMPRA");
            System.out.println("4. IMPRIMIR RECIBO COMPRA");
            System.out.println("5. FECHAR COMPRA");
            System.out.println("6. PAGAMENTO [DINHEIRO, PIX OU CARTÃO]");
            System.out.println("7. SAIR DO CAIXA");
            System.out.print("Opção desejada: ");
            int opcaopDesejada = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch (opcaopDesejada) {
                case 1 -> {
                    System.out.print("Nome do item: ");
                    String nomeProduto = scan.nextLine();

                    System.out.print("Preço unitário do item: R$");
                    double precoProduto = scan.nextDouble();

                    System.out.print("Quantidade do produto: ");
                    int quantidadeProduto = scan.nextInt();
                    scan.nextLine();

                    caixaSupermercado.adicionarItemCompra(new Produto(nomeProduto, precoProduto, quantidadeProduto));

                    System.out.println("\nProduto adicionado com sucesso!");
                }
                case 2 -> {
                    if(caixaSupermercado.itensComprados.size() > 0){
                        System.out.println("PRODUTOS: ");
                    
                        for(Produto p : caixaSupermercado.itensComprados){
                            System.out.println(p.getNome());
                        }

                        System.out.print("Insira o nome do produto que deseja remover: ");
                        String nomeProdutoRemover = scan.nextLine();

                        Produto produto = null;
                        for(Produto p : caixaSupermercado.itensComprados){
                            if(p.getNome().equalsIgnoreCase(nomeProdutoRemover)){
                                produto = p;
                            }
                        }
                        caixaSupermercado.itensComprados.remove(produto);

                        System.out.println("\nProduto removido com sucesso!");
                    } else {
                        System.out.println("Não há produtos a serem removidos.");
                    }
                }
                case 3 -> {
                    if(caixaSupermercado.itensComprados.size() > 0){
                        System.out.println("O valor total de todos os produtos é: R$" + caixaSupermercado.calcularTotalCompra() + " reais.");
                    } else {
                        System.out.println(caixaSupermercado.calcularTotalCompra());
                    }
                }
                case 4 -> {
                    if(count == 1){
                        System.out.println(caixaSupermercado.notaFiscal());
                        return;
                    } else {
                        System.out.println("Você precisa primeiro efetuar o pagamento e depois fechar a compra para obter a nota fiscal.");
                    }
                    
                }
                case 5 -> {
                    if(count == 1){
                        System.out.println(caixaSupermercado.fecharCompra());
                    } else {
                        System.out.println("Para fechar a compra, você precisa efetuar o pagamento.");
                    }
                }
                case 6 -> {
                    if(caixaSupermercado.itensComprados.size() > 0){
                        System.out.println("Como deseja pagar?");
                        System.out.println("1. DINHEIRO");
                        System.out.println("2. PIX");
                        System.out.println("3. CARTAO");
                        System.out.print("Opção desejada: ");
                        int opcaoDesejada3 = scan.nextInt();

                        System.out.println();

                        if(opcaoDesejada3 == 1){
                            System.out.println(caixaSupermercado.aceitarPagamento("dinheiro"));
                        } else if (opcaoDesejada3 == 2) {
                            System.out.println(caixaSupermercado.aceitarPagamento("pix"));
                        } else if (opcaoDesejada3 == 3){
                            System.out.println(caixaSupermercado.aceitarPagamento("cartão"));
                        } else {
                            System.out.println("Opção inválida.");
                        }
                        count++;
                    } else {
                        System.out.println("Não tem como definir a forma de pagamento pois a lista está vazia.");
                    }
                }
                case 7 -> {
                    System.out.println("Saindo do caixa...");
                    return;
                }
                default -> {
                    System.out.println("Valor inválido.");
                }
            }

            System.out.println();

            System.out.println("Deseja continuar?");
            System.out.println("1. SIM");
            System.out.println("2. NAO");
            System.out.print("Opção desejada: ");
            int opcaopDesejada2 = scan.nextInt();
            scan.nextLine();

            System.out.println();
    
            if(opcaopDesejada2 == 1){
                continuar = true;
            } else {
                System.out.println("Finalizando programa...");
                continuar = false;
            }
        }

        scan.close();

    }

}
