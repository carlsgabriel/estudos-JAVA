import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args){

        /*Escreva um programa que leia o salário de um funcionário e aplique um aumento de acordo com a seguinte tabela: 
        Faixa salarial: Até R$ 1.500,00 - Percentual de Aumento: 15% 
        Faixa Salarial: De R$ 1.500,01 até R$ 2.500,00 Percentual de Aumento: 10% 
        Faixa Salarial: Acima de R$ 2.500,00 - Percentual de Aumento: 5% */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = scan.nextDouble();

        if(salario >= 0 && salario <= 1500){
            double aumento = salario + salario * 0.15;
            System.out.printf("Com o aumento, seu salário agora é: R$%.2f%n", aumento);
        } else if(salario > 1500 && salario <= 2500) {
            double aumento = salario + salario * 0.10;
            System.out.printf("Com o aumento, seu salário agora é: R$%.2f%n", aumento);
        } else {
            double aumento = salario + salario * 0.05;
            System.out.printf("Com o aumento, seu salário agora é: R$%.2f%n", aumento);
        }

        scan.close();

    }


}
