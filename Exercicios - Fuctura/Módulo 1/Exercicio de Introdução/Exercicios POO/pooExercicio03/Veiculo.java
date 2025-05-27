public class Veiculo {

    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String acelerar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 17; i++) {
            int velocidade = 20 * i;
            sb.append("Acelerando... velocidade atual: " + velocidade + " km/h" + "\n");
        }
        return sb.toString();
    }

}