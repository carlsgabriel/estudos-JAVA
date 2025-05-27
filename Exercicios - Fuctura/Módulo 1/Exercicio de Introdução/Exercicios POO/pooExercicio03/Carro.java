public class Carro extends Veiculo {

    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    public String cavaloDePau() {
        return "Você vinha a uma velocidade mais alta, puxou o freio de mão e virou o volante para um dos lados... você deu um cavalo de pau.";
    }

}