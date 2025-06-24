package exercicioPOO09;

import java.util.Scanner;

public class AppPOO09 {

    public static void main(String[] args){

        /*Crie uma classe Ave que herda da classe Animal . 
        Adicione um atributo tipoDeBico e um método para voar.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome da ave: ");
        String nome = scan.nextLine();
        System.out.print("Idade da ave: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Espécie da ave: ");
        String especie = scan.nextLine();
        System.out.print("Tipo de bico: ");
        String tipoDeBico = scan.nextLine();

        Ave ave = new Ave();
        ave.setNome(nome);
        ave.setIdade(idade);
        ave.setEspecie(especie);
        ave.setTipoDeBico(tipoDeBico);

        System.out.println();

        System.out.println(ave.voar());
        System.out.println("\n" + ave.informacoes());


        scan.close();

    }

}