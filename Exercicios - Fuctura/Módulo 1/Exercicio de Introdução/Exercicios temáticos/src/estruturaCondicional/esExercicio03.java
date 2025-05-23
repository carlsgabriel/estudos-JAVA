import java.util.Scanner;
import java.util.Random;

public class esExercicio03 {

    public static void main(String[] args){

        /*Um sistema de palpites utiliza um número aleatório para que o usuário tente acertar. O número aleatório varia de 1 a 100. 
        O jogo começa pedindo que o usuário insira um número.
        Se o número for menor que o número aleatório, o sistema deve exibir "Muito baixo!", se for exatamente o número aleatório, deve exibir "Parabéns, acertou!", e se for maior que o número aleatório, deve exibir "Muito alto!". */
    
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        int aleatorio = generator.nextInt(101);

        System.out.print("Insira um número (1-100): ");
        int palpite = scan.nextInt();

        int aux = 0;

        while(aux != aleatorio){

            if(palpite < aleatorio){
               System.out.println("Muito baixo!");
               System.out.println();
              System.out.print("Insira outro palpite: ");
              palpite = scan.nextInt();
            } else if (palpite > aleatorio) {
                System.out.println("Muito alto!");
                System.out.println();
                System.out.print("Insira outro palpite: ");
                palpite = scan.nextInt();
            } else {
             System.out.println("Parabéns, acertou!");
             System.out.println("O número era: " + aleatorio);
             aux = palpite;
            }

        }

        scan.close();

    }

}
