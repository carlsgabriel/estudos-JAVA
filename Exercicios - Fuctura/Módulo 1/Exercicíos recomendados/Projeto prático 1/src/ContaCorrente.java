public class ContaCorrente extends Conta implements Tarifavel {

    private ContaPoupanca contaPoupanca;

    public ContaCorrente(int numeroDaConta, String titular, double valorInicial) {
        super(numeroDaConta, titular, valorInicial);
    }

    @Override
    public void aplicarTarifaMensal() {
        alterarSaldo(getSaldo() + TaxaBancaria.TARIFA_MENSAL.getValor());
    }

    @Override
    public void cobrarTaxa() {
        alterarSaldo(getSaldo() - TaxaBancaria.TAXA_SAQUE.getValor());
    }

    public String sacar(double valor) {
        if (valor < 0) {
            return "Valor inválido.";
        } else if (getSaldo() < valor) {
            return "Saldo insuficiente.";
        } else {
            alterarSaldo(getSaldo() - valor);
            cobrarTaxa();

            return "Saque realizado com sucesso.";
        }
    }

    public String aplicar(double valor, ContaPoupanca contaPoupanca) {
        if (valor < 0) {
            return "Valor inválido.";

        } else if (getSaldo() < valor) {
            return "Saldo insuficiente.";
        } else {
            if (contaPoupanca != null) {
                contaPoupanca.receberValor(valor);
                alterarSaldo(getSaldo() - valor);

                return "Aplicação realizada com sucesso.";
            } else {
                return "Conta poupança inexistente.";
            }
        }
    }

    public String resgatar(double valor, ContaPoupanca contaPoupanca) {
        if (valor < 0) {
            return "Valor inválido.";
        } else {
            if (contaPoupanca != null) {
                if (contaPoupanca.getSaldo() >= valor) {
                    // this faz referência ao próprio objeto
                    contaPoupanca.enviarValor(valor, this);

                    return "Resgate realizado com sucesso.";
                } else {
                    return "Saldo insuficiente.";
                }
            } else {
                return "Conta poupança inexistente.";
            }
        }
    }
}
