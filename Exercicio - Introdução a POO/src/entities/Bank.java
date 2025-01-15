package entities;

public class Bank {
	private final int NUMERO_DA_CONTA;
	private String nomeDoTitular;
	private double saldo;

	public Bank(int numeroDaConta, String nomeDoTitular){
		this.NUMERO_DA_CONTA = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}

	public Bank(int numeroDaConta, String nomeDoTitular, double depositoInicial){
		this.NUMERO_DA_CONTA = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		deposito(depositoInicial);
	}

	public int getNumeroDaConta(){
		return NUMERO_DA_CONTA;
	}

	public String getNomeDoTitular(){
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nome){
		nomeDoTitular = nome;
	}

	public void deposito(double valor){
		saldo += valor;
	}
	
	public void saque(double valor){
		saldo = saldo - valor - 5.00;
	}

	public double saldoDaConta(){
		return saldo;
	}

	public String toString(){
		return "Account " + getNumeroDaConta() + ", Holder: " + getNomeDoTitular() + ", Balance: $ " + String.format("%.2f", saldoDaConta());
	}
}
