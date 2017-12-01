package model;

public class Artista {
	
	//Atributos
	private String nome;
	private String CPF;
	private int idade;
	
	//Metodos get e set
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/* Metodo que transforma um cliente na representacao dele em linha
	   para salvar em um arquivo */
	public String toLinha(){
		return getNome() + ";" + getCPF() + ";" + getIdade();
	}

	 //Metodo construtor
	public Artista(String nome, String CPF, int idade) {
		
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Artista [nome=" + nome + ", CPF=" + CPF + ", idade=" + idade + "]";
	}
	
	
	
	

}
