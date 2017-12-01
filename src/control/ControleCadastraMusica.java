package control;

import model.BD;
import model.Musica;
import view.ViewCadastraMusica;
import view.ViewInformacaoExiste;

public class ControleCadastraMusica {

	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleCadastraMusica(BD bd){
		this.bd = bd;
	}
	
	//Metodo para obter dados do artista e gravar no BD
	public void cadastrarMusica(){
		
		//Instanciar a view
		ViewCadastraMusica vcm = new ViewCadastraMusica();
		
		//Chamar metodo para obter dados
		vcm.obterDadosMusica();
		
		//Verificar se a musica existe
		if (this.bd.existeMusica(vcm.getFaixa(), vcm.getNome())) {
			
			//Instanciar a view
			ViewInformacaoExiste vie = new ViewInformacaoExiste();
			
			//Exibir mensagem
			vie.mensagemMusicaExiste();
			
		}else {
		
		//Instanciar um objeto da classe Musica com os dados digitados
		Musica m = new Musica(Integer.parseInt(vcm.getFaixa()), vcm.getNome(), vcm.getArtista());
		
		//Guardar musica no BD
		this.bd.gravarMusica(m);
		}
	}
}