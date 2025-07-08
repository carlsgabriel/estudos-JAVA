package controller;

import java.util.ArrayList;
import java.util.List;

import model.Categoria;
import model.Produto;

public class ControllerProduto {

    static List<Produto> produtos = new ArrayList<>();

    public String cadastrarProduto(String nome, double preco, String categoriaString) {
        /*
         * A minha lógica aqui é o seguinte:
         * 1. Se já existe algum produto com esse mesmo nome, diga que já existe... caso
         * não tenha
         * 2. Crie uma Categoria para verificar o seguinte
         * 3. Se já existe uma Categoria com esse mesmo nome na lista geral das
         * categorias
         * Apenas adicione o Produto nesse controller e ao elemento de categoria já
         * existente na list geral de Categorias
         * 4. Caso contrário, crie uma Categoria com o nome desejado, adicione-a na list
         * geral das Categorias e adicione as coisas aqui no controller e lá na lista
         * geral de Categorias.
         * 
         * Por que criar uma list geral?
         * Porque se não fizermos isso, no futuro não será possivel listar os produtos
         * por categoria.
         * Dessa forma, na lista geral de Categorias cada elemento representará uma
         * categoria diferente, com seus produtos.
         */
        Produto p = produtos.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);

        if (p == null) {
            Categoria c = ControllerCategoria.categorias.stream()
                    .filter(x -> x.getNome().equalsIgnoreCase(categoriaString)).findFirst().orElse(null);

            if (c == null) {
                Categoria categoria = new Categoria(categoriaString);
                Produto produto = new Produto(nome, preco, categoria);

                categoria.adicionarProduto(produto);

                ControllerCategoria.categorias.add(categoria);
                produtos.add(produto);
            } else {
                Produto produto = new Produto(nome, preco, c);

                c.adicionarProduto(produto);

                produtos.add(produto);
            }

            return "Produto cadastrado com sucesso.";
        } else {
            return "Já há um produto com esse mesmo nome cadastrado.";
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}
