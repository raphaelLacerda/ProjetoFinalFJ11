package br.com.caelum.modelo;

public class JogadorJaExisteNoTimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JogadorJaExisteNoTimeException(String msg) {
		super(msg);
	}
}
