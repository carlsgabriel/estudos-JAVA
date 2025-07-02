package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nome;
    private String endereco;
    private String telefone;

    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    
    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removerVeiculos(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void adicionarVendedores(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public void removerVendedores(Vendedor vendedor){
        vendedores.remove(vendedor);
    }

    public List<Veiculo> getVeiculos(){
        return veiculos;
    }

    public List<Vendedor> getVendedores(){
        return vendedores;
    }

}
