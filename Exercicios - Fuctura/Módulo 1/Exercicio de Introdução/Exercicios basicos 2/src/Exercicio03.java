import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){

        /*Faça um programa que leia três notas de um aluno e calcule a média. 
        Se a média for maior ou igual a 7, o aluno está aprovado. Se a média for menor que 4, o aluno está reprovado. Se a média estiver entre 4 e 7, o aluno precisa fazer uma prova final. O programa deve escrever a situação do aluno, juntamente com sua média. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media < 4){
            System.out.printf("Média: %.2f - Você foi reprovado.%n", media);
        } else if (media >= 4 && media < 7) {
            System.out.printf("Média: %.2f - Você precisa fazer uma prova final.%n", media);
        } else {
            System.out.printf("Média: %.2f - Você foi aprovado.%n", media);
        }

        scan.close();

    }

}
