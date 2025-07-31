package br.com.carlosgabriel.DAO;

import java.util.List;

import br.com.carlosgabriel.model.Livros;

public interface LivrosDAO {

    public void cadastrarLivro(Livros livro);
    public Livros buscarLivroPorId(int id);
    public List<Livros> listarDisponiveis();
    public List<Livros> buscarEmprestados();
    public void atualizarLivro(Livros livro);
    public void excluirLivro(int id);

}
