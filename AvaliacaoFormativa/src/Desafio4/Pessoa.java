package Desafio4;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	} 
	
	//this é uma maneira utilizada para renomear
	//um atributo, para diferenciar sua utilização dentro 
	//e fora da classe

}
