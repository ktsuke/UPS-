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
public class Produto {
    private int id;
    private String nome;
    private String nome_loja;
    private double v_cash;
    private double v_cCard;
    private String data;
    private double cambio;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public String getNome_loja() {
        return nome_loja;
    }

    public void setNome_loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    public String getMensagem() {
        return "Valor não encontrado";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getV_cash() {
        return v_cash;
    }

    public void setV_cash(double v_cash) {
        this.v_cash = v_cash;
    }

    public double getV_cCard() {
        return v_cCard;
    }

    public void setV_cCard(double v_cCard) {
        this.v_cCard = v_cCard;
    }
    
    
}
