package util;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.ViewCadastraArtista;

public class ExcluirLinhaArtista {
	
	//Atributo
	private ViewCadastraArtista vca;

	public ExcluirLinhaArtista(){
		
		//Instanciar  classe para cadastrar artistas
		this.vca = new ViewCadastraArtista();
	}
	
	//Metodo para remover linha de artista
	public ArrayList<String> excluir(String Newfile){
	
		//Receber dados do artista
		vca.obterDadosArtista();
		
		ArrayList<String> salvar = new ArrayList<>();
		
		try{
			
			FileReader fr = new FileReader(Newfile);
			BufferedReader br = new BufferedReader(fr);
			
			
			String linha = br.readLine();

			
			while(linha != null){
				
				if (!linha.equals(vca.getNome() + ";" + vca.getCPF() + ";" + Integer.parseInt(vca.getIdade()))) {
					salvar.add(linha);
				}else {
					
				}
				linha = br.readLine();
			}
			
			br.close();
			fr.close();
			FileWriter fw2 = new FileWriter(Newfile, true);
			fw2.close();
			
			FileWriter fw = new FileWriter(Newfile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < salvar.size(); i++) {
				bw.write(salvar.get(i));
				bw.newLine();
				
			}
			bw.close();
			fw.close();
			
			
		}catch(IOException ex){
			
		}
		return salvar;
	}
	

}
