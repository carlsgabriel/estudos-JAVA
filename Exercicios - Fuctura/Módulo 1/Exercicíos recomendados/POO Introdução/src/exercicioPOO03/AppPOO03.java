package exercicioPOO03;

import java.util.Scanner;

public class AppPOO03 {

    public static void main(String[] args){

        /*Crie uma classe Retangulo com os atributos largura e altura. 
        Implemente métodos para calcular a área e o perímetro do retângulo.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Largura: ");
        double largura = scan.nextDouble();
        System.out.print("Altura: ");
        double altura = scan.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.largura = largura;
        retangulo.altura = altura;
        
        System.out.println();

        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perimetro do retângulo: " + retangulo.perimetro());

        scan.close();

    }

}
