package exercicioPOO04;

import java.util.Scanner;

public class AppPOO04 {

    public static void main(String[] args){

        /*Crie uma classe ContaBancaria com os atributos numero, saldo e titular. 
        Encapsule os atributos para garantir que apenas métodos da classe possam modificá-los.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numero = scan.nextInt();
        System.out.print("Saldo: R$");
        double saldo = scan.nextDouble();
        scan.nextLine();
        System.out.print("Nome do titular: ");
        String titular = scan.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumero(numero);
        contaBancaria.setSaldo(saldo);
        contaBancaria.setTitular(titular);

        System.out.println();

        System.out.println("Número da conta: " + contaBancaria.getNumero());
        System.out.println("Saldo: R$" + String.format("%.2f", contaBancaria.getSaldo()));
        System.out.println("Titular: " + contaBancaria.getTitular());

        scan.close();
        
    }

}
