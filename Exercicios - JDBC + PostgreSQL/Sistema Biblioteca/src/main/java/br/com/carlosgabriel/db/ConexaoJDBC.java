package br.com.carlosgabriel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoJDBC {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "1234567";

    public static Connection iniciarConexao(){
        try{
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            return conn;
        }
        catch(SQLException e){
            return null;
        }
    }

    public static void fecharConexao(Connection conn){
        if(conn != null){
            try{
                conn.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        } else {
            System.out.println("Não há conexão com o banco de dados a ser fechada.");
        }
    }

    public static void fecharResultSet(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        } else {
            System.out.println("Não há ResultSet a ser fechado.");
        }
    }

}
