package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	
	//Atributo
	private String opcao;
	
	// Metodo para exibir uma lista de opções
	public String getOpcao(){
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma opção:\n" + 
				"1 - Cadastrar Artista\n" +
				"2 - Cadastrar Musica\n" +	
				"3 - Excluir Artista\n" +
				"4 - Excluir Musica\n" +
				"5 - Musicas de um determinado artista\n" +
				"6 - Buscar musica\n" +
				"7 - Buscar musica por letra\n" +
				"8 - Sair");
		
		return this.opcao;
	}

}
