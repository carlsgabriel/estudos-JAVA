package POO2Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class CaixaSupermercado {

    private Integer numeroCompra;
    private Double totalCompra;

    List<Produto> itensComprados = new ArrayList<>();

    public CaixaSupermercado(Integer numeroCompra){
        this.numeroCompra = numeroCompra;
        this.totalCompra = 0.0;
    }

    public Integer getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(Integer numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public void adicionarItemCompra(Produto produto){
        itensComprados.add(produto);
    }

    public void removerItemCompra(Produto produto){
        if(itensComprados.size() > 0){
            itensComprados.remove(produto);
        }
    }

    public String calcularTotalCompra(){
        double sum = 0;
    
        if(itensComprados.size() == 0){
            return "Não há nenhum produto na lista.";
        } else {
            for(Produto p : itensComprados){
                sum += p.getPreco() * p.getQuantidade();
            }
            this.totalCompra = sum;
            return String.format("%.2f", sum);
        }
    }

    public String notaFiscal(){
        if(itensComprados.size() == 0){
            return "Não há nenhum produto na lista.";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Número da compra: " + numeroCompra + "\n");
            sb.append("---------------\n");
            sb.append("Produtos: \n");
            for(Produto p : itensComprados){
                sb.append("\nNome: " + p.getNome() + "\n");
                sb.append("Preço: " + p.getPreco() + "\n");
                sb.append("Quantidade: " + p.getQuantidade() + "\n");
            }
            sb.append("---------------\n");
            sb.append("Valor total: R$" + calcularTotalCompra());

            return sb.toString();
        }
    }

    public String fecharCompra(){
        numeroCompra++;
        return "Compra finalizada com sucesso.";
    }

    public String aceitarPagamento(String metodoPagamento){
        if(!(metodoPagamento.equalsIgnoreCase("dinheiro")) && !(metodoPagamento.equalsIgnoreCase("pix")) && !(metodoPagamento.equalsIgnoreCase("cartao"))){
            return "Forma de pagamento inválida.";
        } else if (metodoPagamento.equalsIgnoreCase("dinheiro")) {
            return "O valor R$" + String.format("%.2f", totalCompra) + " foi pago em espécie.";
        } else if (metodoPagamento.equalsIgnoreCase("pix")) {
            return "O valor R$" + String.format("%.2f", totalCompra) + " foi pago via pix.";
        } else {
            return "O valor R$" + String.format("%.2f", totalCompra) + " foi pago com cartão.";
        }
    }

}
