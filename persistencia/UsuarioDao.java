/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import ferramentas.GerIdenUsu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Vitor
 */
public class UsuarioDao implements IUsuarioDao{
    private final String nomeDoArquivoNoDisco;
    public UsuarioDao() {
      nomeDoArquivoNoDisco = "./src/arquivodedados/Usuario.txt";
        // nomeDoArquivoNoDisco = "Marca.txt";
    }
    
    @Override
    public void incluir(Usuario objeto) throws Exception {
       
        try { //Criar o buffer do arquivo
            //cria o arquivo
         
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            // Incluindo o id no objeto ******
             BufferedWriter bw = new BufferedWriter(fw); 
                // Incluindo o id no objeto ******
                objeto.setId(GerIdenUsu.getID());
                 //Escreve no arquivo
                bw.write(objeto.toString()+"\n");
                //fecha o arquivo
                bw.close();
               
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Usuario objeto) throws Exception {
         ArrayList<Usuario> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i < lista.size();i++){
            if(objeto.getId() == lista.get(i).getId()){
                bw.write(objeto.toString()+"\n");
            }
            else{
                bw.write(lista.get(i).toString()+ "\n");
            }
        }
        bw.close();
        
    }
       
    @Override
    public ArrayList<Usuario> listagem() throws Exception {
         try {
            ArrayList<Usuario> listaDeU = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while((linha=br.readLine())!=null){
                    Usuario objetoU = new Usuario();
                    String vetorString[] = linha.split(";");
                    objetoU.setId(Integer.parseInt(vetorString[0]));
                    objetoU.setCpf(vetorString[1]);
                    objetoU.setSenha(vetorString[2]);
                    listaDeU.add(objetoU);
                }
            }
         return listaDeU;
        } catch(Exception erro){
         throw erro;
        }
        }
   }

