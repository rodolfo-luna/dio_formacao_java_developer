package iphone;

import apps.musica;
import apps.navegador;
import apps.telefone;

public class iphone implements musica, telefone, navegador{
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA WEB");
		
	}
	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA ABA NO NAVEGADOR");
		
	}
	public void atualizarPagina() {
		System.out.println("F5");
		
	}
	public void ligar() {
		System.out.println("LIGANDO PARA O CONTATO");
		
	}
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("OUVINDO MENSAGEM DO CORREIO DE VOZ");
		
	}
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
		
	}
	public void pausar() {
		System.out.println("MÚSICA PAUSADA");
		
	}
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
		
	}
	
}
