/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import java.util.Iterator;
import model.Avaliar;
import persistencia.AvaliarDao;
import persistencia.IAvaliarDao;


/**
 *
 * @author Vitor
 */
public class AvaliarControle implements IAvaliarControle{
    IAvaliarDao avaliarPersistencia = null;
    public AvaliarControle(){
        this.avaliarPersistencia = new AvaliarDao();
    }
   private boolean buscarAvaliar(String desc)throws Exception{
        try {
            ArrayList<Avaliar> listagem = avaliarPersistencia.listagem();
            Iterator<Avaliar> lista = listagem.iterator();
            while(lista.hasNext()){
                 Avaliar aux = lista.next();
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
    public void incluir(Avaliar objeto) throws Exception {
        
        if(buscarAvaliar(objeto.getDesc())){
           
            throw new Exception("Avaliação já feita!");
       }
        
        avaliarPersistencia.incluir(objeto);
       
    }

    @Override
    public void alterar(Avaliar objeto) throws Exception {
        
       
        avaliarPersistencia.alterar(objeto);

    }
        
    @Override
    public ArrayList<Avaliar> listagem() throws Exception {
       //Ordenda pelo ID
        return avaliarPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}
