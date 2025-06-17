package exercicioPOO02;

import java.util.Scanner;

public class AppPOO02 {

    public static void main(String[] args){

    /*Crie uma classe Funcionario com os atributos nome, cargo e salario. 
    Implemente métodos para definir e obter os valores dos atributos, bem como um método para aumentar o salário em uma certa porcentagem.*/

    Scanner scan = new Scanner(System.in);

    System.out.print("Nome do funcionário: ");
    String nome = scan.nextLine();
    System.out.print("Cargo do funcionário: ");
    String cargo = scan.nextLine();
    System.out.print("Salário do funcionário: R$");
    double salario = scan.nextDouble();

    Funcionario funcionario = new Funcionario();
    funcionario.setNome(nome);
    funcionario.setCargo(cargo);
    funcionario.setSalario(salario);

    System.out.println();

    System.out.print("Em quantos porcentos o salário será aumentado: ");
    double porcentagem = scan.nextDouble();
    funcionario.aumentoSalarial(porcentagem);

    System.out.println();

    System.out.println("Nome do funcionário: " + funcionario.getNome());
    System.out.println("Cargo:  " + funcionario.getCargo());
    System.out.println("Teve um aumento de " + porcentagem + "% e agoa receberá: R$" + String.format("%.2f", funcionario.getSalario()));

    scan.close();

    }

    

}
