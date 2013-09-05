package br.com.caelum.menu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CadastrarJogador implements Comando {

	@Override
	public void executar() {

		System.out.println("Informe o nome do Jogador;CPF");
		Scanner sc = new Scanner(System.in);

		PrintStream arquivo = null;
		try {
			arquivo = new PrintStream(new FileOutputStream("jogador.csv", true));
			String jogador = sc.next();
			while (!jogador.equals("sair")) {

				arquivo.println(jogador);
				jogador = sc.next();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			arquivo.close();
		}

	}

}
