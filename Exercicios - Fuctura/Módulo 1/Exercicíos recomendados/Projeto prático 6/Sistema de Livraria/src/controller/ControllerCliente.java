package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ControllerCliente {

    static List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public String cadastrarCliente(String nome, String cpf, String endereco){
        if(cpf.length() != 11){
            return "O CPF precisa ter 11 digitos.";
        } else {
            Cliente cliente = clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

            if(cliente == null){
                clientes.add(new Cliente(nome, cpf, endereco));

                return "Cliente cadastrado com sucesso.";
            } else {
                return "Já existe um cliente com esse CPF cadastrado.";
            }
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

    public String alterarDados(String cpf, String nome, String novoCpf, String endereco){
        Cliente cliente = clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(cliente == null){
            return "Não há clientes com esse CPF.";
        } else {
            cliente.setNome(nome);
            cliente.setCpf(novoCpf);
            cliente.setEndereco(endereco);

            return "Dados do cliente alterados com sucesso.";
        }
    }

    public String removerCliente(String cpf){
        Cliente cliente = clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(cliente == null){
            return "Não existe um cliente com esse CPF.";
        } else {
            clientes.remove(cliente);

            return "Cliente removido com sucesso.";
        }
    }

}
