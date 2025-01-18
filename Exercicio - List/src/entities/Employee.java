package entities;

public class Employee {

    private Integer id;
    private String nome;
    private Double salario;

    public Employee(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void aumento(double value){
        salario = salario + (salario * value / 100);
    }

    public String toString(){
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

}
