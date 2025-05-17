import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        /*Peça ao usuário para inserir um número e imprima a tabuada desse número de 1 a 10.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o número desejado: ");
        int num = scan.nextInt();

        int valor = 0;

        for(int i=1;i<=10;i++) {
            valor = num * i;
            System.out.println(num + " * " + i + " = " + valor);
        }

    scan.close();

    }

}