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

    List<Venda> vendas = new ArrayList<>();

    public String cadastrarVenda(String placa, String nomeVendedor, String nomeCliente, String data){

        Venda venda = vendas.stream().filter(x -> x.getVeiculoVendido().getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

        if(venda == null){
            Veiculo veiculo = GerenciarVeiculo.veiculos.stream().filter(x -> x.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);
            if(veiculo == null){
                return "\nNão há veiculo com essa placa.";
            }

            Vendedor vendedor = GerenciarVendedor.vendedores.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeVendedor)).findFirst().orElse(null);
            if(vendedor == null){
                return "\nNão há vendedor com esse nome.";
            }

            Cliente cliente = GerenciarCliente.clientes.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeCliente)).findFirst().orElse(null);
            if(cliente == null){
                return "\nNão há cliente com esse nome.";
            }

            vendas.add(new Venda(veiculo, vendedor, cliente, LocalDate.parse(data, dtf)));
        
            return "\nVenda cadastrada com sucesso.";
        } else {
            return "\nJá existe uma venda com o a mesma placa do carro desta venda. Venda não cadastrada.";
        }

    }

    public String excluirVenda(String placa){
        Venda venda = vendas.stream().filter(x -> x.getVeiculoVendido().getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

        if(venda == null){
            return "\nNão há venda com essa placa de carro vendido.";
        } else {
            vendas.remove(venda);

            return "\nVenda excluída com sucesso.";
        }
    }

    public String alterarDados(String placa, String placaNova, String nomeVendedor, String nomeCliente, String data){
        Venda venda = vendas.stream().filter(x -> x.getVeiculoVendido().getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

        if(venda == null){
            return "\nNão há vendas com essa placa de veículo.";
        } else {
            Veiculo veiculo = GerenciarVeiculo.veiculos.stream().filter(x -> x.getPlaca().equalsIgnoreCase(placaNova)).findFirst().orElse(null);
            if(veiculo == null){
                return "\nNão há veiculo com essa placa.";
            }

            Vendedor vendedor = GerenciarVendedor.vendedores.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeVendedor)).findFirst().orElse(null);
            if(vendedor == null){
                return "\nNão há vendedor com esse nome.";
            }

            Cliente cliente = GerenciarCliente.clientes.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeCliente)).findFirst().orElse(null);
            if(cliente == null){
                return "\nNão há cliente com esse nome.";
            }

            venda.setVeiculoVendido(veiculo);
            venda.setVendedorResponsavel(vendedor);
            venda.setClienteComprador(cliente);
            venda.setDataDaVenda(LocalDate.parse(data, dtf));
            
            return "\nDados da venda alterado com sucesso.";
        }
    }
}
