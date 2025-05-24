import java.util.Scanner;

public class ldrExercicio03 {

    public static void main(String[] args){

        /*Francisca Leopoldina quer visualizar todos os números ímpares de 1 até um valor máximo definido por ela.
        Crie um programa que exiba a sequência de números ímpares até o valor escolhido.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o número máximo desse range? ");
        int max = scan.nextInt();

        System.out.println();
        System.out.println("Esses são os números ímpares do número 1 até " + max +":");
        for(int i=1;i<=max;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        scan.close();

    }

}