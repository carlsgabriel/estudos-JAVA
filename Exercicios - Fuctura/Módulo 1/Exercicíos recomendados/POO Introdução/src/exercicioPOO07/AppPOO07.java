package exercicioPOO07;

import java.util.Scanner;

public class AppPOO07 {

    public static void main(String[] args){

        /*Crie uma classe SerVivo com os atributos nome e idade. Implemente métodos para definir e obter os valores dos atributos.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do ser vivo: ");
        String nome = scan.nextLine();
        System.out.print("Idade: ");
        int idade = scan.nextInt();

        SerVivo serVivo = new SerVivo();
        serVivo.setNome(nome);
        serVivo.setIdade(idade);

        System.out.println();

        System.out.println("Nome do ser vivo: " + serVivo.getNome());
        System.out.println("Idade do ser vivo: " + serVivo.getIdade());

        scan.close();

    }

}
