package controller;

import java.util.ArrayList;
import java.util.List;

import model.Vendedor;

public class ControllerVendedor {

    static List<Vendedor> vendedores = new ArrayList<>();

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public String cadastrarVendedor(String nome, String cpf){
        if(verificadorDeCpf(cpf) == true){
            Vendedor vendedor = vendedores.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);

            if(vendedor == null){
                vendedores.add(new Vendedor(nome, cpf));

                return "Vendedor cadastrado com sucesso.";
            } else {
                return "Já existe um vendedor com esse CPF cadastrado.";
            }
        } else {
            return "O CPF precisa ser composto apenas por números e ter 11 digitos.";
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

    public String alterarDados(String cpf, String nome, String novoCpf){
        Vendedor vendedor = vendedores.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(vendedor == null){
            return "Não há Vendedores com esse CPF.";
        } else {
            if(verificadorDeCpf(novoCpf) == true){
                vendedor.setNome(nome);
                vendedor.setCpf(novoCpf);

                return "Dados do vendedor alterados com sucesso.";
            } else {
                return "O CPF precisa ser composto apenas por números e ter 11 digitos.";
            }
        }
    }

    public String removerVendedor(String cpf){
        Vendedor vendedor = vendedores.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(vendedor == null){
            return "Não existe um vendedor com esse CPF.";
        } else {
            vendedores.remove(vendedor);

            return "Vendedor removido com sucesso.";
        }
    }

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
