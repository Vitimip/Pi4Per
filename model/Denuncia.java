/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vitor
 */
public class Denuncia {
   
    private int idD = 0;
    private String den = "";
    private String Cat = "";
    private String desc = "";
    private String Rua = "";
    private String bairro = "";
    private int Cep = 0;
    private String estado = "";
    private String municipio = "";
    private String url = "";
 
    
    //Metodos
    public Denuncia(){}
    public Denuncia(int i,String den,
    String Ct,String d,String R,String b,int Cep,String e,String m,String u){
    i = idD; 
     this.den = den; Ct = Cat;d = desc; R = Rua; 
    b = bairro; this.Cep = Cep; e = estado; m = municipio; u = url; 
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }


    public String getDen() {
        return den;
    }

    public void setDen(String den) {
        this.den = den;
    }
 public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
      public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }
    
    
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    @Override
    public String toString() {
        return idD + ";"  + den + ";" + Cat+ ";" + desc + ";" + Rua + ";" + bairro + ";" + Cep + ";" + estado + ";" + municipio + ";" + url ;
    }
   public String buscarDesc(String desc){
   return desc;
   }

}

