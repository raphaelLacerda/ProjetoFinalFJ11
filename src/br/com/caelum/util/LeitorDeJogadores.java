package br.com.caelum.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.caelum.modelo.Jogador;

public class LeitorDeJogadores {

	private String nomeArquivo;

	public LeitorDeJogadores(String nomeArquivo) {

		this.nomeArquivo = nomeArquivo;

	}

	public Set<Jogador> obterJogadores() {

		Scanner scanner = null;
		Set<Jogador> jogadores = new HashSet<Jogador>();

		try {
			scanner = new Scanner(new File(this.nomeArquivo));
			while (scanner.hasNext()) {
				String[] partesDoJogador = scanner.next().split(";");
				jogadores.add(new Jogador(partesDoJogador[0], partesDoJogador[1]));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return jogadores;
	}
}
