package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;

public class ControllerVenda {

    /*O que eu pensei aqui foi o seguinte:
         * 1. O usuário pode muito bem cancelar a venda, então todos os dados nela teriam que ser apagados.
         * 2. Com isso não faz sentindo você já adicionar a List vendas, uma venda e fazer as alterações de lá... e caso o usuário cancele, você remover.
         * 3. É muito melhor você ter uma composição com venda e fazer tudo nela, e apenas se o usuário concluir a compra, adiciona-la a list vendas.
    */

    List<Venda> vendas = new ArrayList<>();
    Venda venda = new Venda();

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
            for(Venda v : vendas){
                sb.append("\nCliente: " + v.getCliente().getNome() + "\n");
                sb.append("Vendedor: " + v.getVendedor().getNome() + "\n");
                sb.append("Data: " + v.getData().format(dtf) + "\n");
                sb.append("Total: R$" + v.getTotal() + "\n");
            }   
        }

        return sb.toString();
    }

    public String adicionarProduto(String nome){
        Produto produto = ControllerProduto.produtos.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
        if(produto == null){
            return "Não há produtos com esse nome.";
        } else {
            venda.getProdutos().add(produto);

            if(venda.getTotal() == null){
                venda.setTotal(produto.getPreco());
            } else {
                venda.setTotal(venda.getTotal() + produto.getPreco());
            }
    
            return "Produto adicionado à venda com sucesso.";
        }
    }

    public String removerProduto(String nome){
        Produto produto = ControllerProduto.produtos.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
        if(produto == null){
            return "Não há produtos com esse nome.";
        } else {
            venda.getProdutos().remove(produto);
            
            if(venda.getTotal() == null){
                venda.setTotal(produto.getPreco());
            } else {
                venda.setTotal(venda.getTotal() + produto.getPreco());
            }

            return "Produto removido com sucesso.";
        }
    }

    public String calcularTotal(){
        double sum = 0;

        for(Produto produto : venda.getProdutos()){
            sum += produto.getPreco();
        }

        if(sum != venda.getTotal()){
            venda.setTotal(sum);
        }

        return "O valor total dos itens na compra é: R$" + String.format("%.2f", sum);
    }

    public String associarCliente(String cpf){
        Cliente cliente = ControllerCliente.clientes.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(cliente == null){
            return "Não existe cliente com esse CPF.";
        } else {
            if(venda.getCliente() == null){
                venda.setCliente(cliente);

                return "Cliente adicionado com sucesso.";
            } else {
                return "Já existe um cliente associado a esta venda.";
            }
        }
    }

    public String associarVendedor(String cpf){
       Vendedor vendedor = ControllerVendedor.vendedores.stream().filter(x -> x.getCpf().equalsIgnoreCase(cpf)).findFirst().orElse(null);
        if(vendedor == null){
            return "Não existe vendedor com esse CPF.";
        } else {
            if(venda.getVendedor() == null){
                venda.setVendedor(vendedor);

                return "Vendedor adicionado com sucesso.";
            } else {
                return "Já existe um vendedor associado a esta venda.";
            }
        }
    }

    public String concluirVenda(){
        if(venda.getProdutos().size() <= 0){
            return "Na venda deve haver pelo menos 1 produto.";
        }

        if(venda.getCliente() == null){
            return "Deve haver um cliente associado a essa venda.";
        }

        if(venda.getVendedor() == null){
            return "Deve haver um vendedor associado a essa venda.";
        }

        double sum = 0;
        for(Produto p : venda.getProdutos()){
            sum += p.getPreco();
        }
        if(sum != venda.getTotal()){
            return "Por favor, recalcule o valor total da venda.";
        }

        venda.setData(LocalDate.now());

        vendas.add(venda);

        //Forma que encontrei para após ter a venda adicionada a List, conseguir limpa-la, para futuras vendas.
        venda = new Venda();

        return "\nVenda cadastrada com sucesso.";
    }

    public String cancelarVenda(){
        if(venda.getCliente() == null && venda.getData() == null && venda.getTotal() == null && venda.getVendedor() == null && venda.getProdutos().size() == 0){
            return "Venda cancelada com sucesso...";
        } else {
            //Forma que encontrei para após ter a venda adicionada a List, conseguir limpa-la, para futuras vendas.
            venda = new Venda();

            return "Venda cancelada com sucesso...";
        }
    }

}
