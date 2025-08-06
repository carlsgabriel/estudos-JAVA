import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private List<Imovel> imoveis = new ArrayList<>();

    public void adicionarConstrucao(Imovel construcao) {
        imoveis.add(construcao);
    }

    public void removerConstrucao(Imovel construcao) {
        imoveis.remove(construcao);
    }

    public String listarConstrucoes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imóveis disponíveis no momento:\n");
        for (Imovel imovel : imoveis) {
            System.out.println(imovel.getDescricao());
        }

        return sb.toString();
    }

    public double informarArea() {
        double sum = 0;

        for (Imovel imovel : imoveis) {
            sum += imovel.calcularArea();
        }

        return sum;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

}
