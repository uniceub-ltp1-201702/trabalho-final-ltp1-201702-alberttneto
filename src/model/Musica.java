package model;

public class Musica {

	//Atributos
	private int faixa;
	private String nome;
	private String artista;
	
	//Metodo get e set
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	/* Metodo que transforma um cliente na representacao dele em linha
	   para salvar em um arquivo */
	public String toLinha(){
		return getFaixa() + ";" + getNome() + ";" + getArtista();
	}
	
	//Metodo construtor
	public Musica(int faixa, String nome, String artista) {
		super();
		this.faixa = faixa;
		this.nome = nome;
		this.artista = artista;
	}
	
	//Metodo toStirng
	@Override
	public String toString() {
		return "Musica faixa: " + faixa + ", nome: " + nome + ", artista: " + artista;
	}
	
	

	
	

}
