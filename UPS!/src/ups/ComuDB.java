package ups;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ktsuke
 */
public class ComuDB {
    public String MSG="";
    private String LOGIN, SENHA;
    private Connection connection=null;
    private Statement stats=null;
    private final String URL ="jdbc:mysql:file:UPSDB";
    /**
     * Conecta ao banco de dados e caso apareça algum erro retorna uma janela de alerta com o erro
     */
    public void conecDB(){
        try {
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            stats = connection.createStatement();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro "+e);
        }
    }
    /**
     * Fecha a conexão com o banco de dados
     */
    public void fechaDB(){
        try{
            connection.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de fechamento "+e);
        }
    }
    /**
     * Executa a busca no banco de dados 
     * @param dados seleciona os dados que são necessários na busca 
     * @param tabela local que deseja fazer a busca
     * @return retorna o resultado da busca se houver resultado, caso contrário retorna null para mostrar que a busca não obteve resultados
     * @throws SQLException verifica somente um possível erro que apareça na query do SQL
     */
    public ResultSet searchDB(String dados, String tabela) throws SQLException{
        MSG = "Select "+dados+" from "+tabela;
        ResultSet busca =  stats.executeQuery(MSG);
        if (!busca.next()){
            JOptionPane.showMessageDialog(null,"A busca não retornou nenhum resultado");
            return null;
        }
        else {
            return busca;
        }
    }
    /*
    public void deleteDB(){
        
    }
    
    public void upDB(){
        
    }*/
}

