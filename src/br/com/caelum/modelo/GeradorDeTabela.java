package br.com.caelum.modelo;

import java.util.List;

public class GeradorDeTabela implements Runnable {

	private List<Time> times;

	public GeradorDeTabela(List<Time> times) {
		this.times = times;
	}

	@Override
	public void run() {

		gerarTabelaEmArquivo();
	}

	public void gerarTabelaEmArquivo() {

		System.out.println(times);
	}

}
