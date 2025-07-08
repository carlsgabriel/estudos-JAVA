package model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    private List<Produto> produtos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

}
