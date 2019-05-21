/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import View.Resultados;
import View.Inter;

/**
 *
 * @author ktsuke
 */
public class UPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resultados janelaResult = new Resultados();
        Inter programa = new Inter(janelaResult);
        programa.setVisible(true);
    }
    
}
