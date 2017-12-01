package view;

import javax.swing.JOptionPane;

public class ViewCadastraArtista {
	
	//Atributos
	private String nome;
	private String CPF;
	private String idade;
	
	//Metodo get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	//Metodo para obter dados do artista a ser inserido
	public void obterDadosArtista() {
		
		//Obter dados do artista
		this.setNome(JOptionPane.showInputDialog("Informe o nome do Artista: "));
		if (nome==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			return;
		}
		this.setCPF(JOptionPane.showInputDialog("Informe o CPF: "));
		if (CPF==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			return;
	}
		this.setIdade(JOptionPane.showInputDialog("Informe a idade do artista: "));
		if (idade==null) {
			JOptionPane.showMessageDialog(null, "Cancelando...");
			return;	
		}
	}

}