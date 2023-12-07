/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controle;

import java.util.ArrayList;
import model.Avaliar;

/**
 *
 * @author Vitor
 */
public interface IAvaliarControle {
        void incluir(Avaliar objeto)throws Exception;
    void alterar(Avaliar objeto)throws Exception;
     ArrayList<Avaliar> listagem()throws Exception;
}
