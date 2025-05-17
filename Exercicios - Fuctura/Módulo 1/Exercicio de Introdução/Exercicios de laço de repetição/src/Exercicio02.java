import java.util.Scanner;
import java.util.Random;

public class Exercicio02 {

public static void main(String[] args) {

    /*Implemente um jogo em que o computador escolhe um número aleatório entre 1 e 100, e o jogador tenta adivinhar. O jogo continua até que o jogador acerte o número.*/

    Scanner scan = new Scanner(System.in);
    Random gerador = new Random();

    int numCerto = gerador.nextInt(101);

    System.out.print("Insira o número de 1-100: ");
    int num = scan.nextInt();
    int qtd = 0;

    while(num != numCerto) {

        qtd++;

        System.out.println("Infelizmente você errou o número...");
        if(qtd > 10){
            if(num < numCerto){
                System.out.println("Vou dar uma dica: O número que você inseriu é menor do que o número certo.");
            } else {
                System.out.println("Vou dar uma dica: O número que você inseriu é maior do que o número certo.");
            }
        }
        System.out.print("Insira novamente o número: ");
        num = scan.nextInt();

    }

    System.out.println("Parabéns, você acertou!\nO número é: " + numCerto);

    scan.close();

    }

}