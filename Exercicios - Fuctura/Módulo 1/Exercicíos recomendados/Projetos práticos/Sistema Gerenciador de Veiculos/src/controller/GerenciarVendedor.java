package controller;

import java.util.ArrayList;
import java.util.List;

import model.Vendedor;

public class GerenciarVendedor {

    List<Vendedor> vendedores = new ArrayList<>();

    public String consultarVendedor(String nomeVendedor){
        if(vendedores.size() <= 0){
            return "Não há vendedor a serem consultado.";
        } else {
            StringBuilder sb = new StringBuilder();

            for(Vendedor vendedor : vendedores){
                sb.append("Vendedor:\n");
                if(vendedor.getNome().equals(nomeVendedor)){
                    sb.append("\nNome:" + vendedor.getNome() + "\n");
                    sb.append("CPF:" + vendedor.getCPF() + "\n");
                    sb.append("Telefone:" + vendedor.getTelefone() + "\n");
                }
            }

            return sb.toString();
        }
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

}