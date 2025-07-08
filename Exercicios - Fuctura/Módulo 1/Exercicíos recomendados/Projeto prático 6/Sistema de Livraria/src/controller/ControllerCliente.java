package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ControllerCliente {

    List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public String cadastrarCliente(String nome, String cpf, String endereco){
        Cliente cliente = clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(cliente == null){
            clientes.add(new Cliente(nome, cpf, endereco));

            return "Cliente cadastrado com sucesso.";
        } else {
            return "Já existe um cliente com esse CPF cadastrado.";
        }
    }

    public String consultarCliente(String cpf){
        StringBuilder sb = new StringBuilder();

        if(clientes.size() <= 0){
            sb.append("Não há clientes a serem consultados.");
        } else {
            Cliente cliente = clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

            if(cliente == null){
                sb.append("Não há cliente com esse CPF.");
            } else {
                sb.append("[Dados do cliente]\n");
                sb.append(cliente.getNome() + "\n");
                sb.append(cliente.getCpf() + "\n");
                sb.append(cliente.getEndereco());
            }
        }

        return sb.toString();
    }
    

}
