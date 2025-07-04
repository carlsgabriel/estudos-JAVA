package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class GerenciarCliente {

    List<Cliente> clientes = new ArrayList<>();

    public String cadastrarClientes(String nome, String cpf, String telefone){
        clientes.add(new Cliente(nome, cpf, telefone));

        String cadastro = "";
        for(Cliente cliente : clientes){
            if(cliente.getNome().equalsIgnoreCase(nome)){
                cadastro =  "Cliente adicionado com sucesso.";
            } else {
                cadastro = "Cliente não adicionado.";
            }
        }

        return cadastro;
    }

    public String consultarCliente(String cpf){
        if(clientes.size() <= 0){
            return "Não há cliente a ser consultado.";
        } else {
            StringBuilder sb = new StringBuilder();

            for(Cliente cliente : clientes){
                sb.append("\nCliente:");
                if(cliente.getCPF().equals(cpf)){
                    sb.append("\nNome: " + cliente.getNome() + "\n");
                    sb.append("CPF: " + cliente.getCPF() + "\n");
                    sb.append("Telefone: " + cliente.getTelefone());
                }
            }

            return sb.toString();
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}
