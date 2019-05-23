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
import ups.Controller;


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
    * @return retorna o vetor de produtos
    */
    public List<Produto> read(){
        Controller c = new Controller();
        Connection con = ComuDB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_prod");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setNome_loja("Teste nome loja");
                p.setId(rs.getInt("idtbl_prod"));
                p.setNome(rs.getString("nome_produto"));
                p.setV_cash(rs.getDouble("valor_cash"));
                p.setV_cCard(rs.getDouble("valor_credCar"));
                
                
                produtos.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ComuDB.closeConnection(con, stmt, rs);
        }
        
        //for(int i=0; i<produtos.size(); i++){
         //   produtos.get(i).setNome_loja();
        //}
        return produtos;
    }
}
