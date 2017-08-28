package testebuscape.viagemaofundodomar.rota;

import testebuscape.viagemaofundodomar.Ponto;
import testebuscape.viagemaofundodomar.Rota;
import testebuscape.viagemaofundodomar.comum.Utils;

/**
 * Direção Norte da Navegação.
 * 
 * @author Evandro Luz
 *
 */
public class RotaNorte implements Rota {

	public Rota movimentoDireita() {
		return new RotaLeste();
	}

	public Rota movimentoEsquerda() {
		return new RotaOeste();
	}

	public void mover(final Ponto ponto) {
		Utils.setNovoValorRota(ponto.getEixoY(),
				ponto.getEixoY().getValor() + 1);

	}

	@Override
	public String toString() {
		return "Norte";
	}

}
