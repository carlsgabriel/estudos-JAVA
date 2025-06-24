package exercicioPOO09;

public class Ave extends Animal{

    private String tipoDeBico;

    public String getTipoDeBico() {
        return tipoDeBico;
    }

    public void setTipoDeBico(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }

    public String voar(){
        return "O animal voou.";
    } 

    @Override
    public String informacoes(){
        return super.informacoes() + " - Tipo de bico: " + tipoDeBico;
    }

}