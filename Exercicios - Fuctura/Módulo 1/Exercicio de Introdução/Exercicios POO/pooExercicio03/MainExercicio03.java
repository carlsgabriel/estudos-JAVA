import java.util.Scanner;

public class MainExercicio03 {

    public static void main(String[] args) {

        /*Crie uma classe Veiculo com atributos marca e ano. Em seguida, crie duas classes Carro e Moto que herdam de Veiculo, cada uma com um método específico (ex., acelerar e empinar). Crie objetos de Carro e Moto e use os métodos específicos de cada um. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira abaixo os dados do carro");

        System.out.print("Marca do carro: ");
        String marca = scan.nextLine();

        System.out.print("Ano do carro: ");
        int ano = scan.nextInt();

        Carro carro = new Carro(marca, ano);

        scan.nextLine();
        System.out.println();

        System.out.println("[DADOS DO CARRO]");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println(carro.cavaloDePau());

        System.out.println();

        System.out.println("Insira a baixo os dados da moto");

        System.out.print("Marca da moto: ");
        marca = scan.nextLine();

        System.out.print("Ano da moto: ");
        ano = scan.nextInt();

        Moto moto = new Moto(marca, ano);

        System.out.println();

        System.out.println("[DADOS DA MOTO]");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Ano: " + moto.getAno());
        System.out.println(moto.empinar());

        scan.close();

    }

}