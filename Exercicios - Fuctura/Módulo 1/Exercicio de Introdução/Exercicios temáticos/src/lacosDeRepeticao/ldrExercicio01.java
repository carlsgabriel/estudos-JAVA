import java.util.Scanner;

public class ldrExercicio01 {

    public static void main(String[] args){

        /*Genésia quer fazer uma contagem regressiva de dias até seu aniversário. 
        Escreva um programa que receba o número de dias até o aniversário dela e conte até zero, exibindo uma mensagem para cada dia que passa.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos dias faltam até seu aniversário? ");
        int qtdDias = scan.nextInt();

        for(int i=qtdDias;i>=0;i--){
            System.out.println("Faltam " + i + " dias para seu aniversário.");
        }

        scan.close();

    }

}