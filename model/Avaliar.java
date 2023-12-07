/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vitor
 */
public class Avaliar {
    private int idD = 0;
    private String situacao = "";
    private String desc = "";
    private String partecn = "";

    public Avaliar() {
    }
    
    public Avaliar(int i,String s,String d, String p){
    i = idD; s = situacao; d = desc; p = partecn;
    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPartecn() {
        return partecn;
    }

    public void setPartecn(String partecn) {
        this.partecn = partecn;
    }

    @Override
    public String toString() {
        return idD + ";" + situacao + ";" + desc + ";" + partecn ;
    }
    
    
}
