package view;

import javax.swing.JOptionPane;

public class ViewSolicitaNomeMusica {
	
	//Atributo
	private String musica;

	//Metodo get set
	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	public void obterMusica() {
		this.setMusica(JOptionPane.showInputDialog("Informe o nome da musica: "));
		if (musica==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			
		}
	}

}
