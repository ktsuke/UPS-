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
public class ProdutoDAO {
    /**
    *
    * Função responsável por ler os dados do banco, lendo tabela tbl_produto e adicionando
    * as insformações em um objeto Produto que é adicionado em um vetor de Produtos
    * 
     * @param nome
    * @return retorna o vetor de produtos
    */
    public List<Produto> read(String nome){
        Connection con = ComuDB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        //System.out.println(nome);
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_prod WHERE nome_prod ='"+nome+"'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
				p.setIdtbl_prod(rs.getInt("idtbl_prod"));
                p.setNome_prod(rs.getString("nome_prod"));
                p.setOrig_prod(rs.getString("orig_prod"));
                
                
                produtos.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ComuDB.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
    
}
