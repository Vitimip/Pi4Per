/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vitor
 */
public class Busca {
    private int idD = 0;
    private String local = "";
    private String data = "";
    private String Cat = "";
    private String situacao = "";
    private String municipio = "";

    public Busca() {
    }
    
    public Busca(int i,String l, String d,String c, String s, String m){
    i = idD;l = local; d = data; c = Cat; s = situacao; m = municipio;
}

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

   
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return  idD + ";" + local + ";" + data + ";" + Cat + ";" + situacao + ";" + municipio ;
    }
    public String buscarlocal(String local){
   return local;
   }
    
}
