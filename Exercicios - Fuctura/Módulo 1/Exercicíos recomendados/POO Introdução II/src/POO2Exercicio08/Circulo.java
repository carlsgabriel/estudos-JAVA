package POO2Exercicio08;

public class Circulo extends FiguraGeometrica {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * 3.14) * raio;
    }

    @Override
    public String desenharFigura() {
        return "Um círculo foi desenhado.";
    }

}

