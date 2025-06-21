import java.util.Scanner;

public class AppPOO06 {

    public static void main(String[] args){

        /*Crie uma classe Animal com os atributos nome, idade e especie. 
        Encapsule os atributos e implemente métodos para emitir um som característico do animal e para imprimir todas as informações do animal.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do animal: ");
        String nome = scan.nextLine();
        System.out.print("Idade do animal: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Espécie do animal: ");
        String especie = scan.nextLine();

        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setIdade(idade);
        animal.setEspecie(especie);

        System.out.println();

        System.out.println(animal.emitirSom());
        System.out.println("\n" + animal.informacoes());

        scan.close();

    }

}