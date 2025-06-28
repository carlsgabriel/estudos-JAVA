import java.util.Scanner;

public class AppPOO2Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = scan.nextLine();

        System.out.print("Modelo: ");
        String modelo = scan.nextLine();

        System.out.print("Ano: ");
        int ano = scan.nextInt();
        scan.nextLine();

        System.out.print("Cor: ");
        String cor = scan.nextLine();

        System.out.print("Quilometragem: ");
        double quilometragem = scan.nextDouble();
        scan.nextLine();

        System.out.print("Tipo de combustível: ");
        String tipoCombustivel = scan.nextLine();

        Carro carro = new Carro();
        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setAno(ano);
        carro.setCor(cor);
        carro.setQuilometragem(quilometragem);
        carro.setCombustivel(tipoCombustivel);
        carro.setOnOff(false);

        boolean continuar = true;
        do{
            System.out.println("\nMENU");
            System.out.println("1. LIGAR O CARRO");
            System.out.println("2. DESLIGAR O CARRO");
            System.out.println("3. ACELERAR O CARRO");
            System.out.println("4. FREAR O CARRO");
            System.out.println("5. ABASTECER O CARRO");
            System.out.println("6. SAIR DO MENU");
            System.out.print("Escolha uma opção: ");
            int op = scan.nextInt();

            scan.nextLine();
            System.out.println();

            switch (op) {
                case 1 -> System.out.println(carro.ligar());
                case 2 -> System.out.println(carro.desligar());
                case 3 -> System.out.println(carro.acelerar());
                case 4 -> System.out.println(carro.frear());
                case 5 -> {
                    System.out.print("Quantidade de combustível a ser abastecido: ");
                    double qtd = scan.nextDouble();

                    System.out.println(carro.abastecer(qtd));
                }
                case 6 -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }

            System.out.print("\nDeseja continuar no menu (sim/nao): ");
            String desejaContinua = scan.nextLine();

            if(desejaContinua.equalsIgnoreCase("sim")){
                continuar = true;
            } else {
                continuar = false;
            }

        } while (continuar != false);

        scan.close();

    }

}
