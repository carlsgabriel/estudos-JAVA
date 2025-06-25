package exercicioPOO10;

import java.util.Scanner;

public class Principal10 {

    public static void main(String[] args){

        /*Crie uma classe SerVivo com os atributos nome e idade. Implemente métodos para definir e obter os valores dos atributos.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome da planta: ");
        String nome = scan.nextLine();
        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Tipo da planta: ");
        String tipo = scan.nextLine();

        Planta planta = new Planta();
        planta.setNome(nome);
        planta.setIdade(idade);
        planta.setTipo(tipo);

        System.out.println();

        System.out.println("Nome da planta: " + planta.getNome());
        System.out.println("Idade da planta: " + planta.getIdade());
        System.out.println("Tipo da planta: " + planta.getIdade());

        System.out.println();

        System.out.println(planta.fotossinteze());

        scan.close();

    }

}
