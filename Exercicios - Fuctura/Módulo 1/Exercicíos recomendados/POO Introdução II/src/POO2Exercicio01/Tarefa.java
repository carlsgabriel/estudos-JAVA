package POO2Exercicio01;

import java.util.Date;

public class Tarefa {

    private String descricao;
    private Date dataDeCriacao;
    private boolean estado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
