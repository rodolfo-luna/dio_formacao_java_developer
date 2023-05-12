package banco_app;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
	
	void fazerPix(double valor);
	
	void pagarBoleto(String codigoDeBarras);
}
