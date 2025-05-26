import java.util.Scanner;

public class MainExercicio01 {

    public static void main(String[] args){

        /*Crie uma classe Animal com atributos nome, especie e idade, e métodos para mostrar esses dados. Em seguida,
        crie uma classe Cachorro que herda de Animal e adiciona o método latir. Crie um objeto Cachorro e faça-o latir. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do cachorro: ");
        String nome = scan.nextLine();

        System.out.print("Especie do cachorro: ");
        String especie = scan.nextLine();

        System.out.print("Idade do cachorro: ");
        int idade = scan.nextInt();

        Cachorro cachorro = new Cachorro(nome, especie, idade);

        System.out.println();

        System.out.println("[Informações do cachorro]");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Especie: " + cachorro.getEspecie());
        System.out.println("Idade: " + cachorro.getIdade());

        System.out.println();

        System.out.print(cachorro.latir());

        scan.close();

    }

}
