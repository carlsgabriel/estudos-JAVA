package modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    
    private List<Item> itens = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItens(Item item){
        itens.add(item);
    }

    public void removerItens(Item item){
        itens.remove(item);
    }
    
}
