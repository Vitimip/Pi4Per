/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import java.util.Iterator;
import persistencia.DenunciaDao;
import model.Denuncia;
import persistencia.IDenunciaDao;
/**
 *
 * @author Vitor
 */
public class DenunciaControle implements IDenunciaControle{
    IDenunciaDao denunciaPersistencia = null;
    public DenunciaControle(){
        this.denunciaPersistencia = new DenunciaDao();
    }
   private boolean buscarDenuncia(String desc)throws Exception{
       //Mudar pra String
       try {
            ArrayList<Denuncia> listagem = denunciaPersistencia.listagem();
            Iterator<Denuncia> lista = listagem.iterator();
            while(lista.hasNext()){
                 Denuncia aux = lista.next();
                if(aux.getDesc().equalsIgnoreCase(desc)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void incluir(Denuncia objeto) throws Exception {
        
        if(buscarDenuncia(objeto.getDesc())){
           
            throw new Exception("Denuncia já foi cadastrada!");
       }
        
        denunciaPersistencia.incluir(objeto);
       
    }

    @Override
    public void alterar(Denuncia objeto) throws Exception {
        
       
        denunciaPersistencia.alterar(objeto);

    }
        
    @Override
    public ArrayList<Denuncia> listagem() throws Exception {
       //Ordenda pelo ID
        return denunciaPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public Denuncia buscar(String desc) throws Exception {
    denunciaPersistencia.buscar(desc);
        return null;
    }}
