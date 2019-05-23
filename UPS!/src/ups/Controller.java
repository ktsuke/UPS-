/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups;
import Model.Loja;
import Model.LojaDAO;
import Model.Produto;
import Model.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ktsuke
 */
public class Controller {
    public Controller(){}

    private String nomeProd;

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    
    
    
    LojaDAO loja = new LojaDAO();
    ProdutoDAO o = new ProdutoDAO();
    
    public void setLoja(){
        for(Produto p: o.read()){
            p.setNome_loja("Amazon");
        }
    }
    
}
