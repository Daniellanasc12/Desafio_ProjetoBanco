package com.hotmail.myoshi_12;
//classe abstrata com todos os m�todos abstratos
public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
