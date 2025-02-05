import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            if(ch == 'i' || ch == 'I'){
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            } else if (ch == 'u' || ch == 'U'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = scan.next();
                Product product = new UsedProduct(name, price, sdf.parse(manufactureDate));
                products.add(product);
            } else {
                Product product = new Product(name, price);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

    }
}
