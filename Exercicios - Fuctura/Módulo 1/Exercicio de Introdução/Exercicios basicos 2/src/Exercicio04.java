import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){

        /*Escreva um programa que leia a idade de uma pessoa e diga se ela pode votar ou não nas eleições. 
        No Brasil, o voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre 16 e 18 anos ou maiores de 70 anos.*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if(idade >= 18 && idade <= 70){
            System.out.println("Você está entre 18-70 anos, a votação é obrigatória.");
        } else if ((idade >= 16 && idade < 18) || idade > 70){
            System.out.println("Você está entre 16 a quase 18 anos ou já tem mais de 70. A votação é facultativa.");
        } else {
            System.out.println("Você não tem idade para votar.");
        }

        scan.close();

    }

}
