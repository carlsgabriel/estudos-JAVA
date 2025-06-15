import java.util.Scanner;

public class AppPOO01 {

    public static void main(String[] args) {

        /*Crie uma classe Produto com os atributos nome, preco e quantidade. 
        Implemente métodos para definir e obter os valores dos atributos, bem como um método para calcular o valor total do estoque (preco * quantidade).*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scan.nextLine();
        System.out.print("Preço do produto: R$");
        double preco = scan.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scan.nextInt();

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        System.out.println();

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: R$" + String.format("%.2f", produto.getPreco()));
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Total: R$" + String.format("%.2f", produto.total()));

        scan.close();

    }

}
