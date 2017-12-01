package control;

import java.util.ArrayList;

import model.BD;
import view.ViewExibeMusicas;
import view.ViewInformacaoExiste;
import view.ViewSolicitaArtista;

public class ControleMusicasPorArtista {
	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleMusicasPorArtista(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para mostrar musicas de um artista
	public void mostrarMusicaPorArtista() {
		
		//Instanciar view solicitar artista
		ViewSolicitaArtista vsa = new ViewSolicitaArtista();
		
		//Obter artistas
		vsa.obterArtista();
		
		//Guarda artista
		String artista = vsa.getArtista();
		
		if (this.bd.naoExisteArtista(artista)) {

			//Metodo musica por artista
			ArrayList<String> musicas = this.bd.getMusicasPorArtista(artista);
			
			//Instancia view para mostrar musicas
			ViewExibeMusicas vem = new ViewExibeMusicas();
			
			//Exibe musicas
			vem.exibeMusicas(musicas);
			
		}else{
		
		//Instanciar view informa
		ViewInformacaoExiste vie = new ViewInformacaoExiste();
		
		//Exibir mensagem artista não existe
		vie.mensagemArtistaNaoExiste();
		}
	}
}
