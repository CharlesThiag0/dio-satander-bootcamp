package edu.banco;

public class Main {

	public static void main(String[] args) {
		Cliente vanilton = new Cliente("Vanilton");
		
		ContaCorrente contaCorrente = new ContaCorrente(vanilton);
		contaCorrente.depositar(100);
		ContaPoupanca contaPoupanca = new ContaPoupanca(vanilton);
		
		contaCorrente.transferir(50, contaPoupanca);
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
