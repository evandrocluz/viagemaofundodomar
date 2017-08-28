package testebuscape.viagemaofundodomar.comum;

import testebuscape.viagemaofundodomar.Submarino;

/**
 * Classe de controle dos comandos de navegação.
 * 
 * @author Evandro Luz
 */
public class Comando {

	/**
	 * Enumeração dos comando definidos para navegação.
	 * 
	 * @author Evandro Luz
	 */
	public enum ComandoEnum {
		ENTRADA_D("D", 1), ENTRADA_M("M", 2), ENTRADA_L("L", 3), ENTRADA_R("R",
				4), ENTRADA_U("U", 5);

		public String comando;
		public int opcaoExecucao;

		ComandoEnum(final String comando, final int opcaoExecucao) {
			this.comando = comando;
			this.opcaoExecucao = opcaoExecucao;
		}

		private String getComando() {
			return comando;
		}

		private int getOpcaoExecucao() {
			return opcaoExecucao;
		}
	}

	/**
	 * Método de execução da navegação
	 * 
	 * @param submarino
	 *            objeto submarino a ser executado o comando
	 * @param movimento
	 *            comando do movimento
	 * @return
	 */
	public boolean executarMovimento(final Submarino submarino,
			final String movimento) {
		for (final ComandoEnum comando : ComandoEnum.values())
			if (movimento.equalsIgnoreCase(comando.getComando())) {
				executar(submarino, comando.getOpcaoExecucao());
				return true;
			}
		System.out.println("Comando: " + movimento + " inválido !");
		return false;
	}

	/**
	 * Executa o comando definido para navegação
	 * 
	 * @param submarino
	 *            objeto submarino a ser executado o comando
	 * @param opcao
	 *            opção do comando
	 */
	private void executar(final Submarino submarino, final int opcao) {
		switch (opcao) {
		case 1:
			submarino.getMovimento().descer();
			return;
		case 2:
			submarino.getMovimento().mover();
			return;
		case 3:
			submarino.getMovimento().moverEsqueda();
			return;
		case 4:
			submarino.getMovimento().moverDireita();
			return;
		case 5:
			submarino.getMovimento().subir();
			return;
		default:
			submarino.getMovimento().inicio();
			return;
		}
	}

}
