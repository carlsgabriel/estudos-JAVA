package br.com.carlosgabriel.model;

import java.time.LocalDate;

public class Emprestimos {
    private Integer id;
    private Livros livro;
    private LocalDate data_emprestimo;
    private LocalDate data_devolucao;
    
    public Emprestimos(Livros livro, LocalDate data_emprestimo) {
        this.livro = livro;
        this.data_emprestimo = data_emprestimo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((livro == null) ? 0 : livro.hashCode());
        result = prime * result + ((data_emprestimo == null) ? 0 : data_emprestimo.hashCode());
        result = prime * result + ((data_devolucao == null) ? 0 : data_devolucao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emprestimos other = (Emprestimos) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (livro == null) {
            if (other.livro != null)
                return false;
        } else if (!livro.equals(other.livro))
            return false;
        if (data_emprestimo == null) {
            if (other.data_emprestimo != null)
                return false;
        } else if (!data_emprestimo.equals(other.data_emprestimo))
            return false;
        if (data_devolucao == null) {
            if (other.data_devolucao != null)
                return false;
        } else if (!data_devolucao.equals(other.data_devolucao))
            return false;
        return true;
    }

}
