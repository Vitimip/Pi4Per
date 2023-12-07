/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.util.ArrayList;
import java.util.Iterator;
import model.Resto;
import persistencia.ResDao;
import persistencia.IResDao;
/**
 *
 * @author Vitor
 */
public class RestoControle implements IRestoControle{
    IResDao restoPersistencia = null;
    public RestoControle(){
        this.restoPersistencia = (IResDao) new ResDao();
    }
   private boolean buscarResto(String Municipio)throws Exception{
        try {
            ArrayList<Resto> listagem = restoPersistencia.listagem();
            Iterator<Resto> lista = listagem.iterator();
            while(lista.hasNext()){
                 Resto aux = lista.next();
                if(aux.getMunicipio().equalsIgnoreCase(Municipio)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void incluir(Resto objeto) throws Exception {
        
        if(buscarResto(objeto.getMunicipio())){
           
            throw new Exception("Denuncia já cadastrada!");
       }
        
        restoPersistencia.incluir(objeto);
       
    }

    @Override
    public void alterar(Resto objeto) throws Exception {
        
       
        restoPersistencia.alterar(objeto);

    }
        
    @Override
    public ArrayList<Resto> listagem() throws Exception {
       //Ordenda pelo ID
        return restoPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}
