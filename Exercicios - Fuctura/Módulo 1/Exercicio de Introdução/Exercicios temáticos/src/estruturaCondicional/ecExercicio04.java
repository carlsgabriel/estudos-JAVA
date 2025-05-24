import java.util.Scanner;

public class ecExercicio04 {

    public static void main(String[] args){

        /*Uma escola considera um aluno aprovado se a média das suas três notas 
        for maior ou igual a 7. Caso contrário, ele vai para recuperação.
        Porém, se o aluno tiver uma média 10, ele ganha um chocolate.
        Escreva um programa que receba três notas e informe se o aluno foi aprovado, se ganhou um chocolate ou se precisa de recuperação.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a primeiro nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Insira a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media < 7){
            System.out.printf("Nota: %.2f%n", media);
            System.out.println("Recuperação!");
        } else if (media >= 7 && media < 10) {
            System.out.printf("Nota: %.2f%n", media);
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.printf("Nota: %.2f%n", media);
            System.out.println("Parabéns! Pela sua nota, você ganhou um chocolate.");
        } else {
            System.out.println("Média inválida.");
        }

    scan.close();

    }

}