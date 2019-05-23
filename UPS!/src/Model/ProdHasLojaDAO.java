/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ups.ComuDB;

/**
 *
 * @author simao
 */
public class ProdHasLojaDAO {
    public ProdHasLojaDAO(){
        
    }
    
    public List<ProdHasLoja> read(){
        Connection con = ComuDB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ProdHasLoja> phds = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_loja_has_tbl_prod");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                ProdHasLoja phd = new ProdHasLoja();
                phd.setId_loja(rs.getInt("tbl_loja_idtbl_loja"));
                phd.setId_prod(rs.getInt("tbl_prod_idtbl_prod"));
                phd.setData(rs.getString("data"));
                phd.setPais(rs.getString("pais"));
                phd.setCambio(rs.getInt("cambio"));
                
                phds.add(phd);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ComuDB.closeConnection(con, stmt, rs);
        }
        
        return phds;
    }
    
}
