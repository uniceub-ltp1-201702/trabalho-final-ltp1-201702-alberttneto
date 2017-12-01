package control;

import model.Artista;
import model.BD;
import view.ViewInformacaoExiste;
import view.ViewCadastraArtista;

public class ControleCadastraArtista {

	//Atributo
	private BD bd;

	//Metodo construtor
	public ControleCadastraArtista(BD bd) {
		this.bd = bd;
}
	
	//Metodo para obter dados do artista e gravar no BD
	public void cadastrarArtista() {
		
		//Instanciar a view
		ViewCadastraArtista vca = new ViewCadastraArtista();
		
		//Chamar metodo para obter os dados
		vca.obterDadosArtista();
		
		//Verificar se o artista já existe
		if (this.bd.existeArtista(vca.getCPF())) {
			
			//Instanciar a view
			ViewInformacaoExiste vie = new ViewInformacaoExiste();
			
			//Exibir mensagem
			vie.exibirMensagemInformacaoExiste();
		}else {
			
			//Instanciar um objeto da classe Artista com os dados digitados
			Artista a = new Artista(vca.getNome(), vca.getCPF(), Integer.parseInt(vca.getIdade()));
			
			//Guardar artista no BD
			this.bd.gravarArtista(a);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}