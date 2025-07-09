package servico;

import modelo.Categoria;
import modelo.Livro;
import repositorio.RepositorioCategoria;
import repositorio.RepositorioItem;
import repositorio.RepositorioLivro;

public class ServicoLivro {

    public String adicionar(String titulo, String autorOuArtista, String categoriaString){

        /*
         * 1. Vou verificar se o item existe no "banco de dados de livros", que é RepositorioLivro.
         * 2. Se já existir, retornar que já existe.
         * 3. Caso não exista:
         *     4. Verificar a categoria passada como parâmetro no "banco de dados das categorias", que é o RepositorioCategoria.
         *          5. Se essa categoria já existir lá:
         *                Criar um livro e atribuir essa categoria existente a ele.
         *                Adicionar esse livro (já vinculuado a essa categoria) no RepositorioLivro, que é nosso "banco de dados" de livros.
         *                Também adicionar esse livro no "nosso banco de dados geral de itens", que é o RepositorioItem. 
         *                A essa categoria já existente, adicionar esse livro recém criado.
         *                Com isso: Você terá um novo Livro no banco de dados dos livros, já com a categoria certa relacionado a ele e 
         *                          no banco de dados das categorias, você terá esse livro recém criado adicionado a essa categoria.
         *          6. Se não existir:
         *                Criar uma categoria com o mesmo nome de categoria que foi passado no parâmetro do método.
         *                Criar um livro e atribuir essa nova categoria a ele.
         *                Adicionar esse livro (já vinculuado a essa categoria) no RepositorioLivro, que é nosso "banco de dados" de livros.
         *                Também adicionar esse livro no "nosso banco de dados geral de itens", que é o RepositorioItem. 
         *                A essa categoria já recem criada, adicionar esse livro recém criado.
         *                Com isso: Você terá um novo Livro no banco de dados dos livros, já com a categoria certa relacionado a ele e 
         *                          no banco de dados das categorias, você terá uma nova categoria, com esse novo livro já vinculada a ela..
         */

        Livro livroExiste = RepositorioLivro.livros.stream().filter(x -> x.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);

        if(livroExiste != null){
            return "Já existe um livro com esse mesmo titulo.";
        } else {
            Categoria categoriaExiste = RepositorioCategoria.categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(categoriaString)).findFirst().orElse(null);
            
            if(categoriaExiste != null){
                Livro livro = new Livro(titulo, autorOuArtista, categoriaExiste);
                RepositorioLivro.livros.add(livro);
                RepositorioItem.itens.add(livro);

                categoriaExiste.adicionarItens(livro);
                
                return "Livro adicionado com sucesso.";
            } else {
                Categoria categoria = new Categoria(categoriaString);

                Livro livro = new Livro(titulo, autorOuArtista, categoria);
                RepositorioLivro.livros.add(livro);
                RepositorioItem.itens.add(livro);

                categoria.adicionarItens(livro);
                RepositorioCategoria.categorias.add(categoria);

                return "Livro adicionado com sucesso.";
            }
        }

    }

}
