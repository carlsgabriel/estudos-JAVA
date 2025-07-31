package br.com.carlosgabriel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.carlosgabriel.db.ConexaoJDBC;
import br.com.carlosgabriel.model.Livros;

public class LivrosDAOImpl implements LivrosDAO{

    @Override
    public void cadastrarLivro(Livros livro) {
        Connection conn = ConexaoJDBC.iniciarConexao();
        
        if(conn != null){
            String sql = "INSERT INTO livros (titulo, autor) VALUES (?, ?)";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, livro.getTitulo());
                ps.setString(2, livro.getAutor());

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nLivro cadastrado com sucesso!");
                } else {
                    System.out.println("\nNão foi possível cadastrar o livro.");
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
    public Livros buscarLivroPorId(int id) {
        Connection conn = ConexaoJDBC.iniciarConexao();
        ResultSet rs = null;
        Livros livro = null;

        if(conn != null){
            String sql = "SELECT * FROM livros WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, id);

                rs = ps.executeQuery();
                if(rs.next()){
                    livro = new Livros(rs.getString("titulo"), rs.getString("autor"));
                    livro.setId(rs.getInt("id"));
                    livro.setDisponivel(rs.getBoolean("disponivel"));
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

        return livro;
    }

    @Override
    public List<Livros> listarDisponiveis() {
        Connection conn = ConexaoJDBC.iniciarConexao();
        ResultSet rs = null;
        List<Livros> livros = new ArrayList<>();

        if(conn != null){
            String sql = "SELECT * FROM livros WHERE disponivel = true ORDER BY id";
            
            try(PreparedStatement ps = conn.prepareStatement(sql)){
                rs= ps.executeQuery();
                
                while(rs.next()){
                    Livros livro = new Livros(rs.getString("titulo"), rs.getString("autor"));
                    livro.setId(rs.getInt("id"));
                    livro.setDisponivel(rs.getBoolean("disponivel"));

                    livros.add(livro);
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

        return livros;
    }

    @Override
    public List<Livros> buscarEmprestados() {
        Connection conn = ConexaoJDBC.iniciarConexao();
        ResultSet rs = null;
        List<Livros> livros = new ArrayList<>();

        if(conn != null){
            String sql = "SELECT * FROM livros WHERE disponivel = false ORDER BY id";
            
            try(PreparedStatement ps = conn.prepareStatement(sql)){
                rs= ps.executeQuery();
                
                while(rs.next()){
                    Livros livro = new Livros(rs.getString("titulo"), rs.getString("autor"));
                    livro.setId(rs.getInt("id"));
                    livro.setDisponivel(rs.getBoolean("disponivel"));

                    livros.add(livro);
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

        return livros;
    }

    @Override
    public void atualizarLivro(Livros livro) {
        Connection conn = ConexaoJDBC.iniciarConexao();

        if(conn != null){
            String sql = "UPDATE livros SET titulo = ?, autor = ?, disponivel = ? WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, livro.getTitulo());
                ps.setString(2, livro.getAutor());
                ps.setBoolean(3, livro.getDisponivel());
                ps.setInt(4, livro.getId());

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nLivro atualizado com sucesso!");
                } else {
                    System.out.println("\nNão foi possível atualizar o Livro.");
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
    public void excluirLivro(int id) {
        Connection conn = ConexaoJDBC.iniciarConexao();

        if(conn != null){
            String sql = "DELETE FROM livros WHERE id = ?";

            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, id);

                int rowsAffected = ps.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("\nLivro excluído com sucesso.");
                } else {
                    System.out.println("\nNão foi possível excluir o livro.");
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
