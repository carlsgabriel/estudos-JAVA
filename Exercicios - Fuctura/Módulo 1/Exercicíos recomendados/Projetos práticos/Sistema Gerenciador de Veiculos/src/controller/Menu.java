package controller;

import java.util.Scanner;

public class Menu {

    Scanner scan = null;
    GerenciarVeiculo gerenciarVeiculo = null;
    GerenciarLoja gerenciarLoja = null;
    GerenciarCliente gerenciarCliente = null;
    GerenciarVendedor gerenciarVendedor = null;

    public Menu(){
        scan = new Scanner(System.in);
        gerenciarVeiculo = new GerenciarVeiculo();
        gerenciarLoja = new GerenciarLoja();
        gerenciarVendedor = new GerenciarVendedor();
        gerenciarCliente = new GerenciarCliente();
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
                        menuFrenteLoja();
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 2 -> {
                    if(gerenciarLoja.lojas.size() <= 0){
                        System.out.println("\nNão há lojas a serem listadas...\n");
                    } else {
                        System.out.println("\n" + gerenciarLoja.listarLojas() + "\n");

                        System.out.print("Escolha o nome da loja ao qual você quer selecionar: ");
                        String nomeLoja = scan.nextLine();

                        System.out.println("\n1. Listar veículos disponíveis na loja");
                        System.out.println("2. Listar vendedores da loja");
                        System.out.println("3. Voltar para o menu anterior");
                        System.out.print("Opção desejada: ");
                        opcaoMenuFrenteLoja = scan.nextInt();
                        scan.nextLine();

                        if(opcaoMenuFrenteLoja == 1){
                            System.out.println(gerenciarLoja.listarVeiculos(nomeLoja));
                        } else if (opcaoMenuFrenteLoja == 2){
                            System.out.println(gerenciarLoja.listarVendedores(nomeLoja));
                        } else if (opcaoMenuFrenteLoja == 3){
                            menuFrenteLoja();
                        } else {
                            System.out.println("\nValor inválido.");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("\n1. Consultar vendedor pelo nome");
                    System.out.println("2. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuFrenteLoja = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuFrenteLoja == 1){
                        System.out.print("\nNome do vendedor: ");
                        String nome = scan.nextLine();

                        gerenciarVendedor.consultarVendedor("\n" + nome);
                    } else if (opcaoMenuFrenteLoja == 2){
                        menuFrenteLoja();
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 4 -> {
                    System.out.println("\n1. Cadastrar cliente");
                    System.out.println("2. Consultar cliente por CPF");
                    System.out.println("3. Voltar para o menu anterior.");
                    System.out.print("Opção desejada: ");
                    opcaoMenuFrenteLoja = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuFrenteLoja == 1){
                        System.out.println("\nInformaçoes para cadastro de cliente abaixo");

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
                        menuFrenteLoja();
                    } else {
                        System.out.println("Valor inválido.");
                    }
                }
                case 5 -> {
                    System.out.println("\n1. Gerenciar venda");
                    System.out.println("2. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuFrenteLoja = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuFrenteLoja == 1){

                    } else if (opcaoMenuFrenteLoja == 2){
                        menuFrenteLoja();
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

                    } else if (opcaoMenuCadastro == 2){
                        
                    } else if (opcaoMenuCadastro == 3){

                    } else if (opcaoMenuCadastro == 4){
                    
                    } else if (opcaoMenuCadastro == 5){
                        menuCadastro();
                    } else {
                        System.out.println("\nValor inválido.");
                    }
                }
                case 2 -> {
                    System.out.println("\n1. Alterar dados da loja");
                    System.out.println("2. Associar vendedor a loja");
                    System.out.println("3. Voltar para o menu anterior");
                    System.out.print("Opção desejada: ");
                    opcaoMenuCadastro = scan.nextInt();
                    scan.nextLine();

                    if(opcaoMenuCadastro == 1){

                    } else if (opcaoMenuCadastro == 2){

                    } else if (opcaoMenuCadastro == 3){
                        menuCadastro();
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

                    } else if (opcaoMenuCadastro == 2){
                        
                    } else if (opcaoMenuCadastro == 3){
                    
                    } else if (opcaoMenuCadastro == 4){
                        menuCadastro();
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

                    } else if (opcaoMenuCadastro == 2){

                    } else if (opcaoMenuCadastro == 3){
                        
                    } else if (opcaoMenuCadastro == 4){
                        menuCadastro();
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

                    } else if (opcaoMenuCadastro == 2){
                        
                    } else if (opcaoMenuCadastro == 3){

                    } else if (opcaoMenuCadastro == 4){
                        menuCadastro();
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