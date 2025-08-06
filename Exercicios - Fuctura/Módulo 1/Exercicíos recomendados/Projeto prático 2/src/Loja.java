public class Loja extends Imovel {

    private Double comprimento;
    private Double largura;
    private String nome;

    public Loja(String endereco, Double preco, Double comprimento, Double largura, String nome) {
        super(endereco, preco);
        this.comprimento = comprimento;
        this.largura = largura;
        this.nome = nome;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da loja: " + nome + "\n");
        sb.append("Loja com " + String.format("%.1f", calcularArea()) + "m².\n");
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
