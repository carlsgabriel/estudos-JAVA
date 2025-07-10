package servico;

import modelo.Album;
import modelo.Categoria;
import repositorio.RepositorioAlbum;
import repositorio.RepositorioCategoria;
import repositorio.RepositorioItem;

public class ServicoAlbum {

    public String adicionar(String titulo, String autorOuArtista, String categoriaString){
        Album albumExiste = RepositorioAlbum.albuns.stream().filter(x -> x.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);

        if(albumExiste != null){
            return "Já existe um album com esse titulo.";
        } else {
            if(titulo.isBlank() || autorOuArtista.isBlank() || categoriaString.isBlank()){
                return "Os campos titulo, autor ou artista e categoria devem ser obrigatoriamente preenchidos.";
            } else {
                Categoria categoriaExiste = RepositorioCategoria.categorias.stream().filter(x -> x.getNome().equalsIgnoreCase(categoriaString)).findFirst().orElse(null);

                if(categoriaExiste != null){
                    Album album = new Album(titulo, autorOuArtista, categoriaExiste);

                    categoriaExiste.adicionarItens(album);

                    RepositorioAlbum.albuns.add(album);
                    RepositorioItem.itens.add(album);

                    return "Álbum adicionado com sucesso.";
                } else {
                    Categoria categoria = new Categoria(categoriaString);
                    Album album = new Album(titulo, autorOuArtista, categoria);

                    categoria.adicionarItens(album);
                    RepositorioCategoria.categorias.add(categoria);

                    RepositorioAlbum.albuns.add(album);
                    RepositorioItem.itens.add(album);

                    return "Álbum adicionado com sucesso.";
                }
            }
        }
    }

}
