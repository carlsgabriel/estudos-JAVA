package servico;

import modelo.Album;
import modelo.Categoria;
import modelo.Item;
import modelo.Livro;
import modelo.Revista;
import repositorio.RepositorioCategoria;

public class ServicoCategoria {

    public String filtrarCategoriaEspecifica(String tipo, String categoria) {
        /*A lógica do código aqui foi a seguinte: 
         * O usuário vai dizer qual Tipo de item ele quer filtrar e qual a categoria daquele tipo de item.
         * Eu poderia muito bem ter ido no "banco de dados geral de todos os itens" (RepositorioItem) e verificar o seguinte:
         * Há aquele tipo de item? Há aquela categoria?
         * Se sim, percorrer todos os itens do "banco de dados" verificando se a instancia daquele item corresponde ao tipo do item indicado pelo usuario.
         * Se existe e a categoria dessa instância desejada for igual a categoria desejeda pelo usuário, exibir esse item.
         *  
         * 
         * Eu fiz bem dizer a mesma coisa do que disse acima, só que ao invés de ir no "banco de dados geral", procurei pelos itens no "banco de dados de categoria" (RepositorioCategoria). Esse "banco de dados de Categoria" também tem todos os itens cadastrados associado a suas categorias, só que mais "especifico".
         * 
         * 
         * Com isso:
         * 1. Verificar se existem categorias a serem listadas. Se sim, continua, se não, retorna que não há categorias a serem listadas.
         * 2. Verificar se o usuário inseriu um dos 3 itens disponíveis (Livro, Revista, Algum). Se sim, continua, se não, retorna que não há aquele tipo de item.
         * 3. Verificar se aquela categoria inserida pelo usuário existe. Se sim, continua, se não, retorna que aquela categoria não existe.
         * 4. Verificar qual tipo de item foi inserido pelo usuário e a partir disso:
         *      Percorrer a lista de itens vinculado aquela categoria no "banco de dados de categoria" verificando o seguinte:
         *              Existem itens vinculados a essa categoria? se não, retorne que não existem, se sim, continue.
         *                  Se esse Item dessa lista possuir dentro dele uma instancia do mesmo tipo desejado pelo usuário (livro = livro, revista = revista, album = album)
         *                      Adicione suas informações ao StringBuilder para exibi-los posteriormente. 
        */
        StringBuilder sb = new StringBuilder();
        
        int itens = 0;

        if (RepositorioCategoria.categorias.size() <= 0) {
            sb.append("Não há categorias a serem filtradas.");
        } else {
            if (tipo.equalsIgnoreCase("Livro") || tipo.equalsIgnoreCase("Revista") || tipo.equalsIgnoreCase("Album")) {
                Categoria categoriaExiste = RepositorioCategoria.categorias.stream()
                        .filter(x -> x.getNome().equalsIgnoreCase(categoria)).findFirst().orElse(null);

                if (categoriaExiste != null) {
                    if(tipo.equalsIgnoreCase("Livro")){
                            for (Item i : categoriaExiste.getItens()) {
                                if(i instanceof Livro){
                                    sb.append("\nTitulo: " + i.getTitulo() + "\n");
                                    sb.append("Autor ou artista: " + i.getAutorOuArtista() + "\n");
                                    sb.append("Categoria: " + i.getCategoria().getNome() + "\n");

                                    //Caso existam itens do tipo Livro nessa Lista, você adicionará as informações ao StringBuilder, beleza... mas, e se não tiver?
                                    //É ai que entra a variável itens... se ela permanecer 0 é porque não tinham livros e você não vai exibir nada.
                                    itens++;
                                }
                            }
                    } else if (tipo.equalsIgnoreCase("Revista")){
                            for (Item i : categoriaExiste.getItens()) {
                                if(i instanceof Revista){
                                    sb.append("\nTitulo: " + i.getTitulo() + "\n");
                                    sb.append("Autor ou artista: " + i.getAutorOuArtista() + "\n");
                                    sb.append("Categoria: " + i.getCategoria().getNome() + "\n");

                                    itens++;
                                }
                            }
                    } else {
                            for (Item i : categoriaExiste.getItens()) {
                                if(i instanceof Album){
                                    sb.append("\nTitulo: " + i.getTitulo() + "\n");
                                    sb.append("Autor ou artista: " + i.getAutorOuArtista() + "\n");
                                    sb.append("Categoria: " + i.getCategoria().getNome() + "\n");

                                    itens++;
                                }
                            }
                    }
                } else {
                    sb.append("Não há categoria com esse nome.");
                }
            } else {
                sb.append("Não há esse tipo de item.");
            }
        }

        if(itens <= 0){
            return "\nEsse tipo de item não existe nesta categoria.";
        } else {
            return sb.toString();
        }
    }

}
