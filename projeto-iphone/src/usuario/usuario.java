package usuario;

import iphone.iphone;

public class usuario {
	public static void main(String[] args) {
		iphone ip1 = new iphone();
		ip1.tocar();
		ip1.atender();
		ip1.exibirPagina();
		
		ip1.adicionarNovaAba();
		ip1.atualizarPagina();
		
		ip1.ligar();
		ip1.iniciarCorreioVoz();
		
		ip1.selecionarMusica();
		ip1.pausar();
	}
}
