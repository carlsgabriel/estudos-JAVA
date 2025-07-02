package model;

import java.time.LocalDate;

public class Venda {

    private Veiculo veiculoVendido;
    private Vendedor vendedorResponsavel;
    private Cliente clienteComprador;
    private LocalDate dataDaVenda;
    
    public Venda(Veiculo veiculoVendido, Vendedor vendedorResponsavel, Cliente clienteComprador,
            LocalDate dataDaVenda) {
        this.veiculoVendido = veiculoVendido;
        this.vendedorResponsavel = vendedorResponsavel;
        this.clienteComprador = clienteComprador;
        this.dataDaVenda = dataDaVenda;
    }

    public Veiculo getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Veiculo veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(Cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

}
