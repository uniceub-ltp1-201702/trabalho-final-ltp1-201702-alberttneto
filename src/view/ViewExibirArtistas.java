package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Artista;

public class ViewExibirArtistas {
	
	//Metodo para exibir todos os artistas
	public void exibirClientes(ArrayList<Artista> artistas) {
		
		//Instanciar String para exibição
		String todosArtistas = "";
		
		//Percorrer o ArrayList
		for (int i = 0; i < artistas.size(); i++) {
			todosArtistas = todosArtistas + artistas.get(i).toString() + "\n";
		}
		
		//Exibir todos os artistas
		JOptionPane.showMessageDialog(null, todosArtistas);
	}

}
