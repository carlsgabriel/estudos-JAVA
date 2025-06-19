package exercicioPOO05;

import java.util.Scanner;

public class AppPOO05 {

    public static void main(String[] args){

        /*Crie uma classe Pessoa com os atributos nome, idade e genero. 
        Encapsule os atributos e implemente métodos para definir e obter os valores de forma segura.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Gênero [Masculino/Feminino]: ");
        String genero = scan.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setGenero(genero);

        System.out.println();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Genero: " + pessoa.getGenero());

        scan.close();

    }

}
