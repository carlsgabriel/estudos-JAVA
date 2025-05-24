import java.util.Scanner;

public class ecExercicio02 {

    public static void main(String[] args){

        /*Na Feira de Descontos, o cliente ganha desconto conforme a quantidade de produtos comprados: 
        até 5 itens, sem desconto; 
        de 6 a 10 itens, desconto de 5%; 
        acima de 10 itens, 10% de desconto. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos itens você comprou? ");
        int qtd = scan.nextInt();

        System.out.print("Preço total da compra: R$");
        double preco = scan.nextDouble();

        System.out.println();

        if(qtd <= 5) {
            System.out.printf("Total: R$%.2f reais.%n", preco);
            System.out.println("Para se obter algum desconto, tem que comprar mais de 5 itens...");
        } else if (qtd <= 10) {
            int desconto = 5;
            double total = preco - preco * 0.05;
            System.out.printf("Total: R$%.2f reais.%n", total);
            System.out.println("Você recebeu um desconto de " + desconto + "% pela quantidade de itens que comprou.");
        } else {
            int desconto = 10;
            double total = preco - preco * 0.1;
            System.out.printf("Total: R$%.2f reais.%n", total);
            System.out.println("Você recebeu um desconto de " + desconto + "% pela quantidade de itens que comprou.");
        }

        scan.close();


    }

}
