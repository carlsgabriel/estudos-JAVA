public class Moto extends Veiculo {

    public Moto(String marca, int ano) {
        super(marca, ano);
    }

    public String empinar() {
        return "Você puxou a embreagem e acelerou. Depois de ter feito isso, soltou a embreagem de uma vez e puxou o guidão para cima... você empinou a moto!";
    }

}