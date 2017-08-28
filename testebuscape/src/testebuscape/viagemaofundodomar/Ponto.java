package testebuscape.viagemaofundodomar;

import testebuscape.viagemaofundodomar.eixo.EixoX;
import testebuscape.viagemaofundodomar.eixo.EixoY;
import testebuscape.viagemaofundodomar.eixo.EixoZ;

/**
 * Definição dos eixos para navegação.
 * 
 * @author Evandro Luz
 *
 */
public class Ponto {

	/**
	 * Eixo X de navegação
	 */
	public EixoX eixoX;

	/**
	 * Eixo Y de navegação
	 */
	public EixoY eixoY;

	/**
	 * Eixo Z de navegação
	 */
	public EixoZ eixoZ;

	public Ponto() {
		eixoX = new EixoX();
		eixoY = new EixoY();
		eixoZ = new EixoZ();
	}

	public EixoX getEixoX() {
		return eixoX;
	}

	public void setEixoX(final EixoX eixoX) {
		this.eixoX = eixoX;
	}

	public EixoY getEixoY() {
		return eixoY;
	}

	public void setEixoY(final EixoY eixoY) {
		this.eixoY = eixoY;
	}

	public EixoZ getEixoZ() {
		return eixoZ;
	}

	public void setEixoZ(final EixoZ eixoZ) {
		// Verifica se o submarino encontra-se na superficie.
		if (eixoZ.getValor() > 0) {
			eixoZ.setValor(0);
			System.out.println("Está na Superficie!");
		}
		this.eixoZ.setValor(eixoZ.getValor());
	}

	@Override
	public String toString() {
		// Define um padrão para o print de saída dos valores dos eixos.
		return String.format("%d %d %d", eixoX.getValor(), eixoY.getValor(),
				eixoZ.getValor());
	}

}
