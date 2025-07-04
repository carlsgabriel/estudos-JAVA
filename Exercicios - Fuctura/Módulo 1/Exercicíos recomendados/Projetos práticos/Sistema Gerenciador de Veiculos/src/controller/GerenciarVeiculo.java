package controller;

import java.util.ArrayList;
import java.util.List;

import model.Loja;
import model.Veiculo;

public class GerenciarVeiculo {

    List<Veiculo> veiculos = new ArrayList<>();

    GerenciarLoja gerenciarLoja = new GerenciarLoja();

    public String consultarVeiculo(String placa){

        if(veiculos.size() <= 0){
            return "Não há veículos para serem verificados.";
        } else {
            StringBuilder sb = new StringBuilder();

            for(Veiculo veiculo : veiculos){
                if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                    sb.append("[INFORMAÇÕES DO CARRO]\n");
                    sb.append("Marca: " + veiculo.getMarca() + "\n");
                    sb.append("Modelo: " + veiculo.getModelo() + "\n");
                    sb.append("Ano: " + veiculo.getAno() + "\n");
                    sb.append("Placa: " + veiculo.getPlaca() + "\n");
                    sb.append("Preço: " + veiculo.getPreco());
                }
            }
            
            if(sb.isEmpty()){
                return "Não há veículos com essa placa.";
            } else {
                return sb.toString();
            }
        }
    }

    public String cadastrarVeiculo(String marca, String modelo, int ano, String placa, double preco){
        veiculos.add(new Veiculo(marca, modelo, ano, placa, preco));

        String cadastro = "";
        for(Veiculo veiculo : veiculos){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                cadastro = "Veiculo cadastrado com sucesso.";
            } else {
                cadastro = "O veiculo não foi cadastrado.";
            }
        }
        
        return cadastro;
    }

    public String excluirVeiculo(String placa){

        Veiculo veiculo = null;
        for(Veiculo v : veiculos){
            if(v.getPlaca().equalsIgnoreCase(placa)){
                veiculo = v;
            }
        }

        String excluir = "";
        if(veiculo.getPlaca().equalsIgnoreCase(placa)){
            veiculos.remove(veiculo);

            excluir = "\nVeiculo excluido com sucesso.";
        } else {
            excluir = "\nVeiculo não foi excluido.";
        }

        return excluir;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String listarVeiculos(){
        StringBuilder sb = new StringBuilder();

        sb.append("[CARROS DISPONÍVEIS]\n");
        for(Veiculo veiculo : veiculos){
            sb.append("\nMARCA: " + veiculo.getMarca() + "\n");
            sb.append("MODELO: " + veiculo.getModelo() + "\n");
            sb.append("ANO: " + veiculo.getAno() + "\n");
            sb.append("PLACA: " + veiculo.getPlaca() + "\n");
            sb.append("PRECO: " + veiculo.getPreco() + "\n");
        }

        return sb.toString();
    }

    public String alterarDados(String placa, String marca, String modelo, int ano, String placaNova, double preco){
        String alterar = "";
        for(Veiculo veiculo : veiculos){
            if(veiculos.size() > 0){
                if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                veiculo.setMarca(marca);
                veiculo.setModelo(modelo);
                veiculo.setAno(ano);
                veiculo.setPlaca(placaNova);
                veiculo.setPreco(preco);

                alterar = "Dados do veículo alterados com sucesso.";
                } else {
                alterar = "Os dados do veículo não foram alterados, pois não há veiculo com essa placa.";
                }
            } else {
                alterar =  "Não há veiculos a serem alterados.";
            } 
        }

        return "\n" + alterar;
    }

    public String associarVeiculo(String placa, String nomeLoja){

        // Código antigo que não tava conseguindo fazer o que tinha que ser feito.

        // String associar = "";
        // Veiculo veiculo = null;
        // for(Veiculo v : veiculos){
        //     if(veiculos.size() > 0){
        //         if(v.getPlaca().equalsIgnoreCase(placa)){
        //             veiculo = v;
        //             break;
        //         } else {
        //             associar = "Não há veiculo com essa placa.";
        //         }
        //     } else {
        //         associar =  "Não há veiculos a serem associados.";
        //     } 
        // }

        // Loja loja = null;
        // for(Loja l : gerenciarLoja.lojas){
        //     if(gerenciarLoja.lojas.size() > 0){
        //         if(l.getNome().equalsIgnoreCase(nomeLoja)){
        //             loja = l;
        //             break;
        //         } else {
        //             associar = "Não loja com esse nome.";
        //         }
        //     } else {
        //         associar =  "Não há lojas para receberem essa associação.";
        //     } 
        // }

        // loja.adicionarVeiculos(new Veiculo(veiculo.getMarca(), veiculo.getModelo(), veiculo.getAno(), veiculo.getPlaca(), veiculo.getPreco()));

        // return associar;



        // Tive que recorrer ao chat gpt porque não tava conseguindo fazer o código acima de jeito nenhum...
        // Eis o código que o chatgpt sugeriu:
        Veiculo veiculo = null;
        for(Veiculo vei : veiculos){
            if(vei.getPlaca().equalsIgnoreCase(placa)){
                veiculo = vei;
                break;
            }
        }

        if(veiculo == null){
            return "Veiculo com placa informada não foi encontrado.";
        }

        Loja loja = null;
        for(Loja l : gerenciarLoja.lojas){
            if(l.getNome().equalsIgnoreCase(nomeLoja)){
                loja = l;
            }
        }

        if(loja == null){
            return "Loja com nome informado não foi encontrada.";
        }

        loja.adicionarVeiculos(veiculo);
        return "Veiculo associado à loja com sucesso.";
        //Entendi que tinha que verificar se o veiculo e a loja estavam nulos antes de tentar adicionar um ao outro... porém por algum motivo loja ainda está vindo nulo.
        //Erros possíveis:
        //1. A litsa de lojas da instância de gerenciarLoja que é criada aqui não tem nada adicionada a ela. Ela é totalemnte diferente da lista de lojas da instancia na classe Gerenciar loja.

    }

}
