import java.util.Scanner;

public class ldrExercicio05 {

    public static void main(String[] args){

        /*Ermengarda quer estudar a tabuada de um número específico. 
        Escreva um programa que pergunte qual número ela deseja estudar e exiba a tabuada dele do 1 até o 10.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o número da tabuada você quer estudar: ");
        int num = scan.nextInt();

        int total = 0;

        for(int i=1;i<=10;i++){
            total = num * i;
            System.out.println(num + " * " + i + " = " + total);
        }

        scan.close();

    }

}