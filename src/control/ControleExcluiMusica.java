package control;

import model.Artista;
import model.BD;
import view.ViewCadastraArtista;
import view.ViewCadastraMusica;

public class ControleExcluiMusica {

	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleExcluiMusica(BD bd){
		this.bd = bd;
	}
	
	//Metodo para excluir artista
	public void excluirMusica() {

		
		//Metodo para remover artista
		this.bd.removerMusica();

	}
}

