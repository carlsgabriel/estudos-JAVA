import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char choice = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = scan.nextDouble();
            if(choice == 'i' || choice == 'I'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();
                TaxPayer individual = new Individual(name, annualIncome, healthExpenditures);
                list.add(individual);
            } else {
                System.out.print("Number of employees: ");
                int numberEmployee = scan.nextInt();
                TaxPayer company = new Company(name, annualIncome, numberEmployee);
                list.add(company);
            }
        }

        System.out.println();
        double sum = 0.0;
        System.out.println("TAXES PAID: ");
        for(TaxPayer taxPayer : list){
            System.out.println(taxPayer);
            sum += taxPayer.taxCalculation();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        scan.close();

    }
}