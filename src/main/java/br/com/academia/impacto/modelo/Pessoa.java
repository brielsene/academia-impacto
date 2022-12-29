package br.com.academia.impacto.modelo;

public class Pessoa {
	private String nome;
	private int cpf;
	private int idade;
	private double altura;
	private double peso;
	private double imc;
	
	public Pessoa(String nome, int cpf, int idade, double altura, double peso) {

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getImc() {
		return imc;
	}
	
	public void calculaImc(double peso, double altura) {
		this.imc = peso/(altura*2);
	}
	
	
	

}
