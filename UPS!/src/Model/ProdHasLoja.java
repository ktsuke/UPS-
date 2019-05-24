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
public class ProdHasLoja {
    private int id_loja;
    private int id_prod;
	private String nom_prod;
	private String nom_loja;
	private double vlr_prod;
    private String cotacao;
    private float cambio;
	
	

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }
	
	public String getNom_loja() {
        return nom_loja;
    }

    public void setNom_loja(String nom_loja) {
        this.nom_loja = nom_loja;
    }

    public int getId_loja() {
        return id_loja;
    }

    public void setId_loja(int id_loja) {
        this.id_loja = id_loja;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getCotacao() {
        return cotacao;
    }

    public void setCotacao(String cotacao) {
        this.cotacao = cotacao;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }
	
	public double getVlr_prod() {
        return vlr_prod;
    }

    public void setVlr_prod(double vlr_prod) {
        this.vlr_prod = vlr_prod;
    }
    
    
}
