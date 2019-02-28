package Objetos;

public class Pessoa {
	
	private String Nome;
	private Integer Peso;
	
	public Pessoa(String nome, Integer peso) {
		this.Nome = nome;
		this.Peso = peso;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public Integer getPeso() {
		return Peso;
	}
	
	public void setPeso(Integer peso) {
		this.Peso = peso;
	}
		
	
}
