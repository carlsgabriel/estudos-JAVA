import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args){

        /*Escreva um programa que leia o preço de um produto e a forma de pagamento escolhida pelo cliente: 
        → 1 - em espécie
        → 2 - cartão de crédito
        → 3 - cartão de débito 
        Mostre o valor final da compra. 
        Considere que o produto tem 10% de desconto se for pago em espécie ou no cartão de débito e não tem desconto se for pago no cartão de crédito. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scan.nextDouble();
        System.out.println("Qual a forma de pagamento desejada?");
        System.out.print("1 - Em espécie | 2 - Cartão de crédito | 3 - Cartão de débito\nOpção: ");
        scan.nextLine();
        int formaPag = scan.nextInt();

        double desconto = preco * 0.1;
        double precoAtualizado = preco - desconto;

        if(formaPag == 1){
            System.out.printf("O valor total da compra é R$%.2f%n", precoAtualizado);
        } else if (formaPag == 3) {
            System.out.printf("O valor total da compra é R$%.2f%n", precoAtualizado);
        } else {
            System.out.printf("O valor total da compra é R$%.2f%n", preco);
        }

        scan.close();

    }

}
