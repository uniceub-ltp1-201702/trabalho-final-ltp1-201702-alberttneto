package view;

import javax.swing.JOptionPane;

public class ViewSolicitaArtista {
	
	private String artista;

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public void obterArtista() {
		
		//Obter nome do artista
		this.setArtista(JOptionPane.showInputDialog("Informe o nome do artista: "));
		if (artista == null) {
			JOptionPane.showMessageDialog(null, "Cancelando....");
			
		}
	}
	
	

}
