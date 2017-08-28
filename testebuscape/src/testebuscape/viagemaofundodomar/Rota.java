package testebuscape.viagemaofundodomar;

/**
 * Interface de construção das rotas de navegação.
 * 
 * @author Evandro Luz
 *
 */
public interface Rota {

	/**
	 * Movimentação de navegação a direita
	 * 
	 * @return Rota de navegação
	 */
	Rota movimentoDireita();

	/**
	 * Movimentação de navegação a esquerda
	 * 
	 * @return Rota de navegação
	 */
	Rota movimentoEsquerda();

	/**
	 * Move o submarino conforme a definição dos valores dos eixos de navegação
	 * 
	 * @param ponto
	 *            definição dos eixos para movimentação
	 */
	void mover(Ponto ponto);

}
