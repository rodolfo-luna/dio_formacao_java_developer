package banco_app;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected String chavePix;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void criarChavePix(String chave) {
		this.chavePix = chave;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	@Override
	public void fazerPix(double valor) {
		if (this.chavePix != null) {
			this.sacar(valor);
		}
		else {
			System.out.println("Cliente não tem chave pix!");
		}		
		
	}

	@Override
	public void pagarBoleto(String CodigoDeBarras) {
		String valorString = CodigoDeBarras.substring(CodigoDeBarras.length() - 10);
		Double valorDoBoleto = Double.parseDouble(valorString);
		valorDoBoleto = valorDoBoleto / 100;
		this.sacar(valorDoBoleto);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
