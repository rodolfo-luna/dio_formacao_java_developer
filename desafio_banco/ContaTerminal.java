package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Entre com o número da conta: ");
		int numero = entrada.nextInt();
		
		System.out.println("Entre com o número da agência: ");
		String agencia = entrada.next();
		
		System.out.println("Entre com o nome do cliente: ");
		String nomeCliente = entrada.next();
		
		System.out.println("Entre com o saldo da conta: ");
		double saldo = entrada.nextDouble();
		
		
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+String.valueOf(numero)+" e seu saldo "+String.valueOf(saldo)+" já está disponível para saque.");

	}

}