package com.hotmail.myoshi_12;

import java.util.List;

public class Banco {
	
	//atributos
	public String nome;
	private List<Conta> contas;
	
	//metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getConta() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
} 
