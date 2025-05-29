import java.util.ArrayList;
import java.util.List;

public class Pedido {

    List<Produto> produtos = new ArrayList<>();

    public void addProdutos(Produto produto) {
        produtos.add(produto);
    }

    public String listarProdutos() {
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        double total = 0;

        for (Produto produto : produtos) {
            sb.append(produto.getNome() + " - R$" + produto.getPreco() + "\n");
            sum++;
            total += produto.getPreco();
        }

        sb.append("Total de itens: " + sum + " - Valor total: R$" + String.format("%.2f", total));

        return sb.toString();
    }

}
