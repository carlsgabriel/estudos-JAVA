package br.com.carlosgabriel.DAO;

import java.sql.Connection;
import java.util.List;

import br.com.carlosgabriel.model.Tarefas;

public interface TarefasDAO {

    public void criarTarefa(Tarefas tarefas);

    public Tarefas buscarTarefaPorId(int id);

    public List<Tarefas> listarTarefasPorStatus(String status);

    public void atualizarStatusTarefa(Tarefas tarefas);

    public void excluirTarefa(int id);

}
