package control;

import java.util.ArrayList;

import model.BD;
import view.ViewExibeMusicas;
import view.ViewInformacaoExiste;
import view.ViewSolicitaLetra;

public class ControleMusicaPorLetra {
	
	//Atributo
	private BD bd;
	
	//Metodo contrutor
	public ControleMusicaPorLetra(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para mostrar musica por letra
	public void motraMusicaPorLetra() {
		
		//Instanciar view solicita letra
		ViewSolicitaLetra vsl = new ViewSolicitaLetra();
		
		//Obter letra
		vsl.obterLetra();
		
		//Gravar letra
		String letra = vsl.getLetra();
		
		if (this.bd.naoExisteLetra(letra)) {
			
			//Metodo verifica se existe letra nas musicas
			ArrayList<String> mletra = this.bd.getMusicaPorLetra(letra);
			
			//Instanciar exibe musicas
			ViewExibeMusicas vem = new ViewExibeMusicas();
			
			//Mostrar musicas que possuem a letra informada
			vem.exibeMusicaPorLetra(mletra);
		}else {
			
			//Instanciar view informa
			ViewInformacaoExiste vie = new ViewInformacaoExiste();
			
			//Exibir mensagem de que letra não existe
			vie.mensagemLetraNaoExiste();
		}

		
		
		
		
	}
	

}
