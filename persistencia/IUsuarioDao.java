/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Vitor
 */
public interface IUsuarioDao {
     void incluir(Usuario objeto)throws Exception;
    void alterar(Usuario objeto)throws Exception;
    ArrayList<Usuario> listagem()throws Exception;
}
