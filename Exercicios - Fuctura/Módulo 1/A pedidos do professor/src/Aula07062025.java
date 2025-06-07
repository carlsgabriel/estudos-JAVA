import java.util.Scanner;
import java.util.Random;

public class Aula07062025 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //Menor número dentre os 3 recebidos
        System.out.print("Insira o primeiro número: ");
        int numInt1 = scan.nextInt();
        System.out.print("Insira o primeiro número: ");
        int numInt2 = scan.nextInt();
        System.out.print("Insira o primeiro número: ");
        int numInt3 = scan.nextInt();

        System.out.println();

        System.out.println("1º número: " + numInt1);
        System.out.println("2º número: " + numInt2);
        System.out.println("3º número: " + numInt3);

        System.out.println();

        if(numInt1 > numInt2 && numInt1 > numInt3){
            System.out.println(numInt1 + " é maior.");
        } else if (numInt2 > numInt3) {
            System.out.println(numInt2 + " é maior.");
        } else {
            System.out.println(numInt3 + " é maior.");
        }

        System.out.println("\n--------------------------\n");

        //Maior e menor número, além da diferença entre maior e menor, dos 4 números recebidos
        System.out.print("Insira o primeiro número: ");
        numInt1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        numInt2 = scan.nextInt();
        System.out.print("Insira o terceiro número: ");
        numInt3 = scan.nextInt();
        System.out.print("Insira o quarto número: ");
        int numInt4 = scan.nextInt();

        System.out.println();

        int maior = 0;
        if(numInt1 > numInt2 & numInt1 > numInt3 && numInt1 > numInt4){
            maior = numInt1;
        } else if (numInt2 > numInt3 && numInt2 > numInt4){
            maior = numInt2;
        } else if (numInt3 > numInt4){
            maior = numInt3;
        } else {
            maior = numInt4;
        }

        int menor = 0;
        if(numInt1 < numInt2 & numInt1 < numInt3 && numInt1 < numInt4){
            menor = numInt1;
        } else if (numInt2 < numInt3 && numInt2 < numInt4){
            menor = numInt2;
        } else if (numInt3 < numInt4){
            menor = numInt3;
        } else {
            menor = numInt4;
        }

        System.out.println("1º número: " + numInt1);
        System.out.println("2º número: " + numInt2);
        System.out.println("3º número: " + numInt3);
        System.out.println("4º número: " + numInt4);

        System.out.println();

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println("\n--------------------------\n");

        /*Jokenpo contra o computador*/
        scan.nextLine();

        System.out.print("Player 1, insira seu nome: ");
        String nome = scan.nextLine();

        System.out.println();

        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");

        System.out.println();

        System.out.print(nome + ", faça sua jogada: ");
        numInt1 = scan.nextInt();
        numInt2 = random.nextInt(1,4);
        System.out.println("Jogada do computador: " + numInt2);

        boolean continuar = true;
        while(continuar != false){
            if(numInt1 == 1 && numInt2 == 2){
              System.out.println("\nPedra é embrulhada por papel... O computador venceu." );
              continuar = false;
            } else if (numInt1 == 2 && numInt2 == 1) {
              System.out.println("\nPedra é embrulhada por papel... " + nome + " venceu." );
              continuar = false;
            } else if(numInt1 == 1 && numInt2 == 3){
               System.out.println("\nPedra amassa tesoura... " + nome + " venceu." );
               continuar = false;
            } else if (numInt1 == 3 && numInt2 == 1) {
               System.out.println("\nPedra amassa tesoura... O computador venceu." );
               continuar = false;
            } else if(numInt1 == 2 && numInt2 == 3){
               System.out.println("\nPapel é cortado pela tesoura... O computador venceu.");
               continuar = false;
            } else if (numInt1 == 3 && numInt2 == 2) {
               System.out.println("\nPapel é cortado pela tesoura... " + nome + " venceu.");
               continuar = false;
            } else {
              System.out.println("\nMãos iguais, empate.");

              System.out.println();

              System.out.println("1. Pedra");
              System.out.println("2. Papel");
              System.out.println("3. Tesoura");

              System.out.println();

              System.out.print(nome + ", faça novamente sua jogada: ");
              numInt1 = scan.nextInt();
              numInt2 = random.nextInt(1,4);
              System.out.println("Jogada do computador: " + numInt2);

              continuar = true;

            }  
        }

	scan.close();

    }

}