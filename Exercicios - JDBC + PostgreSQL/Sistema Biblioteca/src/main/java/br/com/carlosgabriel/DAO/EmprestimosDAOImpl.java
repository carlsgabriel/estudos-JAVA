package br.com.carlosgabriel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.carlosgabriel.db.ConexaoJDBC;
import br.com.carlosgabriel.model.Emprestimos;
import br.com.carlosgabriel.model.Livros;

public class EmprestimosDAOImpl implements EmprestimosDAO {

    LivrosDAOImpl livrosDAO = new LivrosDAOImpl();

    @Override
    public void registrarEmprestimo(Emprestimos emprestimo) {
        Connection conn = ConexaoJDBC.iniciarConexao();
        
        if(conn != null){
            String sql = "INSERT INTO emprestimos (livro_id, data_emprestimo) VALUES (?, ?)";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, emprestimo.getLivro().getId());
                ps.setDate(2, java.sql.Date.valueOf(emprestimo.getData_emprestimo()));

                emprestimo.getLivro().setDisponivel(false);
                livrosDAO.atualizarLivro(emprestimo.getLivro());

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nEmpréstimo cadastrado com sucesso!");
                } else {
                    System.out.println("\nNão foi possível cadastrar o empréstimo.");
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

    @Override
    public Emprestimos buscarEmprestimoPorId(int id) {
        Connection conn = ConexaoJDBC.iniciarConexao();
        ResultSet rs = null;
        Emprestimos emprestimos = null;

        if(conn != null){
            String sql = "SELECT * FROM emprestimos WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, id);

                rs = ps.executeQuery();
                if(rs.next()){
                    Livros livros = livrosDAO.buscarLivroPorId(rs.getInt("livro_id"));

                    java.sql.Date dateEmprestimo = rs.getDate("data_emprestimo");
                    java.sql.Date dateDevolucao = rs.getDate("data_devolucao");

                    emprestimos = new Emprestimos(livros, dateEmprestimo.toLocalDate());
                    emprestimos.setId(rs.getInt("id"));
                    if(dateDevolucao == null){
                        emprestimos.setData_devolucao(null);
                    } else {
                        emprestimos.setData_devolucao(dateDevolucao.toLocalDate());
                    }
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                ConexaoJDBC.fecharResultSet(rs);
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }

        return emprestimos;
    }

    @Override
    public List<Emprestimos> listarEmprestimos() {
        Connection conn = ConexaoJDBC.iniciarConexao();
        ResultSet rs = null;
        List<Emprestimos> emprestimos = new ArrayList<>();

        if(conn != null){
            String sql = "SELECT * FROM emprestimos ORDER BY id";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                rs = ps.executeQuery();

                while(rs.next()){
                    Livros livros = livrosDAO.buscarLivroPorId(rs.getInt("livro_id"));

                    java.sql.Date dateEmprestimo = rs.getDate("data_emprestimo");
                    java.sql.Date dateDevolucao = rs.getDate("data_devolucao");

                    Emprestimos emp = new Emprestimos(livros, dateEmprestimo.toLocalDate());
                    emp.setId(rs.getInt("id"));
                    if(dateDevolucao == null){
                        emp.setData_devolucao(null);
                    } else {
                        emp.setData_devolucao(dateDevolucao.toLocalDate());
                    }

                    emprestimos.add(emp);
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                ConexaoJDBC.fecharResultSet(rs);
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }

        return emprestimos;
    }

    @Override
    public void atualizarEmprestimo(Emprestimos emprestimo) {
        Connection conn = ConexaoJDBC.iniciarConexao();

        if(conn != null){
            String sql = "UPDATE emprestimos SET livro_id = ?, data_emprestimo = ?, data_devolucao = ? WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, emprestimo.getLivro().getId());
                ps.setDate(2, java.sql.Date.valueOf(emprestimo.getData_emprestimo()));
                if(emprestimo.getData_devolucao() == null){
                    ps.setDate(3, null);
                } else {
                    ps.setDate(3, java.sql.Date.valueOf(emprestimo.getData_devolucao()));
                }
                ps.setInt(4, emprestimo.getId());

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nEmprestimo atualizado com sucesso.");
                } else {
                    System.out.println("\nNão foi possível atualizar o empréstimo.");
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

    @Override
    public void excluirEmprestimo(int id) {
        Connection conn = ConexaoJDBC.iniciarConexao();

        if(conn != null){
            String sql = "DELETE FROM emprestimos WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, id);

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nEmprestimo excluido com sucesso.");
                } else {
                    System.out.println("\nNão foi possível excluir o empréstimo.");
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

    public void registrarDevolucao(Emprestimos emprestimos){
        Connection conn = ConexaoJDBC.iniciarConexao();

        if(conn != null){
            String sql = "UPDATE emprestimos SET data_devolucao = ? WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setDate(1, java.sql.Date.valueOf(emprestimos.getData_devolucao()));
                ps.setInt(2, emprestimos.getId());

                Livros livro = livrosDAO.buscarLivroPorId(emprestimos.getLivro().getId());
                livro.setDisponivel(true);
                livrosDAO.atualizarLivro(livro);

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nEmprestimo atualizado com sucesso.");
                } else {
                    System.out.println("\nNão foi possível atualizar o empréstimo.");
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                ConexaoJDBC.fecharConexao(conn);
            }
        } else {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
        }
    }

}
