package ups;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author unifasilva
 */
public class ComuDB {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/upsdatabase";
    private static final String USER = "root";
    private static final String PASS = "";
    
    /**
     * Função responsável por abrir a conexão com o banco
     * 
     */
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Falha na conexão", ex);
        }
    }
    /**
     * Função responsável por fechar a conexão com o banco
     * 
     */
    public static void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " +ex);
            }
        }
    }
    
    /**
     * Função responsável por fechar a o Statement e a conexão com o banco
     * 
     */
    public static void closeConnection(Connection c, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " +ex);
            }
        }
        
        closeConnection(c);
    }
    
    public static void closeConnection(Connection c, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " +ex);
            }
        }
        
        closeConnection(c, stmt);
    }

}

