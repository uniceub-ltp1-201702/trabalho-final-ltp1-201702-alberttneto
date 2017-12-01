package view;

import javax.swing.JOptionPane;

public class ViewSolicitaLetra {
	
	//Atributo
	private String letra;
	
	//Metodo get e set
	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	//Metodo que recebeuma letra
	public void obterLetra() {
		this.letra = JOptionPane.showInputDialog("Informe uma letra: ");
		
	}

}
