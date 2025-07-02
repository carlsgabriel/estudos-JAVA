package POO2Exercicio06;

public class Caneta {

    private String corDaTinta;
    private String tamanhoDaPonta;
    private String marca;
    private int nivelDeTinta;

    public String getCorDaTinta() {
        return corDaTinta;
    }

    public void setCorDaTinta(String corDaTinta) {
        this.corDaTinta = corDaTinta;
    }

    public String getTamanhoDaPonta() {
        return tamanhoDaPonta;
    }

    public void setTamanhoDaPonta(String tamanhoDaPonta) {
        this.tamanhoDaPonta = tamanhoDaPonta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNivelDeTinta() {
        return nivelDeTinta;
    }

    public void setNivelDeTinta(int nivelDeTinta) {
        this.nivelDeTinta = nivelDeTinta;
    }

    public String escrever(String texto) {
        if(nivelDeTinta > 0){
            if(nivelDeTinta >= texto.length()){
                nivelDeTinta -= texto.length();
                return "Foi escrito \"" + texto + "\" de caneta, na cor " + corDaTinta.toLowerCase() + ".";
            } 
        }
        return "Não há tinta suficiente na caneta para escrever o que deseja.";
        
    }

    public String trocarTinta(String cor) {
        String corAntiga = corDaTinta;
        corDaTinta = cor;
        return "A tinta da caneta, que antes era " + corAntiga.toLowerCase() + ", foi modificada e agora é "
                + corDaTinta.toLowerCase() + ".";

    }

    public String verificarNivelTinta() {
        return "A caneta atualmente tem " + nivelDeTinta + "% de tinta.";
    }

}

