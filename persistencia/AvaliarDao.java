/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import ferramentas.GerIdenAva;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.Avaliar;

/**
 *
 * @author Vitor
 */
public class AvaliarDao implements IAvaliarDao{
    private final String nomeDoArquivoNoDisco;
    public AvaliarDao() {
      nomeDoArquivoNoDisco = "./src/arquivodedados/Avaliar.txt";
        // nomeDoArquivoNoDisco = "Marca.txt";
    }
    
    @Override
    public void incluir(Avaliar objeto) throws Exception {
       
        try { //Criar o buffer do arquivo
            //cria o arquivo
         
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            // Incluindo o id no objeto ******
             BufferedWriter bw = new BufferedWriter(fw); 
                // Incluindo o id no objeto ******
                objeto.setIdD(GerIdenAva.getID());
                 //Escreve no arquivo
                bw.write(objeto.toString()+"\n");
                //fecha o arquivo
                bw.close();
               
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Avaliar objeto) throws Exception {
         ArrayList<Avaliar> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i < lista.size();i++){
            if(objeto.getIdD() == lista.get(i).getIdD()){
                bw.write(objeto.toString()+"\n");
            }
            else{
                bw.write(lista.get(i).toString()+ "\n");
            }
        }
        bw.close();
        
    }
       
    @Override
    public ArrayList<Avaliar> listagem() throws Exception {
         try {
            ArrayList<Avaliar> listaDeAD = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while((linha=br.readLine())!=null){
                    Avaliar objetoAD = new Avaliar();
                    String vetorString[] = linha.split(";");
                    objetoAD.setIdD(Integer.parseInt(vetorString[0]));
                    objetoAD.setSituacao(vetorString[1]);
                    objetoAD.setDesc(vetorString[2]);
                    objetoAD.setPartecn(vetorString[3]);
                    listaDeAD.add(objetoAD);
                }
            }
         return listaDeAD;
        } catch(Exception erro){
         throw erro;
        }
        }
   }
