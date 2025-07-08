package controller;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Venda;

public class ControllerVenda {

    List<Venda> vendas = new ArrayList<>();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public List<Venda> getVendas() {
        return vendas;
    }

    public String listarVendas(){
        StringBuilder sb = new StringBuilder();

        if(vendas.size() <= 0){
            sb.append("Não há vendas a serem listadas.");
        } else {
            sb.append("\nVendas realizadas:\n");
            for(Venda venda : vendas){
                sb.append("\nCliente: " + venda.getCliente().getNome() + "\n");
                sb.append("Vendedor: " + venda.getVendedor().getNome() + "\n");
                sb.append("Data: " + venda.getData().format(dtf) + "\n");
                sb.append("Total: R$" + venda.getTotal() + "\n");
            }   
        }

        return sb.toString();
    }

}
