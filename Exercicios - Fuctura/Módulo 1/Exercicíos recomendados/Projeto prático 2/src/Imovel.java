public abstract class Imovel implements Construcao {

    private String endereco;
    private Double preco;

    public Imovel(String endereco, Double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public abstract String getDescricao();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}

