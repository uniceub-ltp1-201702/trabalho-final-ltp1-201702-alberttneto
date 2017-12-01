package control;

import model.Artista;
import model.BD;
import view.ViewCadastraArtista;

public class ControleExcluiArtista {

	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleExcluiArtista(BD bd){
		this.bd = bd;
	}
	
	//Metodo para excluir artista
	public void excluirArtista() {

		
		//Metodo para remover artista
		this.bd.removerArtista();

	}
}

