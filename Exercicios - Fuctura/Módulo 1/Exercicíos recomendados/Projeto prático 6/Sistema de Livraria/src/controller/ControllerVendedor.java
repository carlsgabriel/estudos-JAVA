package controller;

import java.util.ArrayList;
import java.util.List;

import model.Vendedor;

public class ControllerVendedor {

    List<Vendedor> vendedores = new ArrayList<>();

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public String cadastrarVendedor(String nome, String cpf){
        Vendedor vendedor = vendedores.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(vendedor == null){
            vendedores.add(new Vendedor(nome, cpf));

            return "Vendedor cadastrado com sucesso.";
        } else {
            return "Já existe um vendedor com esse CPF cadastrado.";
        }
    }

    public String consultarVendedor(String cpf){
        StringBuilder sb = new StringBuilder();

        if(vendedores.size() <= 0){
            sb.append("Não há vendedores a serem listados.");
        } else {
            Vendedor vendedor = vendedores.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
            if(vendedor == null){
                sb.append("Não há vendedor com esse CPF.");
            } else {
                sb.append("[Dados do vendedor]\n");
                sb.append(vendedor.getNome() + "\n");
                sb.append(vendedor.getCpf());
            }
        }
    
        return sb.toString();
    }

}
