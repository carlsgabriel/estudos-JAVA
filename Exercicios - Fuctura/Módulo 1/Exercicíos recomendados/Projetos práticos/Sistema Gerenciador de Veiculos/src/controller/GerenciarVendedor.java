package controller;

import java.util.ArrayList;
import java.util.List;

import model.Vendedor;

public class GerenciarVendedor {

    static List<Vendedor> vendedores = new ArrayList<>();

    public String consultarVendedor(String nomeVendedor){
        StringBuilder sb = new StringBuilder();

        if(vendedores.size() <= 0){
            sb.append("\nNão há vendedor a ser consultado.");
        } else {
            Vendedor vendedor = vendedores.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeVendedor)).findFirst().orElse(null);

            if(vendedor == null){
                sb.append("\nNão há vendedor com esse nome");
            } else {
                sb.append("\n[VENDEDOR]\n");
                sb.append("Nome: " + vendedor.getNome() + "\n");
                sb.append("CPF: " + vendedor.getCPF() + "\n");
                sb.append("Telefone: " + vendedor.getTelefone());
            }
        }

        return sb.toString();
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public String cadastrarVendedor(String nome, String cpf, String telefone){
        Vendedor vendedor = vendedores.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(vendedor == null){
            vendedores.add(new Vendedor(nome, cpf, telefone));

            return "Vendedor cadastrado com sucesso.";
        }else {
            return "Já existe um vendedor com esse mesmo CPF cadastrado.";
        }
    }

    public String excluirVendedor(String cpf){
        Vendedor vendedor = vendedores.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(vendedor == null){
            return "Não há vendedor com esse CPF.";
        } else {
            vendedores.remove(vendedor);

            return "Vendedor removido com sucesso.";
        }
    }

    public String alterarDados(String cpf, String nome, String cpfNovo, String telefone){
        Vendedor vendedor = vendedores.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);

        if(vendedor == null){
            return "\nNão existe um vendedor com esse CPF.";
        } else {
            vendedor.setNome(nome);
            vendedor.setCPF(cpfNovo);
            vendedor.setTelefone(telefone);

            return "\nDados do vendedor alterados com sucesso.";
        }
    } 

}
