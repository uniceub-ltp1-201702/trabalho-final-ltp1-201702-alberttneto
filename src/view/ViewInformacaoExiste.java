package view;

import javax.swing.JOptionPane;

public class ViewInformacaoExiste {

	//Metodo para exibir mensagem de artista existente
	public void exibirMensagemInformacaoExiste() {
		JOptionPane.showMessageDialog(null, "Artista já existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagem de que musica já existe
	public void mensagemMusicaExiste(){
		JOptionPane.showMessageDialog(null, "Musica já existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagem de artista não existe
	public void mensagemArtistaNaoExiste(){
		JOptionPane.showMessageDialog(null, "Artista não existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagem de musica não existe
	public void mensagemMusicaNaoExiste(){
		JOptionPane.showMessageDialog(null, "Musica não existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	//Metodo para exibir mensagegem de letra não existe
	public void mensagemLetraNaoExiste(){
		JOptionPane.showMessageDialog(null, "Não existe musica com essa letra!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
}
