package br.com.carlosgabriel.DAO;

import java.util.List;

import br.com.carlosgabriel.model.Emprestimos;

public interface EmprestimosDAO {

    public void registrarEmprestimo(Emprestimos emprestimo);
    public Emprestimos buscarEmprestimoPorId(int id);
    public List<Emprestimos> listarEmprestimos();
    public void atualizarEmprestimo(Emprestimos emprestimo);
    public void excluirEmprestimo(int id);
}
