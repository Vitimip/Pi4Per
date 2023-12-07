/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vitor
 */
public class Usuario {
    private int id = 0;
    private String Cpf = "";
    private String Senha = "";

    public Usuario() {
    }
    
    public Usuario(int i,String c,String s){
    i = id;c = Cpf; s = Senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

   

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

   

    @Override
    public String toString() {
        return  id + ";" + Cpf + ";" + Senha ;
    }
    
    
}
