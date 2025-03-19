import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int contractNumber = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date contractDate = sdf.parse(scan.next());
        System.out.print("Valor do contrato: ");
        double contractValue = scan.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Entre com o numero de parcelas: ");
        int installmentNumber = scan.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installmentNumber);

        System.out.println("Parcelas: ");
        System.out.println(contract);

        scan.close();
    }
}
