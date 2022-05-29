package com.hotmail.myoshi_12;

public class Main {

	//metodo que executa seu programa
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Daniella");
		
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
