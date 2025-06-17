package exercicioPOO03;

public class Retangulo {

    public Double largura;
    public Double altura;

    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return 2 * (largura + altura);
    }

}
