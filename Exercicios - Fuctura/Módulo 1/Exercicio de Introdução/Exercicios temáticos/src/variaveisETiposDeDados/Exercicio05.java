import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args){

        /*Gervásio quer um programa que armazene suas notas em quatro matérias e calcule a média.
        Use variáveis para guardar o nome de cada matéria, as notas de cada uma e exiba a média final, junto com as notas e os nomes das matérias. */
        
        Scanner scan = new Scanner(System.in);

        String por = "Português";
        String mat = "Matemática";
        String his = "História";
        String geo = "Geografia";

        System.out.print("Insira a sua primeira nota em " + por + ": ");
        double por1 = scan.nextDouble();
        System.out.print("Insira a sua segunda nota em " + por + ": ");
        double por2 = scan.nextDouble();
        System.out.println();

        double mediaPor = (por1 + por2) / 2;

        System.out.print("Insira a sua primeira nota em " + mat + ": ");
        double mat1 = scan.nextDouble();
        System.out.print("Insira a sua segunda nota em " + mat + ": ");
        double mat2 = scan.nextDouble();
        System.out.println();

        double mediaMat = (mat1 + mat2) / 2;

        System.out.print("Insira a sua primeira nota em " + his + ": ");
        double his1 = scan.nextDouble();
        System.out.print("Insira a sua segunda nota em " + his + ": ");
        double his2 = scan.nextDouble();
        System.out.println();

        double mediaHis = (his1 + his2) / 2;

        System.out.print("Insira a sua primeira nota em " + geo + ": ");
        double geo1 = scan.nextDouble();
        System.out.print("Insira a sua segunda nota em " + geo + ": ");
        double geo2 = scan.nextDouble();
        System.out.println();

        double mediaGeo = (geo1 + geo2) / 2;

        System.out.printf("Matéria: %s - Nota: %.2f%n", por, mediaPor);
        System.out.printf("Matéria: %s - Nota: %.2f%n", mat, mediaMat);
        System.out.printf("Matéria: %s - Nota: %.2f%n", his, mediaHis);
        System.out.printf("Matéria: %s - Nota: %.2f%n", geo, mediaGeo);


        scan.close();

    }

}
