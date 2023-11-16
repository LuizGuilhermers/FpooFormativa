package Desafio5;

public class Fisica extends Pessoa {
	
	public Fisica (String nome) {
		super (nome);
	}
	
	private String cpf;
	private String rg;
	
	public Fisica(String nome, String cpf, String rg) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}



}
