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
        if(verificadorDeCpf(cpf) == true){
            Cliente cliente = clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

            if(cliente == null){
                clientes.add(new Cliente(nome, cpf, endereco));

                return "Cliente cadastrado com sucesso.";
            } else {
                return "Já existe um cliente com esse CPF cadastrado.";
            }
        } else {
            return "O CPF precisa ser composto apenas por números e ter 11 digitos.";
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
            if(verificadorDeCpf(novoCpf) == true){
                cliente.setNome(nome);
                cliente.setCpf(novoCpf);
                cliente.setEndereco(endereco);

                return "Dados do cliente alterados com sucesso.";
            } else {
                return "O CPF precisa ser composto apenas por números e ter 11 digitos.";
            }
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

    /*A lógica que pensei aqui foi o seguinte:
        1. Vou logo verificar se o CPF tem 11 digitos... se tiver:
        2. Como é String uma String de 11 caracteres, terei que separa-la, uma por uma e adicionar num vetor para poder verificar individualmente.
        Estando cada caractere em um vetor, percorrer cada item do vetor e verificar o seguinte:
        Esse caractere de String é igual a um dos caracteres de 0-9?
        Se for, terá uma variável contadora (count) que terá seu valor iterado a cada confirmação dessa.
        No final, se o valor de count for 11, todos os caracteres são de 0-9 e será retornado true, caso contrário, false.
        3. Se não tiver 11 caracteres, false.
    */
    private boolean verificadorDeCpf(String cpf){
        if(cpf.length() != 11){
            return false;
        } else {
            String[] caracteres = cpf.split("");
            
            int count = 0;

            for(int i=0;i<caracteres.length;i++){
                if(caracteres[i].equalsIgnoreCase("1") || caracteres[i].equalsIgnoreCase("2") || caracteres[i].equalsIgnoreCase("3")
                 || caracteres[i].equalsIgnoreCase("4") || caracteres[i].equalsIgnoreCase("5") || caracteres[i].equalsIgnoreCase("6")
                  || caracteres[i].equalsIgnoreCase("7") || caracteres[i].equalsIgnoreCase("8") || caracteres[i].equalsIgnoreCase("9")
                   || caracteres[i].equalsIgnoreCase("0")){
                    count++;
                  }
            }

            if(count != 11){
                return false;
            } else {
                return true;
            }
        }
    }

}
