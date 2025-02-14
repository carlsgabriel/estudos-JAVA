import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        try{
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Holder: ");
        String holder = scan.nextLine();
        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimt = scan.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimt);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        balance = scan.nextDouble();
        account.withdraw(balance);
        System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unespected error");
        }

        scan.close();
    }
}
