public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double quilometragem;
    private String combustivel;
    private boolean onOff;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public String ligar() {
        if(onOff == false){
            onOff = true;
            return "Motor do carro acionado.\n";
        } else {
            return "O carro já está ligado. \n";
        }
    }

    public String desligar() {
        if(onOff == true){
            onOff = false;
            return "Desligando motor do carro.\n";
        } else {
            return "Motor do carro já está desligado. \n";
        }
        
    }

    public String acelerar() {
        if(onOff == true){
            StringBuilder sb = new StringBuilder();

            sb.append("O carro começa a ganhar velocidade... \n");
            for (int i = 0; i < 16; i++) {
                sb.append(20 * i + " km/h\n");
            }

            return sb.toString();
        } else {
            return "O carro precisa estar ligado para acelerar.\n";
        }
    }

    public String frear() {
        if(onOff == true){
            StringBuilder sb = new StringBuilder();

            sb.append("O carro começa a perder velocidade... \n");
            for (int i = 15; i >= 0; i--) {
                sb.append(20 * i + " km/h\n");
            }

            return sb.toString();
        } else {
            return "O carro precisa estar ligado para efetuar a freagem corretamente.\n";
        }
        
    }

    public String abastecer(double valor) {
        if(onOff == true){
            return "Por favor, desligue o carro para que ele seja abastecido sem riscos.";
        } else {
            if (valor <= 1) {
                return "O carro foi abastecido com " + String.format("%.2f", valor) + " litro de gasolina.";
            } else {
                return "O carro foi abastecido com " + String.format("%.2f", valor) + " litros de gasolina.";
            }
        }
    }

}
