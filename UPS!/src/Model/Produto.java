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
    private int idtbl_prod;
    private String nome_prod;
    private String orig_prod;

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getMensagem() {
        return "Valor não encontrado";
    }

    public int getIdtbl_prod() {
        return idtbl_prod;
    }

    public void setIdtbl_prod(int idtbl_prod) {
        this.idtbl_prod = idtbl_prod;
    }

    public String getOrig_prod() {
        return orig_prod;
    }

    public void setOrig_prod(String orig_prod) {
        this.orig_prod = orig_prod;
    }
}
