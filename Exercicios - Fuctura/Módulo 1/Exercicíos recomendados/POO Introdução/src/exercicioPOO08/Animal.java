package exercicioPOO08;

public class Animal {

    private String nome;
    private Integer idade;
    private String especie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String emitirSom(){
        return "O animal emitiu um som...";
    }

    public String informacoes(){
        return "Informações do animal:" +
        "\nNome: " + nome + " - Idade: " + idade + " - Espécie: " + especie;
    }
    
}
