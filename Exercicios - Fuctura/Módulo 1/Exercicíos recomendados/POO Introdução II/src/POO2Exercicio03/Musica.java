package POO2Exercicio03;

public class Musica {

    private String titulo;
    private String artista;
    private String genero;
    private boolean onOff;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public String reproduzir() {
        if(onOff == true){
            return "A musica já está sendo reproduzida.";
        } else {
            onOff = true;
            return "Reproduzindo a música: " + titulo + ", do artista " + artista + ".";
        }
        
    }

    public String pausar() {
        if(onOff == true){
            onOff = false;
            return "Música pausada: " + titulo + ", do artista " + artista + ".";
        } else {
            return "A música já está pausada ou não foi inicializada.";
        }
       
    }

    public String exibirDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: " + titulo + "\n");
        sb.append("Artista: " + artista + "\n");
        sb.append("Gênero: " + genero);
        return sb.toString();
    }

}
