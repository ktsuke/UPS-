/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ktsuke
 */
public class Controller {
    public ResultSet listaLoja() throws SQLException{
        ResultSet totalLoja;
        ComuDB sql = new ComuDB();
        
        totalLoja=sql.searchDB("nome", "loja");
        return totalLoja;
    }
    
}
