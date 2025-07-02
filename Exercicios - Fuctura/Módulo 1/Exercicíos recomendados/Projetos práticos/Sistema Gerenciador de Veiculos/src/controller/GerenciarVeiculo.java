package controller;

import java.util.ArrayList;
import java.util.List;

import model.Veiculo;

public class GerenciarVeiculo {

    List<Veiculo> veiculos = new ArrayList<>();

    public String consultarVeiculo(String placa){

        if(veiculos.size() <= 0){
            return "Não há veículos para serem verificados.";
        } else {
            StringBuilder sb = new StringBuilder();

            for(Veiculo veiculo : veiculos){
                if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                    sb.append("Informações do carro:\n");
                    sb.append("Marca: " + veiculo.getMarca() + "\n");
                    sb.append("Modelo: " + veiculo.getModelo() + "\n");
                    sb.append("Ano: " + veiculo.getAno() + "\n");
                    sb.append("Placa: " + veiculo.getPlaca() + "\n");
                    sb.append("Preço: " + veiculo.getPreco() + "\n");
                }
            }
        
            return sb.toString();
        }
        
    }

}
