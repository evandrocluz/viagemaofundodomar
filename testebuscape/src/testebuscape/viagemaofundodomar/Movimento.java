package testebuscape.viagemaofundodomar;

import testebuscape.viagemaofundodomar.comum.Comando;
import testebuscape.viagemaofundodomar.comum.Utils;
import testebuscape.viagemaofundodomar.rota.RotaNorte;

/**
 * Classe referente a movimentação do submarino.
 * 
 * @author Evandro Luz
 *
 */
public class Movimento {

	/**
	 * Eixos de navegação
	 */
	private final Ponto ponto = new Ponto();

	/**
	 * Rotas de navegação
	 */
	private Rota rota;
	private final Comando comando = new Comando();

	/**
	 * Inicialização da navegação Eixos 0 0 0 Norte
	 */
	public void inicio() {
		rota = new RotaNorte();
	}

	/**
	 * Comando de subida
	 */
	public void subir() {
		Utils.setNovoValorRota(ponto.getEixoZ(),
				ponto.getEixoZ().getValor() + 1);
	}

	public void descer() {
		Utils.setNovoValorRota(ponto.getEixoZ(),
				ponto.getEixoZ().getValor() - 1);
	}

	/**
	 * comando de movimentação a direita
	 */
	public void moverDireita() {
		rota = rota.movimentoDireita();
	}

	/**
	 * comando de movimentação a esquerda
	 */
	public void moverEsqueda() {
		rota = rota.movimentoEsquerda();
	}

	/**
	 * comando de movimentação
	 */
	public void mover() {
		rota.mover(ponto);
	}

	/**
	 * Execução do comando
	 * 
	 * @param submarino
	 *            objeto submarino a receber o comando
	 * @param comandos
	 *            array de comandos de navegação
	 */
	public void executarComando(final Submarino submarino, final char[] comandos) {
		for (final char cmd : comandos)
			comando.executarMovimento(submarino, String.valueOf(cmd));
	}

	@Override
	public String toString() {
		return ponto.toString() + " " + rota.toString();
	}
}
