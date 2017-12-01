package control;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

import model.BD;
import view.ViewPrincipal;

public class ControlePrincipal {
	
	// Atributos
	private BD bd;
	private ViewPrincipal vp;
	private ControleCadastraArtista cca;
	private ControleCadastraMusica ccm;
	private ControleExcluiArtista cea;
	private ControleExcluiMusica cem;
	private ControleMusicasPorArtista cmpa;
	private ControleMusicaPorNome cmpn;
	private ControleMusicaPorLetra cmpl;
	
	//Metodo construtor
	public ControlePrincipal(){
	
		//Instanciar objetos
		this.bd = new BD();
		this.vp = new ViewPrincipal();
		this.cca = new ControleCadastraArtista(this.bd);
		this.ccm = new ControleCadastraMusica(this.bd);
		this.cea = new ControleExcluiArtista(this.bd);
		this.cem = new ControleExcluiMusica(this.bd);
		this.cmpa = new ControleMusicasPorArtista(this.bd);
		this.cmpn = new ControleMusicaPorNome(this.bd);
		this.cmpl = new ControleMusicaPorLetra(this.bd);
		
		//Exibir janela de opções
		tratarOpcao(this.vp.getOpcao());
		
		//Carregar os artistas do arquivo
		bd.carregarArtista();
		bd.carregarMusicas();
	}


	
	//Metodo para tratar oções do usuario
	public void tratarOpcao(String opcao){
		
		this.bd.carregarArtista();
		this.bd.carregarMusicas();
		
		while (true){
			switch (opcao){
			
			case "1": this.cca.cadastrarArtista();
			break;
			
			case "2": this.ccm.cadastrarMusica();
			break;
			
			case "3": this.cea.excluirArtista();
			break;
			
			case "4": this.cem.excluirMusica();
			break;
			
			case "5": this.cmpa.mostrarMusicaPorArtista();
			break;
			
			case "6": this.cmpn.musicaPorNome();
			break;
			
			case "7":this.cmpl.motraMusicaPorLetra();
			break;
			
			case "8": JOptionPane.showMessageDialog(null, "Até logo");
			return;
			
			default: JOptionPane.showMessageDialog(null, "Favor digitar valor valido!!");
			break;
			}
			//Exibir a janela de opções
			opcao = this.vp.getOpcao();
		}
		
	}

}
