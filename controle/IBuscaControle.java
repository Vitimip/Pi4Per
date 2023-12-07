/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controle;

import java.util.ArrayList;
import model.Busca;

/**
 *
 * @author Vitor
 */
public interface IBuscaControle {
     void incluir(Busca objeto)throws Exception;
    void alterar(Busca objeto)throws Exception;
     ArrayList<Busca> listagem()throws Exception;
      Busca buscar(String local)throws Exception;
}
