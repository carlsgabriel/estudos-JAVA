public abstract class Conta {

    protected Integer numeroDaConta;
    protected String titular;
    protected Double saldoDisponivel;

    public Conta(Integer numeroDaConta, String titular, Double saldoDisponivel) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldoDisponivel = saldoDisponivel;
    }

    public String exibirDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero da conta: " + numeroDaConta + "\n");
        sb.append("Titular: " + titular + "\n");
        sb.append("Saldo disponível: R$" + String.format("%.2f", saldoDisponivel) + "\n");

        return sb.toString();
    }

    public String depositar(double valor) {
        if (valor < 0) {
            return "Valor de depósito inválido.";
        } else {
            alterarSaldo(getSaldo() + valor);
            return "Depósito realizado com sucesso.";
        }
    }

    public void alterarSaldo(double valor) {
        saldoDisponivel = valor;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldoDisponivel;
    }

}
