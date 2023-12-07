/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import ferramentas.GerIdenBus;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.Busca;

/**
 *
 * @author Vitor
 */
public class BuscaDao implements IBuscaDao{
    private final String nomeDoArquivoNoDisco;
    public BuscaDao() {
      nomeDoArquivoNoDisco = "./src/arquivodedados/Busca.txt";
        // nomeDoArquivoNoDisco = "Marca.txt";
    }
    
    @Override
    public void incluir(Busca objeto) throws Exception {
       
        try { //Criar o buffer do arquivo
            //cria o arquivo
         
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            // Incluindo o id no objeto ******
             BufferedWriter bw = new BufferedWriter(fw); 
                // Incluindo o id no objeto ******
                objeto.setIdD(GerIdenBus.getID());
                 //Escreve no arquivo
                bw.write(objeto.toString()+"\n");
                //fecha o arquivo
                bw.close();
               
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Busca objeto) throws Exception {
         ArrayList<Busca> lista = listagem();
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
    public ArrayList<Busca> listagem() throws Exception {
         try {
            ArrayList<Busca> listaDeBD = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while((linha=br.readLine())!=null){
                    Busca objetoBD = new Busca();
                    String vetorString[] = linha.split(";");
                    objetoBD.setIdD(Integer.parseInt(vetorString[0]));
                   objetoBD.setLocal(vetorString[1]); 
                   objetoBD.setData(vetorString[2]);
                    objetoBD.setCat(vetorString[3]);
                    objetoBD.setSituacao(vetorString[4]);
                    objetoBD.setMunicipio(vetorString[5]);
                    listaDeBD.add(objetoBD);
                }
            }
         return listaDeBD;
        } catch(Exception erro){
         throw erro;
        }
        }
    @Override
    public Busca buscar(String local)throws Exception{
    FileReader fr = new FileReader(nomeDoArquivoNoDisco);
    BufferedReader br = new BufferedReader(fr);
                String linha = "";
                while((linha=br.readLine())!=null){
                    Busca objetoBD = new Busca();
                    String vetorString[] = linha.split(";");
                   objetoBD.setIdD(Integer.parseInt(vetorString[0]));
                   objetoBD.setLocal(vetorString[1]); 
                   objetoBD.setData(vetorString[2]);
                    objetoBD.setCat(vetorString[3]);
                    objetoBD.setSituacao(vetorString[4]);
                    objetoBD.setMunicipio(vetorString[5]);
                    if(objetoBD.getLocal() == local){
                        br.close();
                        return new Busca(Integer.parseInt(vetorString[0]),vetorString[1],vetorString[2],vetorString[3],vetorString[4],vetorString[5]);
                        
                    }
                }
    
    return null;
    }}
    

