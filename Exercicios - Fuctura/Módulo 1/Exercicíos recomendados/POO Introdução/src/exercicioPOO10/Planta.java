package exercicioPOO10;

public class Planta extends SerVivo{

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String fotossinteze(){
        return "A planta fez fotossíntese.";
    }

}
