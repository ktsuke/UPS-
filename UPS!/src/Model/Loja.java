/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author simao
 */
public class Loja {
    private int id;
    private String nom_loja;
	private String orig_loja;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_loja() {
        return nom_loja;
    }

    public void setNom_loja(String nom_loja) {
        this.nom_loja = nom_loja;
    }
	
	public String getOrig_loja() {
        return orig_loja;
    }

    public void setOrig_loja(String orig_loja) {
        this.orig_loja = orig_loja;
    }
    
    
}
