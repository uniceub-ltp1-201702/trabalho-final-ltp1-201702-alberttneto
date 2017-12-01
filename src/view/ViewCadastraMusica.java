package view;

import javax.swing.JOptionPane;

public class ViewCadastraMusica {

	//Atributos
	private String faixa;
	private String nome;
	private String artista;
	
	//Metodo get e set
	public String getFaixa() {
		return faixa;
	}
	public void setFaixa(String faixa) {
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
	
	//Metodo para obter dados do artista a ser inserido
	public void obterDadosMusica(){
		
		//Obter dados da musica
		this.setFaixa(JOptionPane.showInputDialog("Informe a faixa da musica: "));
		if (faixa==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			return;
	}
		this.setNome(JOptionPane.showInputDialog("Informe o nome da musica: "));
		if (nome==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			return;
		}
		this.setArtista(JOptionPane.showInputDialog("Informe o nome do artista: "));
		if (artista==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			return;
		}
	}
	
	public void obterNome(){
		this.setNome(JOptionPane.showInputDialog("Informe o nome do Musica: "));
	}
}