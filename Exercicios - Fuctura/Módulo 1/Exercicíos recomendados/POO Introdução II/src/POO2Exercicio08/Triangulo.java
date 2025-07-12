package POO2Exercicio08;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public String desenharFigura() {
        return "Um triângulo foi desenhado.";
    }

}

