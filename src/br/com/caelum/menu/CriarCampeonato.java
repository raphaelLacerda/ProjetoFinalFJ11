package br.com.caelum.menu;

import java.util.Set;

import br.com.caelum.modelo.Campeonato;
import br.com.caelum.modelo.Jogador;

public class CriarCampeonato implements Comando {

	@Override
	public void executar() {

		Campeonato campeonato = new Campeonato();
		Set<Jogador> jogadores = new ListarJogador().getJogadores();
		campeonato.sortearTimes(jogadores);
	}

}
