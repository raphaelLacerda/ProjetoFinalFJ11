package br.com.caelum.modelo;

import java.util.HashSet;
import java.util.Set;

public class Time {

	private static final int QUANTIDADE_MAXIMA_JOGADORES_POR_TIME = 3;
	private String nome;
	private Set<Jogador> jogadores = new HashSet<Jogador>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Jogador> getJogadores() {
		return jogadores;
	}

	public void contratarJogador(Jogador jogador) {
		verificarSeTimeJaEstaCompleto();
		if (!this.jogadores.add(jogador)) {
			throw new JogadorJaExisteNoTimeException("Jogador" + jogador + "J‡ existe no time " + this);
		}
	}

	private void verificarSeTimeJaEstaCompleto() {
		if (jogadores.size() == QUANTIDADE_MAXIMA_JOGADORES_POR_TIME)
			throw new TimeCompletoException();
	}

	@Override
	public String toString() {
		return this.nome + " - Jogadores - " + jogadores;
	}
}
