package br.com.caelum.menu;

import java.util.Set;

import br.com.caelum.modelo.Jogador;
import br.com.caelum.util.LeitorDeJogadores;

public class ListarJogador implements Comando {

	private Set<Jogador> jogadores;

	@Override
	public void executar() {

		jogadores = new LeitorDeJogadores("jogador.csv").obterJogadores();
		System.out.println("Listando Jogadores");
		System.out.println(jogadores);
	}

	public Set<Jogador> getJogadores() {
		if (jogadores == null)
			executar();
		return jogadores;
	}

}
