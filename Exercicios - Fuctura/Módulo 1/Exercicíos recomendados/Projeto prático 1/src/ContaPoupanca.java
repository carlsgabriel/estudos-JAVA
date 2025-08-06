public class ContaPoupanca extends Conta {

    private ContaCorrente contaCorrente;

    public ContaPoupanca(Integer numeroDaConta, String titular, Double valorInicial) {
        super(numeroDaConta, titular, valorInicial);
    }

    public void receberValor(double valor) {
        if (valor >= 0) {
            alterarSaldo(getSaldo() + valor);
        }
    }

    // falta resolver
    public void enviarValor(double valor, ContaCorrente contaCorrente) {
        if (getSaldo() >= valor) {
            contaCorrente.depositar(valor);

            alterarSaldo(getSaldo() - valor);
        }
    }

}
