package POO2Exercicio07;

import java.util.Scanner;

public class AppPOO2Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----- DADOS DO VEICULO -----");

        System.out.print("Modelo: ");
        String nomeModelo = scan.nextLine();

        System.out.print("Velocidade atual: ");
        int velocidadeAtual = scan.nextInt();
        scan.nextLine();

        System.out.print("Destino: ");
        String nomeDestino = scan.nextLine();

        VeiculoAutonomo veiculoAutonomo = new VeiculoAutonomo();
        veiculoAutonomo.setModelo(nomeModelo);
        veiculoAutonomo.setVelocidadeAtual(velocidadeAtual);
        veiculoAutonomo.setDestino(nomeDestino);

        System.out.println();

        boolean continuar = true;
        while (continuar != false) {

            System.out.println("----- MENU -----");
            System.out.println("1. REDEFINIR DESTINO");
            System.out.println("2. INICIAR VIAGEM");
            System.out.println("3. PARAR VEICULO");
            System.out.println("4. SAIR DO MENU");
            System.out.print("Opção escolhida: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch (opcao) {
                case 1 -> {
                    if (veiculoAutonomo.getVelocidadeAtual() == 0) {
                        if (!(veiculoAutonomo.getDestino().isEmpty())) {
                            System.out
                                    .println("Você já tem um destino definido... seu destino atual é: "
                                            + veiculoAutonomo.getDestino());
                            System.out.print("Desja alterar? Sim ou nao: ");
                            String alterarDestino = scan.nextLine();

                            if (alterarDestino.equalsIgnoreCase("sim")) {
                                System.out.print("Insira o novo destino: ");
                                String novoDestino = scan.nextLine();

                                System.out.println(veiculoAutonomo.definirDestino(novoDestino));
                            } else {
                                System.out.println("O destino continuará " + veiculoAutonomo.getDestino());
                            }
                        } else {
                            System.out.print("Insira o destino desejado: ");
                            String destino = scan.nextLine();

                            veiculoAutonomo.definirDestino(destino);
                        }
                    } else {
                        System.out.println("O veiculo precisa estar parado para que você defina um destino.");
                        System.out.print("Deseja parar o veiculo? sim ou nao: ");
                        String opcaoParar = scan.nextLine();

                        System.out.println();

                        if (opcaoParar.equalsIgnoreCase("sim")) {
                            System.out.println(veiculoAutonomo.pararVeiculo());
                        } else {
                            System.out.println("O veiculo continua a " + veiculoAutonomo.getVelocidadeAtual()
                                    + " e não poderá setar um destino.");
                        }
                    }

                }
                case 2 -> {
                    System.out
                            .print("Deseja iniciar viagem para o destino já definido ou um novo? Existente ou novo: ");
                    String existenteOuNovo = scan.nextLine();

                    System.out.println();
                    if (existenteOuNovo.equalsIgnoreCase("existente")) {
                        System.out
                                .println("Ótimo, ajustando GPS para o destino: " + veiculoAutonomo.getDestino() + ".");
                        System.out.print("Você quer continuar ou parar o carro? Continuar ou parar: ");
                        String continuarOuParar = scan.nextLine();

                        System.out.println();

                        if (continuarOuParar.equalsIgnoreCase("continuar")) {
                            System.out.println("Indo para " + veiculoAutonomo.getDestino() + ".");
                        } else {
                            veiculoAutonomo.pararVeiculo();
                        }
                    } else {
                        if (veiculoAutonomo.getVelocidadeAtual() == 0) {
                            System.out.println(veiculoAutonomo.iniciaViagem());
                        } else {
                            System.out.println("O carro precisa estar parado para iniciar viagem.");
                            System.out.print("Deseja parar o carro? Sim ou nao: ");
                            String opcaoDesejada = scan.nextLine();

                            System.out.println();

                            if (opcaoDesejada.equalsIgnoreCase("sim")) {
                                System.out.println(veiculoAutonomo.pararVeiculo());
                            } else {
                                System.out.println("O veiculo continua a " + veiculoAutonomo.getVelocidadeAtual()
                                        + " e não poderá começar a viagem.");
                            }
                        }
                    }
                }
                case 3 -> {
                    if (veiculoAutonomo.getVelocidadeAtual() > 0) {
                        System.out.println(veiculoAutonomo.pararVeiculo());
                    } else {
                        System.out.println("O veículo já está parado.");
                    }
                }
                case 4 -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Valor inválido.");

            }

            System.out.println();

            System.out.print("Deseja continuar no programa? Sim ou nao: ");
            String continuarString = scan.nextLine();

            System.out.println();

            if (continuarString.equalsIgnoreCase("nao")) {
                continuar = false;
            }

        }

        scan.close();

    }

}

