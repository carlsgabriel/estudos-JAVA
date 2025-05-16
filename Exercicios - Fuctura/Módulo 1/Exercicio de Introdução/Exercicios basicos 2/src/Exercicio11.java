import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args){

        /*Escreva um programa que leia o peso e a altura de uma pessoa e calcule o seu índice de massa corporal (IMC). 
        Fórmula do IMC: peso / (altura * altura). 
        De acordo com o IMC, mostre a classificação da pessoa: 
        IMC:Abaixo de 18,5 - Classificação:Abaixo do peso
        IMC:Entre 18,5 e 24,9 - Classificação:Peso normal
        IMC:Entre 25 e 29,9 - Classificação:Sobrepeso
        IMC:Entre 30 e 34,9 - Classificação:Obesidade grau I
        IMC:Entre 35 e 39,9 -Classificação:Obesidade grau II
        IMC:Acima de 40 - Classificação:Obesidade grau III */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scan.nextDouble();
        System.out.print("Agora digite sua altura: ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        if(imc >= 0 && imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III.");
        }

        scan.close();

    }

}
