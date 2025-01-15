import java.util.Locale;
import java.util.Scanner;
import entities.Guest;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Guest[] vect = new Guest[10];

        System.out.print("How many rooms will be rented? ");
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Room: ");
            int room = scan.nextInt();

            vect[room-1] = new Guest(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for(int i=0;i<vect.length;i++){
            if(vect[i] != null){
                System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }

        scan.close();
    }
}
