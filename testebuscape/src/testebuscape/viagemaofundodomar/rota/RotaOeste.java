package testebuscape.viagemaofundodomar.rota;

import testebuscape.viagemaofundodomar.Ponto;
import testebuscape.viagemaofundodomar.Rota;
import testebuscape.viagemaofundodomar.comum.Utils;

/**
 * Direção Oeste da Navegação.
 * 
 * @author Evandro Luz
 *
 */
public class RotaOeste implements Rota {

	public Rota movimentoDireita() {
		return new RotaNorte();
	}

	public Rota movimentoEsquerda() {
		return new RotaSul();
	}

	public void mover(final Ponto ponto) {
		Utils.setNovoValorRota(ponto.getEixoX(),
				ponto.getEixoX().getValor() - 1);
	}

	@Override
	public String toString() {
		return "Oeste";
	}
}
