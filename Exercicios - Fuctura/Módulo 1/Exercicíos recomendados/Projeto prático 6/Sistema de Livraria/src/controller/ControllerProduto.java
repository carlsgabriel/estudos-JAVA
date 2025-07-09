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
        if(preco < 0){
            return "O preço do produto deve ser positivo.";
        }

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

    public String alterarDados(String nome, String nomeNovo, double preco, String novaCategoria){
        if(preco < 0){
            return "O preço do produto deve ser positivo.";
        }

        //"pAtual" apenas para ter acesso ao Produto atual.
        Produto pAtual = produtos.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
        if(pAtual == null){
            return "Não existe produto com esse nome.";
        }

        //"cAtual" apenas para ter acesso a Categoria atual do produto.
        //Foi alterada a forma como tava antes, exigindo que o usuário inserisse uma categoria, porque não é papel do usuário apontar a categoria daquele produto... se aquele produto está vinculado a uma categoria, é obrigação do sistema pegar aquela categoria e gerencia-la. Por isso foi removido String categoriaString.
        Categoria cAtual = ControllerCategoria.categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(pAtual.getCategoria().getNome())).findFirst().orElse(null);

        //O produto pode continuar o mesmo e não tem tanto problema, mas a categoria pode mudar e aí já deve ocorrer uma "manobrar" maior, então devemos verificar se essa nova Categoria é existente ou nova:
        Categoria cNova = ControllerCategoria.categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(novaCategoria)).findFirst().orElse(null);
        if(cNova == null){
            //Se essa nova categoria é nova, quer dizer que a categoria do seu Produto vai mudar, ele não vai mais pertencer a cAtual...
            cAtual.removerProduto(pAtual);

            //Computar possiveis alterações do Produto
            pAtual.setNome(nomeNovo);
            pAtual.setPreco(preco);

            //Agora vamos cuidar para criar a nova Categoria, adiciona-la na List<Categoria> geral e adicionar na Categoria o Produto e no Produto a categoria.
            Categoria categoria = new Categoria(novaCategoria);
            pAtual.setCategoria(categoria);
            categoria.adicionarProduto(pAtual);
            ControllerCategoria.categorias.add(categoria);

            return "Produto alterado com sucesso.";
        } else {
            //Caso a categoria já seja existente....
            //Pode ser que o produto vá para mesma que já estava, ou vá para uma outra já existente.
            cAtual.removerProduto(pAtual);

            //Computador possiveis alterações em Produto
            pAtual.setNome(nomeNovo);
            pAtual.setPreco(preco);

            //Adicionar o Produto a esta Categoria inserida pelo usuário e inserir em Produto a Categoria.
            pAtual.setCategoria(cNova);
            cNova.adicionarProduto(pAtual);

            return "Produto alterado com sucesso.";
        }
    }

    public String listarProdutos(){
        StringBuilder sb = new StringBuilder();

        if(produtos.size() <= 0){
            sb.append("Não há produtos a serem listados.");
        } else {
            for(Produto produto : produtos){
                sb.append("Nome: " + produto.getNome() + " - Categoria: " + produto.getCategoria().getNome() + "\n");
            }
        }

        return sb.toString();
    }

    public String removerProduto(String nome){
        if(produtos.size() <= 0){
            return "Não há produtos a serem removidos.";
        } else {
            Produto p = produtos.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);

            if(p == null){
                return "Nome de produto inexistente ou incorreto.";
            } else {
                Categoria c = ControllerCategoria.categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(p.getCategoria().getNome())).findFirst().orElse(null);

                c.removerProduto(p);
                produtos.remove(p);

                return "Produto removido com sucesso.";
            }
        }
    }

}
