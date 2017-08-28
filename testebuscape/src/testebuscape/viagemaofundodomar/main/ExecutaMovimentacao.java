package testebuscape.viagemaofundodomar.main;

import java.util.Scanner;

import testebuscape.viagemaofundodomar.Submarino;

/**
 * Classe com método main para execução da navegação do submarino.
 * 
 * @author Evandro Luz
 *
 */
public class ExecutaMovimentacao {

	public static void main(final String[] args) {

		final Submarino submarino = new Submarino();

		System.out.println("Digite os comandos: ");
		final Scanner scanner = new Scanner(System.in);
		final String entradaComandos = scanner.nextLine();
		System.out.println(entradaComandos);
		System.out.println("Navegou para: ");

		final char[] comandos = entradaComandos.toCharArray();
		submarino.executarComandos(comandos);
		scanner.close();

		System.out.println(submarino.getMovimento().toString());
	}

}
