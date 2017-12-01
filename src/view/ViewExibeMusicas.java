package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ViewExibeMusicas {
	
	public void exibeMusicas(ArrayList<String> musicas){
		JOptionPane.showMessageDialog(null, musicas);
	}
	
	public void exibeMusicaPorNome(String musica) {
		JOptionPane.showMessageDialog(null, musica);
	}
	
	public void exibeMusicaPorLetra(ArrayList<String> music) {
		JOptionPane.showMessageDialog(null, music);
	}

}
