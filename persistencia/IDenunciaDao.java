/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import model.Denuncia;

/**
 *
 * @author Vitor
 */
public interface IDenunciaDao {
     void incluir(Denuncia objeto)throws Exception;
    void alterar(Denuncia objeto)throws Exception;
    ArrayList<Denuncia> listagem()throws Exception;
    Denuncia buscar(String desc)throws Exception;
}
