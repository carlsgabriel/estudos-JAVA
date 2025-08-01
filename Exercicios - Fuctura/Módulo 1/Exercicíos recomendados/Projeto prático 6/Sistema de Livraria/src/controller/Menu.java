package controller;

import java.util.Scanner;

public class Menu {

    Scanner scan = null;
    ControllerCategoria controllerCategoria = null;
    ControllerCliente controllerCliente = null;
    ControllerProduto controllerProduto = null;
    ControllerVendedor controllerVendedor = null;
    ControllerVenda controllerVenda = null;

    public Menu(){
        scan = new Scanner(System.in);
        controllerCategoria = new ControllerCategoria();
        controllerCliente = new ControllerCliente();
        controllerProduto = new ControllerProduto();
        controllerVendedor = new ControllerVendedor();
        controllerVenda = new ControllerVenda();
    }

    public void exibirMenu(){
        int op = 999;
        while(op != 4){
            System.out.println("\n1. Manutenção de Cadastro");
            System.out.println("2. Consultas");
            System.out.println("3. Iniciar Venda");
            System.out.println("4. Sair");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> exibirMenuCadastro();
                case 2 -> exibirMenuConsulta();
                case 3 -> exibirMenuVenda();
                case 4 -> {
                    System.out.println("\nFinalizando programa...");
                    return;
                }
                default -> System.out.println("\nDado inválido.");
            }
        }
    }

    private void exibirMenuCadastro(){
        int op = 999;
        while(op != 4){
            System.out.println("\n1. Cadastro de Produto");
            System.out.println("2. Cadastro de Cliente");
            System.out.println("3. Cadastro de Vendedor");
            System.out.println("4. Voltar");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("\n1. Cadastrar Produto");
                    System.out.println("2. Alterar dados do Produto");
                    System.out.println("3. Excluir Produto");
                    System.out.println("4. Voltar para Menu Cadastro");
                    System.out.print("Opção desejada: ");
                    int opMenu = scan.nextInt();
                    scan.nextLine();

                    switch (opMenu) {
                        case 1 -> {
                            System.out.println("\n[DADOS PARA CADASTRO DE PRODUTO]");

                            System.out.print("Nome: ");
                            String nome = scan.nextLine();

                            System.out.print("Preço: R$");
                            double preco = scan.nextDouble();
                            scan.nextLine();

                            System.out.print("Categoria: ");
                            String categoria = scan.nextLine();

                            System.out.println("\n" + controllerProduto.cadastrarProduto(nome, preco, categoria));
                        }
                        case 2 -> {
                            if(ControllerProduto.produtos.size() <= 0){
                                System.out.println("\nNão há produtos a serem listados.");
                            } else {
                                System.out.println("\n[PRODUTOS]");

                                System.out.println(controllerProduto.listarProdutos() + "\n");

                                System.out.print("Nome do produto ao qual você quer alterar as informações: ");
                                String nome = scan.nextLine();

                                //Não é mais necessário pedir para o cliente escolher a categoria daquele produto, já foi resolvido.

                                System.out.println("\n[NOVOS DADOS PARA ALTERAÇÃO DAS INFORMAÇÕES DE PRODUTO]");

                                System.out.print("Nome: ");
                                String nomeNovo = scan.nextLine();

                                System.out.print("Preço: R$");
                                double precoNovo = scan.nextDouble();
                                scan.nextLine();

                                System.out.print("Categoria: ");
                                String categoriaNova = scan.nextLine();

                                System.out.println("\n" + controllerProduto.alterarDados(nome, nomeNovo, precoNovo, categoriaNova));
                            }
                        }
                        case 3 -> {
                            if(ControllerProduto.produtos.size() <= 0){
                                System.out.println("\nNão há produtos a serem excluidos.");
                            } else {
                                System.out.print("\nInsira o nome do produto que você quer remover: ");
                                String nome = scan.nextLine();

                                System.out.println("\n" + controllerProduto.removerProduto(nome));
                            }
                        }
                        case 4 -> {
                            System.out.println("Voltando...");
                            break;
                        }
                        default -> System.out.println("Dado inválido.");
                    }
                }

                case 2 -> {
                    System.out.println("\n1. Cadastrar Cliente");
                    System.out.println("2. Alterar dados do Cliente");
                    System.out.println("3. Excluir Cliente");
                    System.out.println("4. Voltar para Menu Cadastro");
                    System.out.print("Opção desejada: ");
                    int opMenu = scan.nextInt();
                    scan.nextLine();

                    switch (opMenu) {
                        case 1 -> {
                            System.out.println("\n[DADOS PARA CADASTRO DE CLIENTE]");

                            System.out.print("Nome: ");
                            String nome = scan.nextLine();

                            System.out.print("CPF (com 11 digitos e apenas números): ");
                            String cpf = scan.nextLine();

                            System.out.print("Endereço: ");
                            String endereco = scan.nextLine();

                            System.out.println("\n" + controllerCliente.cadastrarCliente(nome, cpf, endereco));
                        }
                        case 2 -> {
                            if(ControllerCliente.clientes.size() <= 0){
                                System.out.println("\nNão há clientes a serem listados.");
                            } else {
                                System.out.print("\nCPF do cliente ao qual você quer alterar as informações: ");
                                String cpf = scan.nextLine();

                                System.out.println("\n[NOVOS DADOS PARA ALTERAÇÃO DAS INFORMAÇÕES DE CLIENTE]");

                                System.out.print("Nome: ");
                                String nomeNovo = scan.nextLine();

                                System.out.print("CPF (com 11 digitos e apenas números): ");
                                String cpfNovo = scan.nextLine();

                                System.out.print("Endereço: ");
                                String enderecoNovo = scan.nextLine();

                                System.out.println("\n" + controllerCliente.alterarDados(cpf, nomeNovo, cpfNovo, enderecoNovo));
                            }
                        }
                        case 3 -> {
                            if(ControllerCliente.clientes.size() <= 0){
                                System.out.println("\nNão há clientes a serem listados.");
                            } else {
                                System.out.print("\nCPF do cliente ao qual você quer excluir do sistema: ");
                                String cpf = scan.nextLine();

                                System.out.println("\n" + controllerCliente.removerCliente(cpf));
                            }
                        }
                        case 4 -> {
                            System.out.println("Voltando...");
                            break;
                        }
                        default -> System.out.println("Dado inválido.");
                    }
                }

                case 3 -> {
                    System.out.println("\n1. Cadastrar Vendedor");
                    System.out.println("2. Alterar dados do Vendedor");
                    System.out.println("3. Excluir Vendedor");
                    System.out.println("4. Voltar para Menu Cadastro");
                    System.out.print("Opção desejada: ");
                    int opMenu = scan.nextInt();
                    scan.nextLine();

                    switch (opMenu){
                        case 1 -> {
                            System.out.println("\n[DADOS PARA CADASTRO DE VENDEDOR]");

                            System.out.print("Nome: ");
                            String nome = scan.nextLine();

                            System.out.print("CPF (com 11 digitos e apenas números): ");
                            String cpf = scan.nextLine();

                            System.out.println("\n" + controllerVendedor.cadastrarVendedor(nome, cpf));
                        }
                        case 2 -> {
                            if(ControllerVendedor.vendedores.size() <= 0){
                                System.out.println("\nNão há vendedores a serem listados.");
                            } else {
                                System.out.print("\nInsira o CPF do vendedor ao qual você deseja alterar os dados: ");
                                String cpf = scan.nextLine();

                                System.out.println("\n[NOVOS DADOS PARA ALTERAÇÃO DAS INFORMAÇÕES DE VENDEDOR]");

                                System.out.print("Nome: ");
                                String nomeNovo = scan.nextLine();

                                System.out.print("CPF (com 11 digitos e apenas números): ");
                                String cpfNovo = scan.nextLine();

                                System.out.println("\n" + controllerVendedor.alterarDados(cpf, nomeNovo, cpfNovo));
                            }
                            
                        }
                        case 3 -> {
                            if(ControllerVendedor.vendedores.size() <= 0){
                                System.out.println("\nNão há vendedores a serem listados.");
                            } else {
                                System.out.print("\nCPF do vendedor ao qual você quer excluir do sistema: ");
                                String cpf = scan.nextLine();

                                System.out.println("\n" + controllerVendedor.removerVendedor(cpf));
                            }
                        }
                        case 4 -> {
                            System.out.println("Voltando...");
                            break;
                        }
                        default -> System.out.println("Dado inválido.");
                    }
                }

                case 4 -> {
                    break;
                }

                case 5 -> System.out.println("Dados inválidos.");
            }
        }
    }

    private void exibirMenuConsulta(){
        int op = 999;
        while(op != 5){
            System.out.println("\n1. Consultar Produtos por Categoria");
            System.out.println("2. Consultar cliente por CPF");
            System.out.println("3. Consultar vendedor por CPF");
            System.out.println("4. Listar vendas");
            System.out.println("5. Voltar");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("\nInsira o nome da categoria ao qual você quer listar os produtos: ");
                    String categoria = scan.nextLine();

                    System.out.println("\n" + controllerCategoria.consultarProdutosPorCategoria(categoria));
                }
                case 2 -> {
                    System.out.print("\nInsira o CPF do cliente ao qual você quer consultar: ");
                    String cpf = scan.nextLine();

                    System.out.println("\n" + controllerCliente.consultarCliente(cpf));
                }
                case 3 -> {
                    System.out.print("\nInsira o CPF do vendedor ao qual você quer consultar: ");
                    String cpf = scan.nextLine();

                    System.out.println("\n" + controllerVendedor.consultarVendedor(cpf));
                }
                case 4 -> {
                    System.out.println("\n" + controllerVenda.listarVendas());
                }
                case 5 -> {
                    break;
                }
                default -> System.out.println("Valor inválido.");

            }
        }while(op != 5);   
    }

    private void exibirMenuVenda(){
        int op = 999;
        while(op != 8){
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Calcular Total");
            System.out.println("4. Associar Cliente");
            System.out.println("5. Associar Vendedor");
            System.out.println("6. Concluir Venda");
            System.out.println("7. Cancelar Venda");
            System.out.println("8. Voltar para o menu principal");
            System.out.print("Opção desejada: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("\nInsira o nome do produto que você deseja adicionar a venda: ");
                    String nome = scan.nextLine();

                    System.out.println("\n" + controllerVenda.adicionarProduto(nome));
                }
                case 2 -> {
                    System.out.print("\nInsira o nome do produto que você deseja remover da venda: ");
                    String nome = scan.nextLine();

                    System.out.println("\n" + controllerVenda.removerProduto(nome));
                }
                case 3 -> {
                    System.out.println("\n" + controllerVenda.calcularTotal());
                }
                case 4 -> {
                    System.out.print("\nInsira o CPF do cliente ao qual você deseja associar a venda: ");
                    String cpf = scan.nextLine();

                    System.out.println("\n" + controllerVenda.associarCliente(cpf));
                }
                case 5 -> {
                    System.out.print("\nInsira o CPF do vendedor ao qual você deseja associar a venda: ");
                    String cpf = scan.nextLine();

                    System.out.println("\n" + controllerVenda.associarVendedor(cpf));
                }
                case 6 -> System.out.println(controllerVenda.concluirVenda());
                case 7 -> {
                    System.out.println("\n" + controllerVenda.cancelarVenda());
                }
                case 8 -> {
                    System.out.println("\nVoltando para o menu principal...");
                    return;
                }
                default -> System.out.println("Dados inválidos.");
            }
        }
    }

}
