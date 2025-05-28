import java.util.Scanner;

public class MainExercicio04 {

    public static void main(String[] args) {

        /*Crie uma classe Pessoa com atributos nome e idade, e uma classe Funcionario que herda de Pessoa com um atributo salario. 
        Adicione um método para exibir todas as informações do funcionário. 
        Instancie um funcionário e mostre seus dados. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.print("Insira a idade do funcionário: ");
        int idade = scan.nextInt();

        System.out.print("Insira o salário do funcionário: R$");
        double salario = scan.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, salario);

        System.out.println();

        System.out.println(funcionario);

        scan.close();

    }

}