package com.hotmail.myoshi_12;

public class ContaPoupanca extends Conta {

	//construtor
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}
	
	//metodo
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}

}
