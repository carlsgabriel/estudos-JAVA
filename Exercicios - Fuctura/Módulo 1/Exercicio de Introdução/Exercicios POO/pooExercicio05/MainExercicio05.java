import java.util.Scanner;

public class MainExercicio05 {

    public static void main(String[] args) {

        /*Crie uma classe Produto com atributos nome e preco.
        Em seguida, crie uma classe Pedido que possui uma lista de Produto e métodos para adicionar e listar os produtos do pedido. 
        Instancie um pedido e adicione alguns produtos, exibindo o total final. */

        Scanner scan = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.print("Quantos itens você quer adicionar? ");
        int n = scan.nextInt();
        scan.nextLine();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do produto: ");
            String nome = scan.nextLine();

            System.out.print("Preço do produto: R$");
            double preco = scan.nextDouble();
            scan.nextLine();

            Produto produto = new Produto(nome, preco);
            pedido.addProdutos(produto);

            System.out.println();
        }


        System.out.println();

        System.out.println("Itens na lista:");
        System.out.println(pedido.listarProdutos());

        scan.close();

    }

}
