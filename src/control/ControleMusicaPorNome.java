package control;

import model.BD;
import view.ViewExibeMusicas;
import view.ViewInformacaoExiste;
import view.ViewSolicitaNomeMusica;

public class ControleMusicaPorNome {
	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleMusicaPorNome(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para mostrar musica por nome
	public void musicaPorNome() {
		
		//Instanciar view solicita nome da musica
		ViewSolicitaNomeMusica vsn = new ViewSolicitaNomeMusica();
		
		//Obter o nome da musica
		vsn.obterMusica();
		
		//Gravar nome
		String musica = vsn.getMusica();
		
		if (this.bd.naoExisteMusica(musica)) {
			
			//Instanciar exibição de musicas
			ViewExibeMusicas vem = new ViewExibeMusicas();
			
			//Exibir musicas
			vem.exibeMusicaPorNome(this.bd.getMusicaPorNome(musica));
			
		}else{
			
			//Instanciar view informação 
			ViewInformacaoExiste vie = new ViewInformacaoExiste();
			
			//Mostar mensagem musica não existe
			vie.mensagemMusicaNaoExiste();
		}

		
		
		
	}
	

}
