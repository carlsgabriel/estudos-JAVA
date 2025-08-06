public class Casa extends Imovel {

    private Double comprimento;
    private Double largura;

    public Casa(String endereco, Double preco, Double comprimento, Double largura) {
        super(endereco, preco);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa com " + String.format("%.1f", calcularArea()) + " m².\n");
        sb.append("Localizada em " + getEndereco() + ".\n");
        sb.append("Atualmente avaliada em R$" + String.format("%.1f", getPreco()) + "\n");

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

}
