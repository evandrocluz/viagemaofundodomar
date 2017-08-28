package testebuscape.viagemaofundodomar.rota;

import testebuscape.viagemaofundodomar.Ponto;
import testebuscape.viagemaofundodomar.Rota;
import testebuscape.viagemaofundodomar.comum.Utils;

/**
 * Direção Sul da Navegação.
 * 
 * @author Evandro Luz
 *
 */
public class RotaSul implements Rota {

	public Rota movimentoDireita() {
		return new RotaOeste();
	}

	public Rota movimentoEsquerda() {
		return new RotaLeste();
	}

	public void mover(final Ponto ponto) {
		Utils.setNovoValorRota(ponto.getEixoY(),
				ponto.getEixoY().getValor() - 1);
	}

	@Override
	public String toString() {
		return "Sul";
	}
}
