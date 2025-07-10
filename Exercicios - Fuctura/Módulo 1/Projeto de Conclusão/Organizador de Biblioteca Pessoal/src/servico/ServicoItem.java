package servico;

import modelo.Item;
import modelo.Livro;
import modelo.Revista;
import repositorio.RepositorioItem;

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
                sb.append("Categoria: " + item.getCategoria().getNome());
            }
        }

        return sb.toString();
    }

}
