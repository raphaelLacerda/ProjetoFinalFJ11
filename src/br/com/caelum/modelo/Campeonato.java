package br.com.caelum.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Campeonato {

	private List<Time> times = new ArrayList<Time>();

	public void sortearTimes(Set<Jogador> jogadores) {

		for (int i = 1; i <= 10; i++) {

			Time time = new Time();
			time.setNome("Time " + i);

			contratarJogadores(time, jogadores);
			times.add(time);
		}

		new Thread(new GeradorDeTabela(times)).start();

	}

	private void contratarJogadores(Time time, Set<Jogador> jogadores) {

		Iterator<Jogador> iterator = jogadores.iterator();
		while (iterator.hasNext()) {

			Jogador jogador = iterator.next();
			try {
				time.contratarJogador(jogador);
				iterator.remove();
			} catch (JogadorJaExisteNoTimeException e) {
				System.out.println(e.getMessage());
				iterator.remove();
			} catch (TimeCompletoException e) {
				break;
			}

		}

	}

}
