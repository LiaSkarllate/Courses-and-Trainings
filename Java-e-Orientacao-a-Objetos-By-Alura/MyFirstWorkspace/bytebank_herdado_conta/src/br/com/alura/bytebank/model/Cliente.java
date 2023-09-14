package br.com.alura.bytebank.model;

/**
 * Classe que representa um cliente do Bytebank.
 * 
 * @author william
 * @version 0.1
 */
public class Cliente {
	// Atributos:
	private String nome;
	private String cpf;
	private String profissao;
	
	// Getters e setters:
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}