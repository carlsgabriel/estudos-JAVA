package model;

public class Vendedor {

    private String nome;
    private String CPF;
    private String telefone;
    
    public Vendedor(String nome, String cPF, String telefone) {
        this.nome = nome;
        CPF = cPF;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
