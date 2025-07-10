package servico;

import modelo.Album;
import modelo.Categoria;
import modelo.Item;
import modelo.Livro;
import modelo.Revista;
import repositorio.RepositorioAlbum;
import repositorio.RepositorioItem;
import repositorio.RepositorioLivro;
import repositorio.RepositorioRevista;

public class ServicoItem {

    public String listar(){
        /*Lógica desse código: 
         * 1. Começar verificando se há itens a serem listados...
         * 2 Se há itens a serem listados, fazer o seguinte:
         *      3. Percorrer o nosso "banco de dados geral" (RepositorioItem) e verificar item por item.
         *         OBS: Item é a classe pai. Livro, Revista e Album são os filhos de Item.
         *         Para você ter um "banco de dados geral", tem que ter uma variável/classe que poderá receber ou "ser" também classes filhos.
         *         Com isso você pode ter uma List do tipo da classe pai e nessa List adicionar elementos que são instancias da classe filho
         *         e assim conseguir exibir todos de uma vez só... Isso é polimorfismo.
         *      4. Verificar qual subclasse está instanciada naquela variável de item e a partir disso classifica-la na exibição.
         *      5. Exibir o resto dos dados.
        */
        StringBuilder sb = new StringBuilder();

        if(RepositorioItem.itens.size() <= 0){
            sb.append("Não há itens a serem listados.");
        } else {
            sb.append("[ITENS CADASTRADOS]\n");

            for(Item item : RepositorioItem.itens){
                if(item instanceof Livro){
                    sb.append("\n[LIVRO]\n");
                } else if (item instanceof Revista){
                    sb.append("\n[REVISTA]\n");
                } else {
                    sb.append("\n[ÁLBUM]\n");
                }

                sb.append("Titulo: " + item.getTitulo() + "\n");
                sb.append("Autor ou artista: " + item.getAutorOuArtista() + "\n");
                sb.append("Categoria: " + item.getCategoria().getNome() + "\n");
            }
        }

        return sb.toString();
    }

    public String remover(String tipo, String titulo){
        /*A lógica aqui é o seguinte:
         * O programa tem 1 "banco de dados geral", onde ocorre o polimorfismo e esses itens do banco de dados tem instancias de objetos especificas dentro dele.
         * O programa tem 1 "banco de dados de categorias", onde todas as categorias estarão adicionadas com seus respectivos itens, nesses itens tambem ocorre polimorfismo.
         * O programa tem "banco de dados especificos" para cada entidade.
         * 
         * Pra conseguir remover um item totalmente, tenho que remove-lo de todos os 3 "bancos de dados"...
         * 
         * 1. Primeiro começo pegando, a partir dos dados inseridos pelo usuário, o item e sua respectiva categoria no banco de dados geral. A "lógica" é o seguinte:
         *      Verificar se o usuário inseriu o tipo certo.
         *      Se ele inseriu o tipo certo e como não "sabemos" qual é o tipo, tem que ser feita 3 pesquisas, para cada um dos possiveis tipos.
         *      Por exemplo: Se o tipo é Livro, você tem que pesquisar no banco de dados geral, itens que tenham instância de livro.
         *                   Se esse item é uma instância de livro, verifique agora se o nome titulo dele é o mesmo titulo inserido pelo usuário.
         *                   Se tudo isso acontecer, aquele é o nosso item caso ele tenha inserido que o tipo era Livro.
         *                   OBS: Não tem como não ser o item daquele tipo com aquele titulo, porque você pode ter até itens preenchidos com os mesmos valores
         *                        no banco de dados geral, porém as instâncias deles não podem ser as mesmas por causa do lógica no método adicionar() nas classes Servico.
         *      Após a pesquisa, salvarei esse item e sua respectiva categoria em variáveis para poder manipula-los mais na frente, na hora da remoção.
         *      
         * 
         * 2. Remover o item do "banco de dados especifico". A lógica aqui é o seguinte:
         *      Como não sei qual é o tipo desse item, tenho que fazer 3 pesquisas, para cada um dos tipos possiveis.
         *      Por exemplo: Se o tipo é livro, tenho que fazer uma pesquisa indo no banco de dados de Livro e pesquisando por um livro que tenha aquele mesmo titulo.
         *                   Lembrando que Livros, Revistas e Álbuns, são unicos. Por isso não tem como ter 2 instâncias iguais com os mesmos dados no banco de dados geral.
         *      Agora que tenho o objeto especifico em mãos, posso remove-lo do banco de dados especifico.
         * 
         * 3. Remover este item, que está vinculado a uma Categoria, dessa Categoria no "banco de dados das Categorias".
         * 4. Remover este item do banco de dados geral.
        */
        Item itemASerRemovido = null;
        Categoria categoriaDoItem = null;
        
        //Esse enum tem o seguinte objetivo:
        //Caso o usário insira o titulo de item inexistente, nada vai ser obtido no banco de dados e ele estará informando que o item é null
        boolean eNull = true;
        if(RepositorioItem.itens.size() <= 0){
            return "Não há itens a serem removidos.";
        } else {
            if(tipo.equalsIgnoreCase("Livro") || tipo.equalsIgnoreCase("Revista") || tipo.equalsIgnoreCase("Album")){
                if(tipo.equalsIgnoreCase("Livro")){
                    for(Item item : RepositorioItem.itens){
                        if(item instanceof Livro){
                            if(item.getTitulo().equalsIgnoreCase(titulo)){
                                itemASerRemovido = item;

                                //caso o item seja obtido, mude o valor de eNull para false, pois ele não é null.
                                eNull = false;
                            }
                        }
                    }
                } else if(tipo.equalsIgnoreCase("Revista")){
                    for(Item item : RepositorioItem.itens){
                        if(item instanceof Revista){
                            if(item.getTitulo().equalsIgnoreCase(titulo)){
                                itemASerRemovido = item;

                                eNull = false;
                            }
                        }
                    }
                } else {
                    for(Item item : RepositorioItem.itens){
                        if(item instanceof Album){
                            if(item.getTitulo().equalsIgnoreCase(titulo)){
                                itemASerRemovido = item;

                                eNull = false;
                            }
                        }
                    }
                }
            } else {
                return "Não existe este tipo de item.";
            }
        }

        if(itemASerRemovido instanceof Livro){
            Livro livro = null;

            for(Livro l : RepositorioLivro.livros){
                if(l.getTitulo().equalsIgnoreCase(itemASerRemovido.getTitulo())){
                    livro = l;
                }
            }

            RepositorioLivro.livros.remove(livro);
        }
        if(itemASerRemovido instanceof Revista){
            Revista revista = null;

            for(Revista r : RepositorioRevista.revistas){
                if(r.getTitulo().equalsIgnoreCase(itemASerRemovido.getTitulo())){
                    revista = r;
                }
            }

            RepositorioRevista.revistas.remove(revista);
        }
        if(itemASerRemovido instanceof Album){
            Album album = null;

            for(Album a : RepositorioAlbum.albuns){
                if(a.getTitulo().equalsIgnoreCase(itemASerRemovido.getTitulo())){
                    album = a;
                }
            }

            RepositorioAlbum.albuns.remove(album);
        }

        //Se eNull continua true, encerre o programa dizendo que não existe ou o usuário escreveu errado
        //Caso você realmente tenha obtido um item do banco de dados (eNull = false), prossiga com o código
        if(eNull == true){
            return "Titulo de item incorreto ou item inexistente.";
        } else {
            categoriaDoItem = itemASerRemovido.getCategoria();

            categoriaDoItem.removerItens(itemASerRemovido);
            RepositorioItem.itens.remove(itemASerRemovido);

            return "Item removido com sucesso.";
        }
    }
}

