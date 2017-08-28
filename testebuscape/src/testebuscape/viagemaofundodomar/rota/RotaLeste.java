package testebuscape.viagemaofundodomar.rota;

import testebuscape.viagemaofundodomar.Ponto;
import testebuscape.viagemaofundodomar.Rota;
import testebuscape.viagemaofundodomar.comum.Utils;

/**
 * Direção Leste da Navegação.
 * 
 * @author Evandro Luz
 *
 */
public class RotaLeste implements Rota {

	public Rota movimentoDireita() {
		return new RotaSul();
	}

	public Rota movimentoEsquerda() {
		return new RotaNorte();
	}

	public void mover(final Ponto ponto) {
		Utils.setNovoValorRota(ponto.getEixoX(),
				ponto.getEixoX().getValor() + 1);

	}

	@Override
	public String toString() {
		return "Leste";
	}

}
