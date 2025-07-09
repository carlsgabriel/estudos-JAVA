package controller;

import java.util.ArrayList;
import java.util.List;

import model.Categoria;
import model.Produto;

public class ControllerCategoria {

    static List<Categoria> categorias = new ArrayList<>();

    public static List<Categoria> getCategorias() {
        return categorias;
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }

    public String consultarProdutosPorCategoria(String nomeCategoria){
        StringBuilder sb = new StringBuilder();

        int count = 0;
        Categoria categoria = categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeCategoria)).findFirst().orElse(null);
        if(categorias.size() <= 0){
            sb.append("Não há categorias a serem listadas.");
        } else {
            if(categoria == null){
                sb.append("Categoria inexistente.");
            } else {
                sb.append("[Produtos da categoria \"" + categoria.getNome() + "\"]\n");
                for(Produto p : categoria.getProdutos()){
                    sb.append("Nome: " + p.getNome() + " - Preço: R$" + p.getPreco() + "\n");
                    count++;
                }
                sb.append("Total de produtos na categoria \"" + categoria.getNome() + "\": " + count);
            }
        }
    
        return sb.toString();
    }

}
