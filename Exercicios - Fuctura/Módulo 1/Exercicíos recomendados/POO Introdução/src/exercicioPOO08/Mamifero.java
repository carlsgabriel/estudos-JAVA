package exercicioPOO08;

public class Mamifero extends Animal{

    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String amamentar(){
        return "O animal foi amamentado.";
    } 

    @Override
    public String informacoes(){
        return super.informacoes() + " - Gênero: " + genero;
    }

}