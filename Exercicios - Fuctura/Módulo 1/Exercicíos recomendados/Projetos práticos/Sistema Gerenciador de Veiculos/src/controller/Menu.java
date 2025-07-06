package controller;

import java.util.Scanner;

public class Menu {

    Scanner scan;
    GerenciarVeiculo gerenciarVeiculo;
    GerenciarLoja gerenciarLoja;
    GerenciarVendedor gerenciarVendedor;
    GerenciarCliente gerenciarCliente;
    GerenciarVenda gerenciarVenda;

    public Menu(){
        scan = new Scanner(System.in);
        gerenciarVeiculo = new GerenciarVeiculo();
        gerenciarLoja = new GerenciarLoja();
        gerenciarVendedor = new GerenciarVendedor();
        gerenciarCliente = new GerenciarCliente();
        gerenciarVenda = new GerenciarVenda();
    }

    public void exibirMenu(){

        int opcao = 999;
        do{
            System.out.println("MENU");
            System.out.println("1. Frente da loja");
            System.out.println("2. Administração de cadastro");
            System.out.println("3. Sair do menu");
            System.out.print("Opção desejada: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> menuFrenteLoja();
                case 2 -> menuCadastro();
                case 3 -> {
                    System.out.println("\nSaindo do menu...");
                    return;
                }
                default -> System.out.println("\nDados inválidos.\n");
            }
        }while(opcao != 3);
        
    }

    private void menuFrenteLoja(){

        int opcaoMenuFrenteLoja = 999;
        while(opcaoMenuFrenteLoja != 6){
            System.out.println("\nMENU FRENTE DE LOJA");
            System.out.println("1. Gerenciar veículo");
            System.out.println("2. Gerenciar loja");
            System.out.println("3. Gerenciar vendedor");
            System.out.println("4. Gerenciar cliente");
            System.out.println("5. Gerenciar venda");
            System.out.println("6. Voltar para o menu superior");
            System.out.print("Opção desejada: ");
            opcaoMenuFrenteLoja = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenuFrenteLoja) {
                case 1 -> {
                    if(GerenciarVeiculo.veiculos.size() <= 0){
                        System.out.println("\nNão há veiculos a serem gerenciados.");
                        break;
                    } else {
                        System.out.println("\n1. Consultar veículo");
                        System.out.println("2. Voltar para o menu anterior");
                        System.out.print("Opção desejada: ");
                        opcaoMenuFrenteLoja = scan.nextInt();
                        scan.nextLine();

                        if(opcaoMenuFrenteLoja == 1){
                            System.out.print("\nPlaca do carro: ");
                            String placa = scan.nextLine();

                            System.out.println("\n" + gerenciarVeiculo.consultarVeiculo(placa));
                        } else if (opcaoMenuFrenteLoja == 2){
                            break;
                        } else {
                            System.out.println("\nValor inválido.");
                        }
                    }
                    
                }
                case 2 -> {
                        if(GerenciarLoja.lojas.size() <= 0){
                            System.out.println("\nNão há lojas a serem verificadas.");
                            break;
                        } else {
                            System.out.println(gerenciarLoja.listarLojas());

                            System.out.print("Escolha o nome da loja ao qual você quer selecionar: ");
                            String nomeLoja = scan.nextLine();

                            System.out.println("\n1. Listar veículos disponíveis na loja");
                            System.out.println("2. Listar vendedores da loja");
                            System.out.println("3. Voltar para o menu anterior");
                            System.out.print("Opção desejada: ");
                            opcaoMenuFrenteLoja = scan.nextInt();
                            scan.nextLine();

                            if(opcaoMenuFrenteLoja == 1){
                                System.out.println("\n" + gerenciarLoja.listarVeiculos(nomeLoja));
                            } else if (opcaoMenuFrenteLoja == 2){
                                System.out.println("\n" + gerenciarLoja.listarVendedores(nomeLoja));
                            } else if (opcaoMenuFrenteLoja == 3){
                                break;
                            } else {
                                System.out.println("\nValor inválido.");
                            }
                        }  
                }
                case 3 -> {
                    if(GerenciarVendedor.vendedores.size() <= 0){
                        System.out.println("\nNão há vendedores a serem gerenciados.");
                        break;
                    } else {
                        System.out.println("\n1. Consultar vendedor pelo nome");
                        System.out.println("2. Voltar para o menu anterior");
                        System.out.print("Opção desejada: ");
                        opcaoMenuFrenteLoja = scan.nextInt();
                        scan.nextLine();

                        if(opcaoMenuFrenteLoja == 1){
                            System.out.print("\nNome do vendedor: ");
                            String nome = scan.nextLine();

                            System.out.println(gerenciarVendedor.consultarVendedor(nome));
                        } else if (opcaoMenuFrenteLoja == 2){
                            break;
                        } else {
                            System.out.println("\nValor inválido.");
                        }
                    }
    
                }
                case 4 -> {
                    if(GerenciarCliente.clientes.size() <= 0){
                        System.out.println("\nNão há clientes a serem verificados.");
                        break;
                    } else {
                        System.out.println("\n1. Cadastrar cliente");
                        System.out.println("2. Consultar cliente por CPF");
                        System.out.println("3. Voltar para o menu anterior.");
                        System.out.print("Opção desejada: ");
                        opcaoMenuFrenteLoja = scan.nextInt();
                        scan.nextLine();

                        if(opcaoMenuFrenteLoja == 1){
                            System.out.println("\n[INFORMAÇÕES PARA O CADASTRO DO CLIENTE]");

                            System.out.print("Nome: ");
                            String nome = scan.nextLine();

                            System.out.print("CPF: ");
                            String cpf = scan.nextLine();

                            System.out.print("Telefone: ");
                            String telefone = scan.nextLine();

                            System.out.println("\n" + gerenciarCliente.cadastrarClientes(nome, cpf, telefone));
                        } else if (opcaoMenuFrenteLoja == 2){
                            System.out.print("\nInsira o CPF do cliente: ");
                            String cpf = scan.nextLine();

                            System.out.println(gerenciarCliente.consultarCliente(cpf));
                        } else if (opcaoMenuFrenteLoja == 3){
                            break;
                        } else {
                            System.out.println("Valor inválido.");
                        }
                    }
                }
                case 5 -> {
                    if(gerenciarVenda.vendas.size() <= 0){
                        System.out.println("\nNão há vendas a serem gerenciadas.");
                        break;
                    } else {
                        System.out.println("\n1. Cadastrar venda");
                        System.out.println("2. Voltar para o menu anterior");
                        System.out.print("Opção desejada: ");
                        opcaoMenuFrenteLoja = scan.nextInt();
                        scan.nextLine();

                        if(opcaoMenuFrenteLoja == 1){
                            System.out.println("\n[DADOS DA VENDA]");

                            System.out.print("Insira a placa do veículo: ");
                            String placa = scan.nextLine();

                            System.out.print("Insira o nome do vendedor: ");
                            String nomeVendedor = scan.nextLine();

                            System.out.print("Insira o nome do cliente: ");
                            String nomeCliente = scan.nextLine();

                            System.out.print("Data da venda (dia/mes/ano): ");
                            String data = scan.nextLine();

                            System.out.println("\n" + gerenciarVenda.cadastrarVenda(placa, nomeVendedor, nomeCliente, data));
                        } else if (opcaoMenuFrenteLoja == 2){
                            break;
                        } else {
                            System.out.println("\nValor inválido.");
                        }
                    }
                }
                case 6 -> {
                    System.out.println();
                    return;
                }
                default -> System.out.println("\nValor inválido.");
            }
        }
        
    }

    private void menuCadastro(){
        
        int opcaoMenuCadastro = 999;
        while(opcaoMenuCadastro != 6){
            System.out.println("\nMENU ADMINISTRACÃO CADASTRO");
            System.out.println("1. Gerenciar veículo");
            System.out.println("2. Gerenciar loja");
            System.out.println("3. Gerenciar vendedor");
            System.out.println("4. Gerenciar cliente");
            System.out.println("5. Gerenciar venda");
            System.out.println("6. Voltar para o menu superior");
            System.out.print("Opção desejada: ");
            opcaoMenuCadastro = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenuCadastro) {
                case 1 -> {
                    System.out.println("\n1. Cadastrar veiculo");
                    System.out.println("2. Excluir veiculo");
                    System.out.println("3. Alterar dados do veiculo");
                    System.out.println("4. Associar veiculo à loja");
                    System.out.println("5. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuCadastro = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuCadastro == 1){
                        System.out.println("\n[INFORMAÇÕES PARA CADASTRO DO CARRO]");

                        System.out.print("Marca: ");
                        String marca = scan.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();

                        System.out.print("Ano: ");
                        int ano = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Placa: ");
                        String placa = scan.nextLine();

                        System.out.print("Preço: ");
                        double preco = scan.nextDouble();
                        scan.nextLine();

                        System.out.println("\n" + gerenciarVeiculo.cadastrarVeiculo(marca, modelo, ano, placa, preco));
                    } else if (opcaoMenuCadastro == 2){
                        System.out.print("\nInsira a placa do carro que deseja excluir do sistema: ");
                        String placa = scan.nextLine();

                        System.out.println(gerenciarVeiculo.excluirVeiculo(placa));
                    } else if (opcaoMenuCadastro == 3){
                        System.out.println("\n" + gerenciarVeiculo.listarVeiculos());

                        System.out.print("Insira a placa do veículo que deseja alterar os dados: ");
                        String placa = scan.nextLine();

                        System.out.println("\n[NOVOS DADOS]");

                        System.out.print("Marca: ");
                        String marca = scan.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();

                        System.out.print("Ano: ");
                        int ano = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Placa: ");
                        String placaNova = scan.nextLine();

                        System.out.print("Preço: ");
                        double preco = scan.nextDouble();
                        scan.nextLine();

                        System.out.println(gerenciarVeiculo.alterarDados(placa, marca, modelo, ano, placaNova, preco));
                    } else if (opcaoMenuCadastro == 4){
                        System.out.println("\n" + gerenciarVeiculo.listarVeiculos());
                        System.out.print("Insira o a placa do veículo que você quer associar a uma loja: ");
                        String placa = scan.nextLine();

                        System.out.println("\n" + gerenciarLoja.listarLojas());
                        System.out.print("Insira o nome da loja ao qual você quer associar o carro: ");
                        String nomeLoja = scan.nextLine();

                        System.out.println("\n" + gerenciarVeiculo.associarVeiculo(placa, nomeLoja));
                    } else if (opcaoMenuCadastro == 5){
                        break;
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 2 -> {
                    System.out.println("\n1. Cadastrar loja");
                    System.out.println("2. Excluir loja");
                    System.out.println("3. Alterar dados da loja");
                    System.out.println("4. Associar vendedor a loja");
                    System.out.println("5. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuCadastro = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuCadastro == 1){
                        System.out.println("\n[DADOS PARA CADASTRO DA LOJA]");

                        System.out.print("Nome: ");
                        String nome = scan.nextLine();

                        System.out.print("Endereço: ");
                        String endereco = scan.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scan.nextLine();

                        System.out.println("\n" + gerenciarLoja.cadastrarLoja(nome, endereco, telefone));

                    } else if (opcaoMenuCadastro == 2){
                        System.out.println("\n" + gerenciarLoja.listarLojas());

                        System.out.print("Insira o nome da loja que você quer excluir: ");
                        String nomeLoja = scan.nextLine();

                        System.out.println("\n" + gerenciarLoja.excluirLoja(nomeLoja));
                    } else if (opcaoMenuCadastro == 3){
                        System.out.println("\n" + gerenciarLoja.listarLojas());

                        System.out.print("Insira o nome da loja que você deseja alterar os dados: ");
                        String loja = scan.nextLine();

                        System.out.println("\n[NOVOS DADOS]");

                        System.out.print("Nome: ");
                        String nomeLoja = scan.nextLine();

                        System.out.print("Endereco: ");
                        String endereco = scan.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scan.nextLine();

                        System.out.println(gerenciarLoja.alterarDados(loja, nomeLoja, endereco, telefone));
                    } else if (opcaoMenuCadastro == 4){
                        System.out.print("\nInsira o CPF do vendedor: ");
                        String cpf = scan.nextLine();

                        System.out.println("\n" + gerenciarLoja.listarLojas());
                        System.out.print("Insira o nome da loja ao qual você quer associar o vendedor: ");
                        String nomeLoja = scan.nextLine();

                        System.out.println("\n" + gerenciarLoja.associarVendedor(cpf, nomeLoja));
                    } else if (opcaoMenuCadastro == 5) {
                        break;
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 3 -> {
                    System.out.println("\n1. Cadastrar vendedor");
                    System.out.println("2. Excluir vendedor");
                    System.out.println("3. Alterar dados do vendedor");
                    System.out.println("4. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuCadastro = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuCadastro == 1){
                        System.out.println("\n[DADOS PARA CADASTRO DO VENDEDOR]");
                        
                        System.out.print("Nome: ");
                        String nome = scan.nextLine();

                        System.out.print("CPF: ");
                        String cpf = scan.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scan.nextLine();

                        System.out.println("\n" + gerenciarVendedor.cadastrarVendedor(nome, cpf, telefone));
                    } else if (opcaoMenuCadastro == 2){
                        System.out.print("\nInsira o CPF do vendedor que você deseja excluir do sistema: ");
                        String cpf = scan.nextLine();

                        System.out.println("\n" + gerenciarVendedor.excluirVendedor(cpf));
                    } else if (opcaoMenuCadastro == 3){
                        System.out.print("\nInsira o CPF do vendedor ao qual você deseja fazer alterações cadastrais: ");
                        String cpf = scan.nextLine();

                        System.out.print("\nNome: ");
                        String nome = scan.nextLine();

                        System.out.print("CPF: ");
                        String cpfNovo = scan.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scan.nextLine();

                        System.out.println(gerenciarVendedor.alterarDados(cpf, nome, cpfNovo, telefone));
                    } else if (opcaoMenuCadastro == 4){
                        break;
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 4 -> {
                    System.out.println("\n1. Cadastrar cliente");
                    System.out.println("2. Excluir cliente");
                    System.out.println("3. Alterar dados do cliente");
                    System.out.println("4. Voltar para o menu anterior.");
                    System.out.print("Opção desejada: ");
                    opcaoMenuCadastro = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuCadastro == 1){
                        System.out.println("\n[INFORMAÇÕES PARA O CADASTRO DO CLIENTE]");

                        System.out.print("Nome: ");
                        String nome = scan.nextLine();

                        System.out.print("CPF: ");
                        String cpf = scan.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scan.nextLine();

                        System.out.println("\n" + gerenciarCliente.cadastrarClientes(nome, cpf, telefone));
                    } else if (opcaoMenuCadastro == 2){
                        System.out.print("\nInsira o CPF do cliente que você deseja excluir do sistema: ");
                        String cpf = scan.nextLine();

                        System.out.println("\n" + gerenciarCliente.excluirCliente(cpf));
                    } else if (opcaoMenuCadastro == 3){
                        System.out.print("\nInsira o CPF do cliente ao qual você deseja alterar os dados: ");
                        String cpf = scan.nextLine();

                        System.out.print("Nome: ");
                        String nome = scan.nextLine();

                        System.out.print("CPF: ");
                        String cpfNovo = scan.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scan.nextLine();
                        
                        System.out.println("\n" + gerenciarCliente.alterarDados(cpf, nome, cpfNovo, telefone));
                    } else if (opcaoMenuCadastro == 4){
                        break;
                    } else {
                        System.out.println("Valor inválido.");
                    }
                }
                case 5 -> {
                    System.out.println("\n1. Cadastrar venda");
                    System.out.println("2. Excluir venda");
                    System.out.println("3. Alterar dados da venda");
                    System.out.println("4. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuCadastro = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuCadastro == 1){
                        System.out.println("\n[DADOS DA VENDA]");

                        System.out.print("Insira a placa do veículo: ");
                        String placa = scan.nextLine();

                        System.out.print("Insira o nome do vendedor: ");
                        String nomeVendedor = scan.nextLine();

                        System.out.print("Insira o nome do cliente: ");
                        String nomeCliente = scan.nextLine();

                        System.out.print("Data da venda (dia/mes/ano): ");
                        String data = scan.nextLine();

                        System.out.println("\n" + gerenciarVenda.cadastrarVenda(placa, nomeVendedor, nomeCliente, data));
                    } else if (opcaoMenuCadastro == 2){
                        System.out.print("\nInsira a placa do veículo registrado na venda: ");
                        String placa = scan.nextLine();

                        System.out.println("\n" + gerenciarVenda.excluirVenda(placa));
                    } else if (opcaoMenuCadastro == 3){
                        System.out.print("\nInsira a placa do veículo registrado na venda: ");
                        String placa = scan.nextLine();

                        System.out.println("\n[DADOS PARA ALTERAÇÃO DE CADASTRO DA VENDA]");
                        System.out.print("Placa do novo carro a ser registrado: ");
                        String placaNova = scan.nextLine();

                        System.out.print("Nome do novo vendedor a ser registrado: ");
                        String nomeVendedor = scan.nextLine();

                        System.out.print("Nome do novo cliente a ser registrado: ");
                        String nomeCliente = scan.nextLine();

                        System.out.print("Nova data a ser registrada (dia/mes/ano): ");
                        String data = scan.nextLine();
                        
                        System.out.println("\n" + gerenciarVenda.alterarDados(placa, placaNova, nomeVendedor, nomeCliente, data));

                        System.out.println("\n" + gerenciarVenda.vendas.get(0).getClienteComprador().getNome());
                    } else if (opcaoMenuCadastro == 4){
                        break;
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 6 -> {
                    System.out.println();
                    return;
                }
                default -> System.out.println("\nValor inválido.");
            }
        }

    }
}
