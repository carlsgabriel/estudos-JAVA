public class ContaPoupanca extends ContaBancaria {

    private int juros;

    public ContaPoupanca(String titular, double saldo, int juros) {
        super(titular, saldo);
        this.juros = juros;
    }

    public int getJuros() {
        return juros;
    }

    public void setJuros(int valor) {
        juros = valor;
    }

    public double calcularJuros() {
        return getSaldo() * ((double) juros / 100);
    }

}