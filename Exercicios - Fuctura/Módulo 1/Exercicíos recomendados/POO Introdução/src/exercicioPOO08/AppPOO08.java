package exercicioPOO08;

import java.util.Scanner;

public class AppPOO08 {

    public static void main(String[] args){

        /*Crie uma classe Mamifero que herda da classe Animal. 
        Adicione um atributo genero e um método para amamentar.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do animal mamifero: ");
        String nome = scan.nextLine();
        System.out.print("Idade do animal mamifero: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Espécie do animal mamifero: ");
        String especie = scan.nextLine();
        System.out.print("Gênero do animal [Masculino/Feminino]: ");
        String genero = scan.nextLine();

        Mamifero mamifero = new Mamifero();
        mamifero.setNome(nome);
        mamifero.setIdade(idade);
        mamifero.setEspecie(especie);
        mamifero.setGenero(genero);

        System.out.println();

        System.out.println(mamifero.emitirSom());
        System.out.println("\n" + mamifero.informacoes());


        scan.close();

    }

}
