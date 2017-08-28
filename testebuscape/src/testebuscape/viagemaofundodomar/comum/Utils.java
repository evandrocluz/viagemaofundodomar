package testebuscape.viagemaofundodomar.comum;

import testebuscape.viagemaofundodomar.eixo.Eixo;

/**
 * Classe de métodos utilitários
 * 
 * @author Evandro Luz
 *
 */
public class Utils {

	/**
	 * Define valor para o eixo
	 * 
	 * @param eixo
	 *            objeto eixo a ser atribuido o valor
	 * @param novoValor
	 *            valor inteiro a ser atribuido ao eixo
	 */
	public static void setNovoValorRota(final Eixo eixo, final int novoValor) {
		eixo.setValor(novoValor);
	}
}
