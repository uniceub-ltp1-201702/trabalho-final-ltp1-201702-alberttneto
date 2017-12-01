package util;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.BD;
import view.ViewCadastraArtista;
import view.ViewCadastraMusica;

public class ExcluirLinhaMusica {
	
	//Atributo
	private ViewCadastraMusica vcm;


	public ExcluirLinhaMusica(){
		
		//Instanciar  classe para cadastrar artistas
		this.vcm = new ViewCadastraMusica();
	}
	
	//Metodo para remover linha de artista
	public ArrayList<String> excluir(String Newfile){
	
		//Receber dados do artista
		vcm.obterDadosMusica();
		
		ArrayList<String> salvar = new ArrayList<>();
		
		try{
			
			FileReader fr = new FileReader(Newfile);
			BufferedReader br = new BufferedReader(fr);
			
			
			String linha = br.readLine();

			
			while(linha != null){
				
				if (!linha.equals(Integer.parseInt(this.vcm.getFaixa()) + ";" + this.vcm.getNome() + ";" + this.vcm.getArtista())) {
					salvar.add(linha);
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
