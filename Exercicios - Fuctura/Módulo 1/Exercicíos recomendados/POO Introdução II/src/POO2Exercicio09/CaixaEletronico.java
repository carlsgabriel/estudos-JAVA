package POO2Exercicio09;

public class CaixaEletronico {

    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String sacarDinheiro(double valor){
        if(valor > conta.getSaldo() || valor < 0){
            return "O valor que você pretende sacar é maior do que você tem em conta ou é inválido.";
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            return "Foi sacado da sua conta o valor de: R$" + String.format("%.2f", valor) + " reais.";
        }
    }

    public String depositarDinheiro(double valor){
        if(valor < 0){
            return "Valor de depósito inválido.";
        } else {
            conta.setSaldo(conta.getSaldo() + valor);
            return "Foi depositado na sua conta o valor de: R$" + String.format("%.2f", valor) + " reais.";
        }
    }

    public double verificarSaldo(){
        return conta.getSaldo();
    }

    public String pagarConta(double valor){
        if(valor > conta.getSaldo() || valor < 0){
            return "O valor que você tem que pagar é maior do que você tem em conta ou é inválido.";
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            return "Você pagou com sucesso a conta no valor de R$" + String.format("%.2f", valor) + " reais.";
        }
    }

}
