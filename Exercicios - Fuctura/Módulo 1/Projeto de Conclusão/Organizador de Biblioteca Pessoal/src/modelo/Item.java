package modelo;

public abstract class Item {
    private String titulo;
    private String autorOuArtista;
    private Categoria categoria;

    public Item(String titulo, String autorOuArtista, Categoria categoria){
        this.titulo = titulo;
        this.autorOuArtista = autorOuArtista;
        this.categoria = categoria;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutorOuArtista(){
        return autorOuArtista;
    }

    public void setAutorOuArtista(String autorOuArtista){
        this.autorOuArtista = autorOuArtista;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
