package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = scan.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        char haveInitialDeposit = scan.next().charAt(0);

        Bank bank;

        if(haveInitialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            bank = new Bank(accountNumber, accountHolder, initialDeposit);
        } else {
            bank = new Bank(accountNumber, accountHolder);
        }

        System.out.println("");
        System.out.println("Account data:");
        System.out.println(bank.toString());

        System.out.println("");
        System.out.print("Enter a deposit value: ");
        double value = scan.nextDouble();
        bank.deposito(value);
        System.out.println("Account data:");
        System.out.println(bank.toString());

        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        value = scan.nextDouble();
        bank.saque(value);
        System.out.println("Account data:");
        System.out.println(bank.toString());

        scan.close();
    }
}
