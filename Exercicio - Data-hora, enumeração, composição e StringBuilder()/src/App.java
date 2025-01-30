import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = scan.nextLine();
        System.out.print("Email: ");
        String clientEmail = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBday = sdf.parse(scan.next());
        Client client = new Client(clientName, clientEmail, clientBday);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String orderStatus = scan.next();
        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
        System.out.print("How many items to this order? ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = scan.next();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = scan.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, product.getPrice(), product);
            order.addItem(orderItem);
        }

        System.out.println(order);

        scan.close();
        
    }
}
