import java.util.Scanner;

public class Aula14062025 {

    public static void main(String[] args){

        /*O usuário começa com um saldo inicial e pode escolher entre as opções: 
        1 -Depositar 
        2 - Sacar 
        3 - Transferir 
        4 - Sair
		  
        O programa deve validar que não é possivel transferir ou sacar mais do que o saldo disponível. 
        Após cada operação, o saldo atualizado deve ser exibido. 
        O programa só deve encerrar quando o usuário escolher a opção 4 - Sair.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Saldo inicial: R$");
        double saldo = scan.nextDouble();

        boolean continuar = true;
        do{

            System.out.println("Saldo: R$" + String.format("%.2f", saldo));
            System.out.println("\nMENU");
            System.out.println("1. DEPOSITAR");
            System.out.println("2. SACAR");
            System.out.println("3. TRANSFERIR");
            System.out.println("4. SAIR");
            System.out.print("Opção desejada: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("\nValor que deseja depositar: R$");
                    double deposito = scan.nextDouble();

                    saldo += deposito;

                    System.out.println("Deposito realizado com sucesso!\n");
                } 
                case 2 -> {
                    System.out.print("\nValor que deseja sacar: R$");
                    double saque = scan.nextDouble();

                    if(saque <= saldo){
                        saldo -= saque;

                        System.out.println("Saque realizado com sucesso!\n");
                    } else {
                        System.out.println("Saldo insuficiente.\n");
                    }
                }
                case 3 -> {
                    System.out.print("\nValor que deseja transferir: R$");
                    double transferencia = scan.nextDouble();

                    if(transferencia <= saldo){
                        saldo -= transferencia;

                        System.out.println("Transferência realizada com sucesso!\n");
                    } else {
                        System.out.println("Saldo insuficiente.\n");
                    }
                }
                case 4 -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Valor inválido.");
            }

        }while(continuar != false);

        scan.close();

    }

}
