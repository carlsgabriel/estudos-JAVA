package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int n = scan.nextInt();

        System.out.println("");
        List<Employee> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            int id = scan.nextInt();
            while(hasId(list, id)){
                System.out.print("Id already taken. Try again: ");
                id = scan.nextInt();
            }
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Salary: ");
            double salary = scan.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = scan.nextInt();
        /*Integer position = position(list, id);
        if(position == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double value = scan.nextDouble();
            list.get(position).aumento(value);
        }
        */
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(employee == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double value = scan.nextDouble();
            employee.aumento(value);
        }

        System.out.println("");

        System.out.println("List of employees: ");
        for(Employee x : list){
            System.out.println(x);
        }

        scan.close();
    }

    /* public static Integer position(List<Employee> list, int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    } 
        Outra forma de fazer a verificação do id na hora de aumentar o salário.
    */
    

    public static boolean hasId(List<Employee> list, int id){
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
