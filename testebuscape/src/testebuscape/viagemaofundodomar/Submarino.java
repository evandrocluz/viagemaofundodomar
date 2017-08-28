package testebuscape.viagemaofundodomar;

/**
 * Classe referente ao Submarino não tripulado
 * 
 * @author Evandro Luz
 */
public class Submarino {

	/**
	 * Movimento de navegação do submarino.
	 */
	Movimento movimento;

	/**
	 * Construtor posicionado ao Norte - Eixo X = 0, Eixo Y = 0, Eixo Z = 0.
	 */
	public Submarino() {
		movimento = new Movimento();
		movimento.inicio();
	}

	/**
	 * Executa os comandos de entrada
	 * 
	 * @param comandos
	 *            comandos definidos para a navegação
	 */
	public void executarComandos(final char[] comandos) {
		movimento.executarComando(this, comandos);
	}

	/**
	 * Obtém o movimento do submarino
	 * 
	 * @return movimento de navegação
	 */
	public Movimento getMovimento() {
		return movimento;
	}
}
