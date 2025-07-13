package POO2Exercicio09;

import java.util.Scanner;

public class AppPOO2Exercicio09 {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        System.out.println("----- DADOS DA CONTA -----");

        System.out.print("Número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.print("Nome do titular: ");
        String titular = scan.nextLine();

        System.out.print("Saldo: R$");
        double saldo = scan.nextDouble();

        Conta conta = new Conta(numeroConta, titular, saldo);
        caixaEletronico.setConta(conta);

        System.out.println();

        boolean continuar = true;
        while(continuar != false){

            System.out.println("Número da conta: " + conta.getNumConta());
            System.out.println("Titular da conta: " + conta.getTitular());

            System.out.println();

            System.out.println("----- MENU -----");
            System.out.println("1. SACAR DINHEIRO");
            System.out.println("2. DEPOSITAR DINHEIRO");
            System.out.println("3. VERIFICAR SALDO DISPONÍVEL");
            System.out.println("4. PAGAR CONTAS");
            System.out.println("5. SAIR DO MENU");
            System.out.print("Opção desejada: ");
            int opcaoDesejada = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch (opcaoDesejada) {
                case 1 -> {
                    System.out.print("Valor do saque: R$");
                    double valorSaque = scan.nextDouble();

                    System.out.println(caixaEletronico.sacarDinheiro(valorSaque));
                }
                case 2 -> {
                    System.out.print("Valor do deposito: R$");
                    double valorDeposito = scan.nextDouble();

                    System.out.println(caixaEletronico.depositarDinheiro(valorDeposito));
                }
                case 3 -> {
                    System.out.println("Saldo disponível: R$" + String.format("%.2f", caixaEletronico.verificarSaldo()));
                }
                case 4 -> {
                    System.out.println("Você tem contas pra pagar?");
                    System.out.println("1. SIM");
                    System.out.println("2. NAO");
                    System.out.print("Opção desejada: ");
                    int opcaoDesejada2 = scan.nextInt();

                    System.out.println();

                    if(opcaoDesejada2 == 1){
                        System.out.print("Valor total da conta: R$");
                        double totalConta = scan.nextDouble();

                        System.out.println(caixaEletronico.pagarConta(totalConta));
                    } else {
                        System.out.println("Certo, voltando ao menu...");
                    }
                }
                case 5 -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Dados inválidos.");
            }

            System.out.println();

            System.out.println("Você deseja continuar no programa?");
            System.out.println("1. SIM");
            System.out.println("2. NAO");
            System.out.print("Escolha desejada: ");
            int opcaoDesejada3 = scan.nextInt();

            System.out.println();

            if(opcaoDesejada3 == 1){
                continuar = true;
            } else {
                System.out.println("Saindo do programa...");
                continuar = false;
            }
        }

        scan.close();}

}