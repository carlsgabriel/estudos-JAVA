package controller;

import java.util.ArrayList;
import java.util.List;

import model.Loja;
import model.Veiculo;

public class GerenciarVeiculo {

    static List<Veiculo> veiculos = new ArrayList<>();

    public String consultarVeiculo(String placa){
        StringBuilder sb = new StringBuilder();

        if(veiculos.size() <= 0){
            sb.append("\nNão há veículos para serem verificados.");
        } else {
            Veiculo veiculo = veiculos.stream().filter(x -> x.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

            if(veiculo == null){
                sb.append("\nNão há veiculo com essa placa.");
            } else {
                sb.append("[INFORMAÇÕES DO CARRO]\n");
                    sb.append("Marca: " + veiculo.getMarca() + "\n");
                    sb.append("Modelo: " + veiculo.getModelo() + "\n");
                    sb.append("Ano: " + veiculo.getAno() + "\n");
                    sb.append("Placa: " + veiculo.getPlaca() + "\n");
                    sb.append("Preço: " + veiculo.getPreco());
            }
        }

        return sb.toString();
    }

    public String cadastrarVeiculo(String marca, String modelo, int ano, String placa, double preco){
        Veiculo veiculo = veiculos.stream().filter(x -> x.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

        if(veiculo == null){
            veiculos.add(new Veiculo(marca, modelo, ano, placa, preco));

            return "Veiculo cadastrado com sucesso.";
        } else {
            return "Já existe um veículo com essa mesma placa cadastrado.";
        }
    }

    public String excluirVeiculo(String placa){
        Veiculo veiculo = veiculos.stream().filter(x -> x.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

        if(veiculo == null){
            return "\nNão existe veículo com essa placa.";
        } else {
            veiculos.remove(veiculo);
            
            return "\nVeículo excluido com sucesso.";
        }

    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String listarVeiculos(){
        StringBuilder sb = new StringBuilder();

        if(veiculos.size() <= 0){
            sb.append("\nNão há veiculos a serem listados.");
        } else {
            sb.append("[CARROS DISPONÍVEIS]\n");
            for(Veiculo veiculo : veiculos){
                sb.append("\nMARCA: " + veiculo.getMarca() + "\n");
                sb.append("MODELO: " + veiculo.getModelo() + "\n");
                sb.append("ANO: " + veiculo.getAno() + "\n");
                sb.append("PLACA: " + veiculo.getPlaca() + "\n");
                sb.append("PRECO: " + veiculo.getPreco() + "\n");
            }
        }

        return sb.toString();
    }

    public String alterarDados(String placa, String marca, String modelo, int ano, String placaNova, double preco){
        Veiculo veiculo = veiculos.stream().filter(x -> x.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);

        if(veiculo == null){
            return "\nNão existe veiculo com essa placa.";
        } else {
            veiculo.setMarca(marca);
            veiculo.setModelo(modelo);
            veiculo.setAno(ano);
            veiculo.setPlaca(placaNova);
            veiculo.setPreco(preco);

            return "\nDados do veículo alterados com sucesso.";
        }

    }

    public String associarVeiculo(String placa, String nomeLoja){

        /*Código antigo que não tava eu não estava conseguindo reproduzir o que tinha que ser feito.
        String associar = "";
        Veiculo veiculo = null;
        for(Veiculo v : veiculos){
            if(veiculos.size() > 0){
                if(v.getPlaca().equalsIgnoreCase(placa)){
                    veiculo = v;
                    break;
                } else {
                    associar = "Não há veiculo com essa placa.";
                }
            } else {
                associar =  "Não há veiculos a serem associados.";
            } 
        }

        Loja loja = null;
        for(Loja l : gerenciarLoja.lojas){
            if(gerenciarLoja.lojas.size() > 0){
                if(l.getNome().equalsIgnoreCase(nomeLoja)){
                    loja = l;
                    break;
                } else {
                    associar = "Não loja com esse nome.";
                }
            } else {
                associar =  "Não há lojas para receberem essa associação.";
            } 
        }

        loja.adicionarVeiculos(new Veiculo(veiculo.getMarca(), veiculo.getModelo(), veiculo.getAno(), veiculo.getPlaca(), veiculo.getPreco()));

        return associar;
        */

        /*Tive que recorrer ao chat gpt e ao professor do curso e descobri que:
         1. Não preciso de ums instância nova de gerenciarLoja aqui, isso até "fere" a questão das responsabilidades.
         2. Minha loja está vindo "null" por causa da instância de gerenciarLoja que eu estava criando aqui... pois, na ClasseGerenciar loja, a loja de fato era computada...
            Aqui, a lista continuava vazia porque o cadastro das lojas era feito na classe GerenciarLoja e na lista Loja de lá. Com isso a sugestão foi o seguinte: transforma a List<Loja> em static.
         3. Com o chat gpt vi que precisava verificar os dados antes de realizar as operações, assim não aconteceria de eu estar fazendo alguma operação com null. 
         */

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

        //Aqui é onde o static List<Loja> funciona...
        Loja loja = null;
        for(Loja l : GerenciarLoja.lojas){
            if(l.getNome().equalsIgnoreCase(nomeLoja)){
                loja = l;
            }
        }

        if(loja == null){
            return "Loja com nome informado não foi encontrada.";
        }

        loja.adicionarVeiculos(veiculo);
        return "Veiculo associado à loja com sucesso.";
    }

}
