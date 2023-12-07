/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import ferramentas.GerIdenDe;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.Denuncia;

/**
 *
 * @author Vitor
 */
public class DenunciaDao implements IDenunciaDao{
    private final String nomeDoArquivoNoDisco;
    public DenunciaDao() {
      nomeDoArquivoNoDisco = "./src/arquivodedados/Denuncia.txt";
        // nomeDoArquivoNoDisco = "Marca.txt";
    }
    
    @Override
    public void incluir(Denuncia objeto) throws Exception {
       
        try { //Criar o buffer do arquivo
            //cria o arquivo
         
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            // Incluindo o id no objeto ******
             BufferedWriter bw = new BufferedWriter(fw); 
                // Incluindo o id no objeto ******
                objeto.setIdD(GerIdenDe.getID());
                 //Escreve no arquivo
                bw.write(objeto.toString()+"\n");
                //fecha o arquivo
                bw.close();
               
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Denuncia objeto) throws Exception {
         ArrayList<Denuncia> lista = listagem();
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
    public ArrayList<Denuncia> listagem() throws Exception {
         try {
            ArrayList<Denuncia> listaDeDen = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while((linha=br.readLine())!=null){
                    Denuncia objetoDen = new Denuncia();
                    String vetorString[] = linha.split(";");
                    objetoDen.setIdD(Integer.parseInt(vetorString[0]));
                    objetoDen.setDen(vetorString[1]);
                    objetoDen.setDesc(vetorString[2]);
                    objetoDen.setCat(vetorString[3]);
                    objetoDen.setRua(vetorString[4]);
                    objetoDen.setBairro(vetorString[5]);
                    objetoDen.setCep(Integer.parseInt(vetorString[6]));
                    objetoDen.setEstado(vetorString[7]);
                    objetoDen.setMunicipio(vetorString[8]);
                    objetoDen.setUrl(vetorString[9]);
                    listaDeDen.add(objetoDen);
                }
            }
         return listaDeDen;
        } catch(Exception erro){
         throw erro;
        }
        }
     @Override
    public Denuncia buscar(String desc)throws Exception{
    FileReader fr = new FileReader(nomeDoArquivoNoDisco);
    BufferedReader br = new BufferedReader(fr);
                String linha = "";
                while((linha=br.readLine())!=null){
                    Denuncia objetoDen = new Denuncia();
                    String vetorString[] = linha.split(";");
                    objetoDen.setIdD(Integer.parseInt(vetorString[0]));
                    objetoDen.setDen(vetorString[1]);
                    objetoDen.setDesc(vetorString[2]);
                    objetoDen.setCat(vetorString[3]);
                    objetoDen.setRua(vetorString[4]);
                    objetoDen.setBairro(vetorString[5]);
                    objetoDen.setCep(Integer.parseInt(vetorString[6]));
                    objetoDen.setEstado(vetorString[7]);
                    objetoDen.setMunicipio(vetorString[8]);
                    objetoDen.setUrl(vetorString[9]);
                    if(objetoDen.getDesc() == desc){
                        br.close();
                        return new Denuncia(Integer.parseInt(vetorString[0]),vetorString[1],vetorString[2],vetorString[3],vetorString[4],vetorString[5],(Integer.parseInt(vetorString[6])),vetorString[7],vetorString[8],vetorString[9]);
                        
                    }
                }
    
    return null;
    }
}

    

