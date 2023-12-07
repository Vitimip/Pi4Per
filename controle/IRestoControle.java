/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controle;

import java.util.ArrayList;
import model.Resto;

/**
 *
 * @author Vitor
 */
public interface IRestoControle {
    void incluir(Resto objeto)throws Exception;
    void alterar(Resto objeto)throws Exception;
     ArrayList<Resto> listagem()throws Exception;
}
