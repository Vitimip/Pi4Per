/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import java.util.Iterator;
import model.Busca;
import persistencia.BuscaDao;
import persistencia.IBuscaDao;

/**
 *
 * @author Vitor
 */
public class BuscaControle implements IBuscaControle{
    IBuscaDao buscaPersistencia = null;
    public BuscaControle(){
        this.buscaPersistencia = new BuscaDao();
    }
   private boolean buscarBusca(String local)throws Exception{
       //Mudar pra String
       try {
            ArrayList<Busca> listagem = buscaPersistencia.listagem();
            Iterator<Busca> lista = listagem.iterator();
            while(lista.hasNext()){
                 Busca aux = lista.next();
                if(aux.getLocal().equalsIgnoreCase(local)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void incluir(Busca objeto) throws Exception {
        
        if(buscarBusca(objeto.getLocal())){
           
            throw new Exception("Local já notificado");
       }
        
        buscaPersistencia.incluir(objeto);
       
    }

    @Override
    public void alterar(Busca objeto) throws Exception {
        
       
        buscaPersistencia.alterar(objeto);

    }
        
    @Override
    public ArrayList<Busca> listagem() throws Exception {
       //Ordenda pelo ID
        return buscaPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public Busca buscar(String local) throws Exception {
    buscaPersistencia.buscar(local);
        return null;
    }}
