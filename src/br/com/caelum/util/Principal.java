package br.com.caelum.util;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.caelum.menu.CadastrarJogador;
import br.com.caelum.menu.Comando;
import br.com.caelum.menu.CriarCampeonato;
import br.com.caelum.menu.ListarJogador;

public class Principal {

	private static Map<String, Comando> menu = new HashMap<String, Comando>();

	static {
		menu.put("cadastrar", new CadastrarJogador());
		menu.put("listar", new ListarJogador());
		menu.put("campeonato", new CriarCampeonato());
	}

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Informe as opções de Menu: cadastrar, listar, campeonato");

		Scanner sc = null;

		try {

			sc = new Scanner(System.in);
			String opcaoEscolhida = sc.next();

			while (!opcaoEscolhida.equals("sair")) {

				menu.get(opcaoEscolhida).executar();

				System.out.println("Informe as opções de Menu: cadastrar, listar, campeonato");
				opcaoEscolhida = sc.next();
			}

		} finally {
			if (sc != null)
				sc.close();
		}

	}
}
