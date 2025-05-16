import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){

        /*Implemente um sistema de semáforo usando switch case. Receba um estado (vermelho, amarelo ou verde) e determine a ação apropriada.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a cor do semáforo (verde - amarelo - vermelho)? ");
        String cor = scan.nextLine();

        switch (cor) {
            case "verde":
                System.out.println("Siga!");
                break;
            case "amarelo":
                System.out.println("Atenção!");
                break;
            case "vermelho":
                System.out.println("Pare!");
                break;
            default:
                System.out.println("Cor diferente... insira uma cor válida.");
                break;
        }
    
        scan.close();

    }

}
