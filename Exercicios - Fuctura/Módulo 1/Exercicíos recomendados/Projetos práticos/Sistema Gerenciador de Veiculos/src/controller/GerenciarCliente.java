package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class GerenciarCliente {

    static List<Cliente> clientes = new ArrayList<>();

    public String cadastrarClientes(String nome, String cpf, String telefone){
        Cliente cliente = clientes.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(cliente == null){
            clientes.add(new Cliente(nome, cpf, telefone));

            return "\nCliente cadastrado com sucesso.";
        } else {
            return "\nJá existe um cliente com esse mesmo CPF.";
        }
    }

    public String consultarCliente(String cpf){
        StringBuilder sb = new StringBuilder();

        if(clientes.size() <= 0){
            sb.append("\nNão há clientes a serem consultados.");
        } else {
            Cliente cliente = clientes.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

            if(cliente == null){
                sb.append("\nNão há cliente com esse CPF.");
            } else {
                sb.append("\n[CLIENTE]\n");
                sb.append("Nome: " + cliente.getNome() + "\n");
                sb.append("CPF: " + cliente.getCPF() + "\n");
                sb.append("Telefone: " + cliente.getTelefone());
            }
        }

        return sb.toString();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public String excluirCliente(String cpf){
        Cliente cliente = clientes.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(cliente == null){
            return "\nNão há cliente com esse CPF.";
        } else {
            clientes.remove(cliente);
            
            return "\nCliente excluido com sucesso.";
        }
    }

    public String alterarDados(String cpf, String nome, String novoCpf, String telefone){
        Cliente cliente = clientes.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(cliente == null){
            return "\nNão há cliente com esse CPF.";
        } else {
            cliente.setCPF(novoCpf);
            cliente.setNome(nome);
            cliente.setTelefone(telefone);
            
            return "\nDados do cliente alterado com sucesso.";
        }
    }

}
