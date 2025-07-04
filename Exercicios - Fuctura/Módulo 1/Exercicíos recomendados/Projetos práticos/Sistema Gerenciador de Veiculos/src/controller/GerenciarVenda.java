package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Veiculo;
import model.Venda;
import model.Vendedor;

public class GerenciarVenda {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    GerenciarVendedor gerenciarVendedor = new GerenciarVendedor();
    GerenciarCliente gerenciarCliente = new GerenciarCliente();

    List<Venda> vendas = new ArrayList<>();

    public String cadastrarVenda(String placa, String nomeVendedor, String nomeCliente, String data){
        
        Veiculo veiculo = null;
        for(Veiculo vei : gerenciarVeiculo.getVeiculos()){
            if(vei.getPlaca().equalsIgnoreCase(placa)){
                int pos = gerenciarVeiculo.getVeiculos().indexOf(vei);

                veiculo = gerenciarVeiculo.getVeiculos().get(pos);
            }
        }

        Vendedor vendedor = null;
        for(Vendedor ven : gerenciarVendedor.getVendedores()){
            if(ven.getNome().equalsIgnoreCase(nomeVendedor)){
                int pos = gerenciarVendedor.getVendedores().indexOf(ven);

                vendedor = gerenciarVendedor.getVendedores().get(pos);
            }
        }

        Cliente cliente = null;
        for(Cliente cli : gerenciarCliente.getClientes()){
            if(cli.getNome().equalsIgnoreCase(nomeCliente)){
                int pos = gerenciarCliente.getClientes().indexOf(cli);

                cliente = gerenciarCliente.getClientes().get(pos);
            }
        }

        vendas.add(new Venda(veiculo, vendedor, cliente, LocalDate.parse(data, dtf)));

        String cadastro = "";
        for(Venda venda : vendas){
            if(venda.getVeiculoVendido().getPlaca().equalsIgnoreCase(veiculo.getPlaca())){
                cadastro = "Venda cadastrada com sucesso.";
            } else {
                cadastro = "Venda não cadastrada.";
            }
        }

        return cadastro;
    }
 
}
