public class Predio extends Imovel {

    private Double comprimento;
    private Double largura;
    private Integer quantidadeAndares;

    public Predio(String endereco, Double preco, Double comprimento, Double largura, Integer quantidadeAndares) {
        super(endereco, preco);
        this.comprimento = comprimento;
        this.largura = largura;
        this.quantidadeAndares = quantidadeAndares;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura * quantidadeAndares;
    }

    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prédio com " + String.format("%.1f", calcularArea()) + "m².\n");
        sb.append(quantidadeAndares + " andares. " + String.format("%.1f", (comprimento * largura)) + "m² cada.\n");
        sb.append("Localizada em " + getEndereco() + ".\n");
        sb.append("Atualmente avaliada em R$" + getPreco() + "\n");

        return sb.toString();
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Integer getQuantidadeAndares() {
        return quantidadeAndares;
    }

    public void setQuantidadeAndares(Integer quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }

}
