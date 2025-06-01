import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();
        Set<Integer> total = new HashSet<>();
        
        System.out.print("How many students for course A? ");
        int num = scan.nextInt();

        for(int i=0;i<num;i++){
            System.out.print("ID: ");
            courseA.add(scan.nextInt());    
        }

        System.out.print("How many students for course B? ");
        num = scan.nextInt();

        for(int i=0;i<num;i++){
            System.out.print("ID: ");
            courseB.add(scan.nextInt());    
        }

        System.out.print("How many students for course C? ");
        num = scan.nextInt();

        for(int i=0;i<num;i++){
            System.out.print("ID: ");
            courseC.add(scan.nextInt());    
        }

        total.addAll(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        scan.close();

    }
}
