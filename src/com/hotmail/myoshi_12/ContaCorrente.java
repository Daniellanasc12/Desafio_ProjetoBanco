package com.hotmail.myoshi_12;

public class ContaCorrente extends Conta {

	//construtor
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
	//metodo
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}
