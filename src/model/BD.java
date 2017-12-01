package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;
import util.ExcluirLinhaArtista;
import util.ExcluirLinhaMusica;


public class BD {
	
	//Atributos
	private ArrayList<Artista> artistas;
	private ArrayList<Musica> musicas;
	private String fileName = "artistas.txt";
	private String fileName2 = "Musicas.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	private ExcluirLinhaArtista ela;
	private ExcluirLinhaMusica elm;

	
	
	
	
	//Metodo construtor
	public BD(){
		
	
		//Instanciar o ArrayList
		this.artistas = new ArrayList<Artista>();
		this.musicas = new ArrayList<Musica>();
		
		//Instanciar o DocumentReader
		this.dr = new DocumentReader();
		
		//Instanciar o DocumentWriter
		this.dw = new DocumentWriter();
		
		this.ela = new ExcluirLinhaArtista();
		this.elm = new ExcluirLinhaMusica();
	}
	
	/* Metodo que carrega todos os Artistas do arquivo
	 * para o ArrayList*/
	public void carregarArtista(){
		
		//Ler as linhas do arquivo
		ArrayList<String> linhas = this.dr.read(this.fileName);
		
		//Percorrer o ArrayList criando os Artistas
		for (int i = 0; i < linhas.size(); i++) {
			
			//Separa a linha em um array de String
			String[] linhaArtista = linhas.get(i).split(";");
			
			//Cria o Artista com os dados da linha
			Artista a = new Artista(linhaArtista[0], linhaArtista[1], Integer.parseInt(linhaArtista[2]));
			
			//Coloca o Artista no ArrayList
			this.artistas.add(a);
		}
		
	}
	
	//Metodo que grava artista
	public void gravarArtista(Artista a) {
		
		//Colocar o artista no ArrayList
		this.artistas.add(a);
		
		//Gravar o artista no arquivo
		this.dw.write(this.fileName, a.toLinha());
	}
	
	//Metodo que exclui artista
	public void removerArtista(){
		
		//Remover o artista do arquivo
		this.ela.excluir(this.fileName);
	}
	
	
	/* Metodo que carrega todas as Musicas do arquivo
	 * para o ArrayList*/
	public void carregarMusicas(){
		
		//Ler as linhas do arquivo
		ArrayList<String> linhas = this.dr.read(this.fileName2);
		
		//Percorrer o ArrayList criando os Artistas
		for (int i = 0; i < linhas.size(); i++) {
			
			//Separa a linha em um array de String
			String[] linhaMusicas = linhas.get(i).split(";");
			
			//Cria o Artista com os dados da linha
			Musica m = new Musica(Integer.parseInt(linhaMusicas[0]), linhaMusicas[1],linhaMusicas[2]);
			
			//Coloca o Cliente no ArrayList
			this.musicas.add(m);
		}
		
	}
	
	//Metodo para verificar se já existe artista 
	public boolean existeArtista(String CPF) {
		boolean retorna = false;
		
		//Percorrer o ArrayList
		for (int i = 0; i < this.artistas.size(); i++) {
			
			//Verificar se existe arstista com mesmo CPF
			if (this.artistas.get(i).getCPF().equals(CPF)) {
				retorna = true;
				
			}
			
		}
		return retorna;
	}
	
	//Verificar se Musica existe
	public boolean existeMusica(String faixa, String nome) {
		boolean retorna = false;
		
		//Percorrer o ArrayList
		for (int i = 0; i < this.musicas.size(); i++) {
			
			//Verificar se existe arstista com mesmo CPF
			if (this.musicas.get(i).getFaixa() == Integer.parseInt(faixa) && this.musicas.get(i).getNome().equals(nome)) {
				retorna = true;
				
			}
			
		}
		return retorna;
	}
	
	//Metodo para verificar se artista não existe
	public boolean naoExisteArtista(String artista){
		boolean resultado = false;
		
		//Percorrer ArrayList
		for (int i = 0; i < this.musicas.size(); i++) {
			
			//Veriricar se nao existe artista
			if (this.musicas.get(i).getArtista().equals(artista)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	//Metodo para verificar se musica não existe
	public boolean naoExisteMusica(String musica){
		boolean resultado = false;
		
		//Percorrer ArrayList
		for (int i = 0; i < this.musicas.size(); i++) {
			
			//Verificar se não existe musica
			if (this.musicas.get(i).getNome().equals(musica)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	//Metodo para verificar se existe musica com letra
	public boolean naoExisteLetra(String letra){
		boolean resultado = false;
		
		//Percorrer ArrayList
		for (int i = 0; i < this.musicas.size(); i++) {
			
			//Verificar se não existe letra
			if (this.musicas.get(i).getNome().contains(letra)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	//Todas as musicas de um artista
	public ArrayList<String> getMusicasPorArtista(String artista){
		ArrayList<String> resultado = new ArrayList<String>();
		
		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getArtista().equals(artista)) {
				
				resultado.add(	"Faixa: " + this.musicas.get(i).getFaixa() + "\n" +
								"Musica: " + this.musicas.get(i).getNome() + "\n" +
						"-------------------------\n");	
			}
		}
		return resultado;
	}
	
	public String getMusicaPorNome(String nome) {
		String resultado = "";
		
		
		for (int i = 0; i < this.musicas.size(); i++) {
				if (this.musicas.get(i).getNome().equals(nome)) {
					resultado = "Faixa: " + this.musicas.get(i).getFaixa() + " - " +
								"Musica: " + this.musicas.get(i).getNome() + " - " +
								"Artista: " + this.musicas.get(i).getArtista();
				}
		}
		return resultado;
	}
	
		public ArrayList<String> getMusicaPorLetra(String letra){

		ArrayList<String> resultado = new ArrayList<String>();
		String nome = " ";
		
		for (int i = 0; i < this.musicas.size(); i++) {
			nome = this.musicas.get(i).getNome();
			if (nome.contains(letra)) {
				resultado.add(nome + " - " + this.musicas.get(i).getArtista() + "\n");
					
				
			}
			
		}
		return resultado;
		
	}
	
	//Metodo que grava musica
	public void gravarMusica(Musica m){
		
		//Colocar a musica no ArrayList
		this.musicas.add(m);
		
		//Gravar a musica no arquivo
		this.dw.write(this.fileName2, m.toLinha());
	}
	
	//Metodo que exclui artista
	public void removerMusica(){
		
		//Remover o artista do arquivo
		this.elm.excluir(this.fileName2);
	}
	
	public ArrayList<Musica> getMusicas(){
		return musicas;
	}
	
	public ArrayList<Artista> getArtistas(){
		return artistas;
	}
}