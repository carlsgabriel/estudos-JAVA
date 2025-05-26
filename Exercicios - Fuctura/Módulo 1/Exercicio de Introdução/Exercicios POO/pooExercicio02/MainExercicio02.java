import java.util.Scanner;

public class MainExercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o nome do titular da conta: ");
        String titular = scan.nextLine();

        System.out.print("Saldo: ");
        double saldo = scan.nextDouble();

        System.out.print("Insira a taxa de juros dessa conta poupança: ");
        int juros = scan.nextInt();

        ContaPoupanca cp = new ContaPoupanca(titular, saldo, juros);

        System.out.println();

        System.out.println("[Dados da conta]");
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Saldo: " + cp.getSaldo());
        System.out.println("Taxa de juros: " + cp.getJuros() + "%");

        System.out.println();
        
        System.out.println("Saldo (" + String.format("%.2f", cp.getSaldo()) + ") calculado a uma taxa de juros de "
                + cp.getJuros() + "%, resulta em " + String.format("%.2f", cp.calcularJuros()) + " de juros.");
                
        scan.close();

    }

}