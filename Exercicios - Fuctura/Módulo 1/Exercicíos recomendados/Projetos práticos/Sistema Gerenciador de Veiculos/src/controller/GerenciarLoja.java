package controller;

import java.util.ArrayList;
import java.util.List;

import model.Loja;
import model.Veiculo;
import model.Vendedor;

public class GerenciarLoja {

    List<Loja> lojas = new ArrayList<>();

    public String listarLojas(){
        if(lojas.size() <= 0){
            return "Não há lojas a serem listadas.";
        } else {
            StringBuilder sb = new StringBuilder();

            sb.append("Lojas cadastradas: \n");
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

}

