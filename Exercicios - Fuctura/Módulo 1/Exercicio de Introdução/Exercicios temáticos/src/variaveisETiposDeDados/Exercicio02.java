import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){

        /*No Mercado Mix Tadeu, a seção de frutas precisa registrar o tipo de cada fruta,
        a quantidade em estoque, o preço por quilo e uma informação booleana que indique se a fruta está na promoção ou não. 
        Escreva um programa que registre esses dados para quatro frutas diferentes e exiba uma tabela com as informações para o gerente. */

        Scanner scan = new Scanner(System.in);

        String[] tipos = new String[4];
        int[] qtds = new int[4];
        double[] precos = new double[4];
        boolean[] promos = new boolean[4];

        System.out.println("Informações das frutas:");

        for(int i=0;i<4;i++){

            System.out.print("Tipo: ");
            tipos[i] = scan.nextLine();

            System.out.print("Quantidade em estoque: ");
            qtds[i] = scan.nextInt();

            System.out.print("Preço: ");
            precos[i] = scan.nextDouble();

            System.out.print("Tem promoção? [S/N] ");
            char promo = scan.next().charAt(0);
            scan.nextLine();
            System.out.println();
            if(promo == 's' || promo == 'S'){
                promos[i] = true;
            } else {
                promos[i] = false;
            }

        }

        for(int i=0;i<4;i++){
            System.out.println("Nome: " + tipos[i] + " | Quantidade: " + qtds[i] + " | Preço: " + precos[i] + " | Promoção: " + promos[i]);
            System.out.println();
        }
        
        



        scan.close();

    }

}
