public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "O funcionário " + getNome() + " tem " + getIdade() + " anos e recebe R$"
                + String.format("%.2f", getSalario()) + " reais.";
    }

}