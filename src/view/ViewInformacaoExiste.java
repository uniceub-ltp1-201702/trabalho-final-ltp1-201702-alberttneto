package view;

import javax.swing.JOptionPane;

public class ViewInformacaoExiste {

	//Metodo para exibir mensagem de artista existente
	public void exibirMensagemInformacaoExiste() {
		JOptionPane.showMessageDialog(null, "Artista j� existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagem de que musica j� existe
	public void mensagemMusicaExiste(){
		JOptionPane.showMessageDialog(null, "Musica j� existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagem de artista n�o existe
	public void mensagemArtistaNaoExiste(){
		JOptionPane.showMessageDialog(null, "Artista n�o existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagem de musica n�o existe
	public void mensagemMusicaNaoExiste(){
		JOptionPane.showMessageDialog(null, "Musica n�o existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagegem de letra n�o existe
	public void mensagemLetraNaoExiste(){
		JOptionPane.showMessageDialog(null, "N�o existe musica com essa letra!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
}
