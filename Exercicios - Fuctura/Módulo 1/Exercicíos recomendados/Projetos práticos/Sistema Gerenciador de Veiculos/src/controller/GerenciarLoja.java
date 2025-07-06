package controller;

import java.util.ArrayList;
import java.util.List;

import model.Loja;
import model.Veiculo;
import model.Vendedor;

public class GerenciarLoja {

    static List<Loja> lojas = new ArrayList<>();

    public String listarLojas(){
        StringBuilder sb = new StringBuilder();

        if(lojas.size() <= 0){
            sb.append("\nNão há lojas a serem listadas.");
        } else {
            for(Loja loja : lojas){
                sb.append("\n[LOJAS CADASTRADAS]\n");
                sb.append("\nNome: " + loja.getNome() + "\n");
                sb.append("Endereço: " + loja.getEndereco() + "\n");
                sb.append("Telefone: " + loja.getTelefone() + "\n");
            }
        }

        return sb.toString();
    }

    public String listarVeiculos(String nomeLoja){
        StringBuilder sb = new StringBuilder();

        if(lojas.size() <= 0){
            sb.append("\nNão há lojas a serem verificadas.");
        } else {
            Loja loja = lojas.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeLoja)).findFirst().orElse(null);

            if(loja == null){
                sb.append("\nNão há loja com esse nome.");
            } else {
                if(loja.getVeiculos().size() <= 0){
                    sb.append("\nNão há veículos disponíveis na loja.");
                } else {
                    for(Veiculo veiculo : loja.getVeiculos()){
                        sb.append("[VEICULOS DISPONÍVEIS]\n");
                        sb.append("\nMarca: " + veiculo.getMarca() + "\n");
                        sb.append("Modelo: " + veiculo.getModelo() + "\n");
                        sb.append("Ano: " + veiculo.getAno() + "\n");
                        sb.append("Placa: " + veiculo.getPlaca() + "\n");
                        sb.append("Preço: " + veiculo.getPreco());
                    }
                }
            }
        }
        
        return sb.toString();
    }

    public String listarVendedores(String nomeLoja){
        StringBuilder sb = new StringBuilder();

        if(lojas.size() <= 0){
            sb.append("\nNão há lojas a serem verificadas.");
        } else {
            Loja loja = lojas.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeLoja)).findFirst().orElse(null);

            if(loja == null){
                sb.append("\nNão há loja com esse nome.");
            } else {
                if(loja.getVendedores().size() <= 0){
                    sb.append("\nNão há vendedores cadastrados na loja.");
                } else {
                    for(Vendedor vendedor : loja.getVendedores()){
                        sb.append("[VENDEDORES CADASTRADOS]\n");
                        sb.append("\nNome: " + vendedor.getNome() + "\n");
                        sb.append("CPF: " + vendedor.getCPF() + "\n");
                        sb.append("Telefone: " + vendedor.getTelefone());
                    }
                }
            }
        }
        
        return sb.toString();
    }

    public String cadastrarLoja(String nome, String endereco, String telefone){
        Loja loja = lojas.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);

        if(loja == null){
            lojas.add(new Loja(nome, endereco, telefone));

            return "\nLoja criada com sucesso.";
        } else {
            return "\nJá existe uma loja com esse mesmo nome.";
        }
 
    }

    public String excluirLoja(String nomeLoja){
        Loja loja = lojas.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeLoja)).findFirst().orElse(null);

        if(loja == null){
            return "\nNão há loja com esse nome.";
        } else {
            lojas.remove(loja);
            
            return "\nLoja excluida com sucesso.";
        }
        
    }

    public String alterarDados(String nome, String nomeNovo, String endereco, String telefone){
        Loja loja = lojas.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);

        if(loja == null){
            return "\nNão há loja com esse nome.";
        } else {
            loja.setNome(nomeNovo);
            loja.setEndereco(endereco);
            loja.setTelefone(telefone);

            return "\nDados de cadastro da loja alterados com sucesso.";
        }
    
    }

    public String associarVendedor(String cpf, String nomeLoja){
        Vendedor vendedor = GerenciarVendedor.vendedores.stream().filter(x -> x.getCPF().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(vendedor == null){
            return "\nNão há vendedor com esse CPF.";
        }

        Loja loja = lojas.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeLoja)).findFirst().orElse(null);
        if(loja == null){
            return "\nNão existe loja com esse nome.";
        } else {
            loja.adicionarVendedores(vendedor);

            return "\nVendedor associado à loja com sucesso.";
        }
    }

}
