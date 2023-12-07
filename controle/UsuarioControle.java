/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import java.util.Iterator;
import model.Usuario;
import persistencia.IUsuarioDao;
import persistencia.UsuarioDao;

/**
 *
 * @author Vitor
 */
public class UsuarioControle implements IUsuarioControle{
    IUsuarioDao usuarioPersistencia = null;
    public UsuarioControle(){
        this.usuarioPersistencia = new UsuarioDao();
    }
   private boolean buscarUsuario(String Cpf)throws Exception{
        try {
            ArrayList<Usuario> listagem = usuarioPersistencia.listagem();
            Iterator<Usuario> lista = listagem.iterator();
            while(lista.hasNext()){
                 Usuario aux = lista.next();
                if(aux.getCpf().equalsIgnoreCase(Cpf)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void incluir(Usuario objeto) throws Exception {
        
        if(buscarUsuario(objeto.getCpf())){
           
            throw new Exception("Cpf já cadastrado");
       }
        
        usuarioPersistencia.incluir(objeto);
       
    }

    @Override
    public void alterar(Usuario objeto) throws Exception {
        
       
        usuarioPersistencia.alterar(objeto);

    }
        
    @Override
    public ArrayList<Usuario> listagem() throws Exception {
       //Ordenda pelo ID
        return usuarioPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}
