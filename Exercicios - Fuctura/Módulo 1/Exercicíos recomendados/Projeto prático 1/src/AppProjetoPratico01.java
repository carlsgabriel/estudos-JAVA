import java.util.Scanner;
import java.util.Random;

public class AppProjetoPratico01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        ContaCorrente contaCorrente = null;
        ContaPoupanca contaPoupanca = null;

        System.out.print("Nome do titular: ");
        String nome = scan.nextLine();

        System.out.println();

        System.out.println("Tipos de conta: ");
        System.out.println("1. Conta corrente");
        System.out.println("2. Conta poupanca");
        System.out.print("Opção desejada: ");
        int tipo = scan.nextInt();

        System.out.println();

        System.out.println("Saldo: R$0,00");
        System.out.println("1. Continuar com esse valor");
        System.out.println("2. Definir valor inicial de depósito");
        System.out.print("Opção desejada: ");
        int temSaldo = scan.nextInt();

        System.out.println();

        if (temSaldo == 1) {
            if (tipo == 1) {
                contaCorrente = new ContaCorrente((random.nextInt(100) + 1), nome, 0.00);
            } else {
                contaPoupanca = new ContaPoupanca((random.nextInt(100) + 1), nome, 0.00);
            }
        } else {
            if (tipo == 1) {
                System.out.print("Insira o valor de depósito: R$");
                double valorDeposito = scan.nextDouble();

                contaCorrente = new ContaCorrente((random.nextInt(100) + 1), nome, valorDeposito);
            } else {
                System.out.print("Insira o valor de depósito: R$");
                double valorDeposito = scan.nextDouble();

                contaPoupanca = new ContaPoupanca((random.nextInt(100) + 1), nome, valorDeposito);
            }
        }

        System.out.println();

        boolean continuar = true;
        do {
            System.out.println("MENU");
            System.out.println("1. SACAR");
            System.out.println("2. DEPOSITAR");
            System.out.println("3. APLICAR DINHEIRO NA CONTA POUPANCA");
            System.out.println("4. RESGATAR DINHEIRO DA CONTA POUPANCA");
            System.out.println("5. VISUALIZAR DETALHES DA CONTA");
            System.out.println("6. SAIR DO MENU");
            System.out.print("Opção desejada: ");
            int opcaoMenu = scan.nextInt();

            System.out.println();

            scan.nextLine();
            if (opcaoMenu == 1) {
                if (contaCorrente != null) {
                    System.out.print("Insira o valor do saque: R$");
                    double valorSaque = scan.nextDouble();
                    scan.nextLine();

                    System.out.println();

                    System.out.println(contaCorrente.sacar(valorSaque));
                } else {
                    System.out.println("Somente contas correntes podem executar o saque.");
                }
            } else if (opcaoMenu == 2) {
                if (contaCorrente != null) {
                    System.out.print("Insira o valor do depósito: R$");
                    double valorDeposito = scan.nextDouble();
                    scan.nextLine();

                    System.out.println();

                    System.out.println(contaCorrente.depositar(valorDeposito));
                } else {
                    System.out.println("Somente contas correntes podem executar o depósito.");
                }
            } else if (opcaoMenu == 3) {
                if (contaCorrente != null) {
                    if (contaPoupanca == null) {
                        System.out.println("Cadastro da nova conta poupança abaixo:");
                        System.out.print("Titular: ");
                        String nomeTitular = scan.nextLine();

                        System.out.println();

                        System.out.println("Saldo inicial: R$0,00");
                        System.out.println("1. Continuar com esse saldo");
                        System.out.println("2. Definir valor inicial do depósito");
                        System.out.print("Opção desejada: ");
                        temSaldo = scan.nextInt();
                        scan.nextLine();

                        if (temSaldo == 1) {
                            contaPoupanca = new ContaPoupanca((random.nextInt(100) + 1), nomeTitular, 0.0);
                        } else {
                            System.out.print("\nValor do depósito: R$");
                            double valorDeposito = scan.nextDouble();
                            scan.nextLine();

                            contaPoupanca = new ContaPoupanca((random.nextInt(100) + 1), nomeTitular, valorDeposito);
                        }
                    }
                    System.out.print("\nInsira o valor da aplicação: R$");
                    double valorAplicacao = scan.nextDouble();
                    scan.nextLine();

                    System.out.println();

                    System.out.println(contaCorrente.aplicar(valorAplicacao, contaPoupanca));
                } else {
                    System.out.println("Conta corrente inexistente.");
                }
            } else if (opcaoMenu == 4) {
                if (contaCorrente != null) {
                    if (contaPoupanca == null) {
                        System.out.print("Titular: ");
                        String nomeTitular = scan.nextLine();

                        System.out.println("Saldo inicial: R$0,00");
                        System.out.println("1. Continuar com esse saldo");
                        System.out.println("2. Definir valor inicial do depósito");
                        System.out.print("Opção desejada: ");
                        temSaldo = scan.nextInt();
                        scan.nextLine();

                        if (temSaldo == 1) {
                            contaPoupanca = new ContaPoupanca((random.nextInt(100) + 1), nomeTitular, 0.0);
                        } else {
                            System.out.print("\nValor do depósito: R$");
                            double valorDeposito = scan.nextDouble();
                            scan.nextLine();

                            contaPoupanca = new ContaPoupanca((random.nextInt(100) + 1), nomeTitular, valorDeposito);

                            System.out.println();
                        }
                    }
                    System.out.print("Insira o valor do resgate: R$");
                    double valorResgate = scan.nextDouble();
                    scan.nextLine();

                    System.out.println(contaCorrente.resgatar(valorResgate, contaPoupanca));
                } else {
                    System.out.println("Conta corrente inexistente.");
                }
            } else if (opcaoMenu == 5) {
                if (contaCorrente != null) {
                    if (contaPoupanca != null) {
                        System.out.println("Conta corrente: ");
                        System.out.println(contaCorrente.exibirDados());
                        System.out.println("--------------");
                        System.out.println("Conta poupanca: ");
                        System.out.println(contaPoupanca.exibirDados());
                    } else {
                        System.out.println("Conta corrente: ");
                        System.out.println(contaCorrente.exibirDados());
                        System.out.println("--------------");
                        System.out.println("Conta poupanca: ");
                        System.out.println("Inexistente!");
                    }
                } else {
                    if (contaPoupanca != null) {
                        System.out.println("Conta corrente: ");
                        System.out.println("Inexistente.");
                        System.out.println("--------------");
                        System.out.println("Conta poupanca: ");
                        System.out.println(contaPoupanca.exibirDados());
                    } else {
                        System.out.println("Conta corrente: ");
                        System.out.println("Inexistente.");
                        System.out.println("--------------");
                        System.out.println("Conta poupanca: ");
                        System.out.println("Inexistente.");
                    }
                }
            } else if (opcaoMenu == 6) {
                System.out.println("Saindo do menu...");
                return;
            } else {
                System.out.println("Valor inválido.");
            }

            System.out.println();

            System.out.println("Deseja continuar?");
            System.out.print("Sim ou nao: ");
            String continuarOuNao = scan.nextLine();

            if (continuarOuNao.equalsIgnoreCase("sim")) {
                continuar = true;
            } else {
                continuar = false;
            }

            System.out.println();

        } while (continuar == true);

        scan.close();

    }

}
