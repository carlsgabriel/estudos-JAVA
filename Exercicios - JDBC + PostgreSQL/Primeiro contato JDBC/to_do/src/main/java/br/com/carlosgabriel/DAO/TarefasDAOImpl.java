package br.com.carlosgabriel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.carlosgabriel.db.ConexaoJDBC;
import br.com.carlosgabriel.model.Tarefas;

public class TarefasDAOImpl implements TarefasDAO {

    @Override
    public void criarTarefa(Tarefas tarefas) {
        Connection conn = ConexaoJDBC.estabelecerConexao();

        if (conn != null) {
            String sql = "INSERT INTO tarefas (descricao, status, data_criacao) VALUES (?, ?, ?)";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, tarefas.getDescricao());
                ps.setString(2, tarefas.getStatus());
                ps.setDate(3, java.sql.Date.valueOf(tarefas.getData_criacao()));

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("\nTarefa adicionado com sucesso.");
                } else {
                    System.out.println("\nNão foi possível adicionar Tarefa.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

    @Override
    public Tarefas buscarTarefaPorId(int id) {
        Connection conn = ConexaoJDBC.estabelecerConexao();
        ResultSet rs = null;
        Tarefas tarefa = null;

        if (conn != null) {
            String sql = "SELECT * FROM tarefas WHERE id = ?";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);

                rs = ps.executeQuery();
                if (rs.next()) {
                    tarefa = new Tarefas(rs.getString("descricao"));
                    tarefa.setId(rs.getInt("id"));
                    tarefa.setStatus(rs.getString("status"));
                    java.sql.Date dataCriacao = rs.getDate("data_criacao");
                    tarefa.setData_criacao(dataCriacao.toLocalDate());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharResultSet(rs);
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }

        return tarefa;
    }

    @Override
    public List<Tarefas> listarTarefasPorStatus(String status) {
        Connection conn = ConexaoJDBC.estabelecerConexao();
        ResultSet rs = null;
        List<Tarefas> tarefas = new ArrayList<>();

        if (conn != null) {
            String sql = "SELECT * FROM tarefas WHERE status = ? ORDER BY id";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, status.toLowerCase());

                rs = ps.executeQuery();
                while (rs.next()) {
                    Tarefas tarefa = new Tarefas(rs.getString("descricao"));
                    tarefa.setId(rs.getInt("id"));
                    tarefa.setStatus(rs.getString("status"));
                    java.sql.Date dataCriacao = rs.getDate(("data_criacao"));
                    tarefa.setData_criacao(dataCriacao.toLocalDate());

                    tarefas.add(tarefa);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharResultSet(rs);
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }

        return tarefas;
    }

    @Override
    public void atualizarStatusTarefa(Tarefas tarefas) {
        Connection conn = ConexaoJDBC.estabelecerConexao();

        if (conn != null) {
            String sql = "UPDATE tarefas SET status = ? WHERE id = ?";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, tarefas.getStatus());
                ps.setInt(2, tarefas.getId());

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("\nStatus atualizado com sucesso!");
                } else {
                    System.out.println("\nNão foi possível atualizar status.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

    @Override
    public void excluirTarefa(int id) {
        Connection conn = ConexaoJDBC.estabelecerConexao();

        if (conn != null) {
            String sql = "DELETE FROM tarefas WHERE id = ?";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("\nStatus excluído com sucesso!");
                } else {
                    System.out.println("\nNão foi possível excluir status.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

    public String contarTarefas() {
        StringBuilder sb = new StringBuilder();
        Connection conn = ConexaoJDBC.estabelecerConexao();
        ResultSet rs = null;

        if (conn != null) {
            String sql = "SELECT status, COUNT(*) AS quantidade FROM tarefas GROUP BY status";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                rs = ps.executeQuery();
                while (rs.next()) {
                    sb.append("Status: " + rs.getString("status") + " - Quantidade: " + rs.getInt("quantidade") + "\n");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharResultSet(rs);
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }

        return sb.toString();
    }

    public List<Tarefas> listarTarefas() {
        Connection conn = ConexaoJDBC.estabelecerConexao();
        ResultSet rs = null;
        List<Tarefas> tarefas = new ArrayList<>();

        if (conn != null) {
            String sql = "SELECT * FROM tarefas";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                rs = ps.executeQuery();
                while (rs.next()) {
                    Tarefas tarefa = new Tarefas(rs.getString("descricao"));
                    tarefa.setId(rs.getInt("id"));
                    tarefa.setStatus(rs.getString("status"));
                    java.sql.Date dataCriacao = rs.getDate(("data_criacao"));
                    tarefa.setData_criacao(dataCriacao.toLocalDate());

                    tarefas.add(tarefa);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoJDBC.fecharResultSet(rs);
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }

        return tarefas;
    }

}
