import java.util.Scanner;

public class ecExercicio05 {

    public static void main(String[] args){

        /*Uma academia oferece um desconto de 20% para pessoas que treinam mais de 5 vezes por semana. 
        Escreva um programa que pergunte quantos dias o usuário treina por semana e mostre o valor com desconto, caso aplicável.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o valor da mensalidade da academia? ");
        double valor = scan.nextDouble();

        System.out.print("Quantas vezes por semana você vai para a academia? ");
        int qtd = scan.nextInt();
        System.out.println();

        double total;

        if(qtd <= 5){
            total = valor;
            System.out.printf("Como você treina 5 vezes por semana ou menos, o valor da matricula ficou: R$%.2f%n", total);
        } else {
            total = valor - (valor * 0.20);
            System.out.println("Como você treina mais de 5 vezes por semana, foi adicionado um desconto de 20% e o valor da matricula ficou: R$" + String.format("%.2f", total));
        }

    scan.close();

    }

}