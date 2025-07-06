package controller;

import java.util.ArrayList;
import java.util.List;

import model.Loja;
import model.Veiculo;
import model.Vendedor;

public class GerenciarLoja {

    static List<Loja> lojas = new ArrayList<>();

    public String listarLojas(){
        if(lojas.size() <= 0){
            return "Não há lojas a serem listadas.";
        } else {
            StringBuilder sb = new StringBuilder();

            sb.append("[LOJAS CADASTRADAS] \n");
            for(Loja loja : lojas){
                sb.append("\nNome: " + loja.getNome() + "\n");
                sb.append("Endereço: " + loja.getEndereco() + "\n");
                sb.append("Telefone: " + loja.getTelefone() + "\n");
            }

            return sb.toString();
        }
    }

    public String listarVeiculos(String nomeLoja){
        StringBuilder sb = new StringBuilder();

        if(lojas.size() <= 0){
            return "Não há lojas a serem verificadas.";
        } else {
            for(Loja loja : lojas){
                if(loja.getNome().equalsIgnoreCase(nomeLoja)){
                    if(loja.getVeiculos().size() <= 0){
                        return "Não há veículos disponíveis.";
                    } else {
                        for(Veiculo veiculo : loja.getVeiculos()){
                            sb.append("Veiculos disponíveis: \n");
                            sb.append("\nMarca: " + veiculo.getMarca() + "\n");
                            sb.append("Modelo: " + veiculo.getModelo() + "\n");
                            sb.append("Ano: " + veiculo.getAno() + "\n");
                            sb.append("Placa: " + veiculo.getPlaca() + "\n");
                            sb.append("Preço: " + veiculo.getPreco() + "\n");
                        }
                    }
                } else {
                    return "Não há lojas com o nome inserido.";
                }
            }
        }
        
        return sb.toString();
    }

    public String listarVendedores(String nomeLoja){
        StringBuilder sb = new StringBuilder();

        if(lojas.size() <= 0){
            return "Não há lojas a serem verificadas.";
        } else {
            for(Loja loja : lojas){
                if(loja.getNome().equalsIgnoreCase(nomeLoja)){
                    if(loja.getVendedores().size() <= 0){
                        return "Não há vendedores associados à essa loja.";
                    } else {
                        for(Vendedor vendedor : loja.getVendedores()){
                            sb.append("Vendedores disponíveis: \n");
                            sb.append("\nNome: " + vendedor.getNome() + "\n");
                            sb.append("CPF: " + vendedor.getCPF() + "\n");
                            sb.append("Telefone: " + vendedor.getTelefone() + "\n");
                        }
                    }
                } else {
                    return "Não há lojas com o nome inserido.";
                }
            }
        }
        
        return sb.toString();
    }

    public String cadastrarLoja(String nome, String endereco, String telefone){
        lojas.add(new Loja(nome, endereco, telefone));

        String cadastro = "";
        for(Loja loja : lojas){
            if(loja.getNome().equalsIgnoreCase(nome)){
                cadastro = "Loja adicionado com sucesso.";
                return cadastro;
            } else {
                cadastro = "A loja não foi adicionada.";
            }
        }

        return cadastro;
    }

    public String excluirLoja(String nomeLoja){
        String excluir = "";

        if(lojas.size() < 0){
            excluir = "Não há lojas a serem verificadas.";
        } else {
            for(Loja loja : lojas){
                if(loja.getNome().equalsIgnoreCase(nomeLoja)){
                    lojas.remove(loja);
                    excluir = "Loja removida com sucesso.";
                    break;
                } else {
                    excluir = "Não há lojas com esse nome.";
                }
            }
        }
        
        return excluir;
    }

    public String alterarDados(String nome, String nomeNovo, String endereco, String telefone){
        String alterar = "";
        for(Loja loja : lojas){
            if(lojas.size() > 0){
                if(loja.getNome().equalsIgnoreCase(nome)){
                    loja.setNome(nomeNovo);
                    loja.setEndereco(endereco);
                    loja.setTelefone(telefone);
                    alterar = "Dados da loja alterados com sucesso.";
                } else {
                    alterar = "Os dados da loja não foram alterados, pois não há loja com essa nome.";
                }
            } else {
                alterar =  "Não há lojas a serem alterados.";
            } 
        }

        return "\n" + alterar;
    }

    public String associarVendedor(String cpf, String nomeLoja){

        Vendedor vendedor = null;
        for(Vendedor ven : GerenciarVendedor.vendedores){
            if(ven.getCPF().equalsIgnoreCase(cpf)){
                vendedor = ven;
                break;
            }
        }

        if(vendedor == null){
            return "Não existe vendedor com esse CPF.";
        }

        Loja loja = null;
        for(Loja l : lojas){
            if(l.getNome().equalsIgnoreCase(nomeLoja)){
                loja = l;
            }
        }

        if(loja == null){
            return "Loja com nome informado não foi encontrada.";
        }

        loja.adicionarVendedores(vendedor);
        return "Vendedor associado à loja com sucesso.";
    }

}
