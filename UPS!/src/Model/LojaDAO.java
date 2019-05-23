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
 * DAO = Data Acess Object
 */
public class LojaDAO {
    
    public List<Loja> read(){
        Connection con = ComuDB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Loja> lojas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_loja");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Loja l = new Loja();
                l.setId(rs.getInt("idtbl_loja"));
                l.setNome_loja(rs.getString("nome_loja"));
                
                lojas.add(l);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ComuDB.closeConnection(con, stmt, rs);
        }
        
        return lojas;
    }
}
