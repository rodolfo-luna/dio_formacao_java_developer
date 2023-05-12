package banco_app;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(300);
		cc.transferir(20, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.criarChavePix("99900011");
		cc.fazerPix(50);
		cc.imprimirExtrato();
		
		cc.pagarBoleto("00190500954014481606906809350314337370000001000");
		cc.imprimirExtrato();
	}

}