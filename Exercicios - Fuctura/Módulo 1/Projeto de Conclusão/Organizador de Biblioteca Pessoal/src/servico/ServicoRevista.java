package servico;

import modelo.Categoria;
import modelo.Revista;
import repositorio.RepositorioCategoria;
import repositorio.RepositorioItem;
import repositorio.RepositorioRevista;

public class ServicoRevista {

    public String adicionar(String titulo, String autorOuArtista, String categoriaString){
        Revista revistaExiste = RepositorioRevista.revistas.stream().filter(x -> x.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);

        if(revistaExiste != null){
            return "Já existe uma revista com esse mesmo titulo.";
        } else {
            if(titulo.isBlank() || autorOuArtista.isBlank() || categoriaString.isBlank()){
                return "Os campos titulo, autor ou artista e categoria devem ser obrigatoriamente preenchidos.";
            } else {    
                Categoria categoriaExiste = RepositorioCategoria.categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(categoriaString)).findFirst().orElse(null);

                if(categoriaExiste != null){
                    Revista revista = new Revista(titulo, autorOuArtista, categoriaExiste);
                    categoriaExiste.adicionarItens(revista);

                    RepositorioRevista.revistas.add(revista);
                    RepositorioItem.itens.add(revista);

                    return "Revista adicionada com sucesso.";
                } else {
                    Categoria categoria = new Categoria(categoriaString);
                    Revista revista = new Revista(titulo, autorOuArtista, categoria);

                    categoria.adicionarItens(revista);
                    RepositorioCategoria.categorias.add(categoria);

                    RepositorioRevista.revistas.add(revista);
                    RepositorioItem.itens.add(revista);

                    return "Revista adicionada com sucesso.";
                }
            }
        }
    }

}
