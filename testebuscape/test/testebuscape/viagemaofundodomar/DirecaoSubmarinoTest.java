/**
 * 
 */
package testebuscape.viagemaofundodomar;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe dos cenários de testes de navegação.
 * 
 * @author Evandro Luz
 */
public class DirecaoSubmarinoTest {

	public static String COMANDO_ROTA_NORTE = "LMRDDMMUU";

	public static String COMANDO_ROTA_SUL = "RMMLMMMDDLL";

	/**
	 * Validação do cenário Norte do teste.
	 */
	@Test
	public void validacaoNorteTest() {

		final Submarino submarino = new Submarino();

		final String rotaNorte = COMANDO_ROTA_NORTE;
		final char[] comandos = rotaNorte.toCharArray();

		submarino.executarComandos(comandos);

		Assert.assertEquals(submarino.getMovimento().toString(), "-1 2 0 Norte");
	}

	/**
	 * Validação do cenário Sul do teste.
	 */
	@Test
	public void validacaoSulTest() {

		final Submarino submarino = new Submarino();

		final String rotaSul = COMANDO_ROTA_SUL;
		final char[] comandos = rotaSul.toCharArray();

		submarino.executarComandos(comandos);

		Assert.assertEquals(submarino.getMovimento().toString(), "2 3 -2 Sul");

	}

}
