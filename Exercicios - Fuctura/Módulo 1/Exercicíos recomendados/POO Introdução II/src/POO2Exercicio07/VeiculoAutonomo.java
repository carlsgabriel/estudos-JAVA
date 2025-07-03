package POO2Exercicio07;

public class VeiculoAutonomo {

    private String modelo;
    private int velocidadeAtual;
    private String destino;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String definirDestino(String destino) {
        this.destino = destino;
        return "Destino definido: " + destino + ".";
    }

    public String iniciaViagem() {
        StringBuilder sb = new StringBuilder();

        velocidadeAtual = 20;

        sb.append("O veiculo começou a pegar velocidade... \n");
        for (int i = 0; i < 7; i++) {
            velocidadeAtual = (20 * i);
            sb.append(velocidadeAtual + " km/h \n");
        }
        sb.append("E está indo rumo a " + destino + ". \n");

        return sb.toString();
    }

    public String pararVeiculo() {
        int count = velocidadeAtual / 20;

        StringBuilder sb = new StringBuilder();
        sb.append("O carro começou a desacelerar... \n");
        for (int i = 0; i < count; i++) {
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
                sb.append(velocidadeAtual + "hm/h \n");
            }
            velocidadeAtual -= 20;
            sb.append(velocidadeAtual + " hm/h \n");
        }
        sb.append("O veiculo parou totalmente. \n");
        return sb.toString();
    }

}

