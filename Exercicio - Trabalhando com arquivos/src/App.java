import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the .csv file path: ");
        String csvString = scan.nextLine();
        File csvPath = new File(csvString);

        String csvFolderString = csvPath.getParent();
        String csvFolderPath = csvFolderString+"\\out";
        boolean createFolder = new File(csvFolderPath).mkdir();

        List<Product> productList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(csvPath))){
            for(int i=0;i<4;i++){
                String line = br.readLine();
                String[] lines = new String[3];
                lines = line.split(",");
                productList.add(new Product(lines[0], Double.parseDouble(lines[1]), Integer.parseInt(lines[2])));
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(csvFolderPath+"\\sumary.csv"))){
                for(Product product : productList){
                    bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bw.newLine();
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
