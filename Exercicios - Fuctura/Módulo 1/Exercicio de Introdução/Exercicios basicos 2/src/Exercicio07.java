import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){

        /*Escreva um programa que leia dois números inteiros e um operador aritmético (+, -, *, /) e realize a operação correspondente. Se o operador não for válido, mostre uma mensagem de erro.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Qual operador arimético deseja usar (+ - * /)? ");
        char op = scan.next().charAt(0);

        if(op == '+'){
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Valor inválido.\nEscolha um dos operadores aritméticos disponíveis.");
        }

        scan.close();

    }

}
