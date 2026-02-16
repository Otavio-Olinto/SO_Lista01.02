package view;

import java.util.Scanner;
import controller.SepararPalavras;

public class Principal {

	public static void main(String[] args) {
		// Criando o método de leitura com o Scanner
		Scanner ler = new Scanner(System.in);
		
		// Instanciando os métodos da classe SepararPalavras
		SepararPalavras metodos = new SepararPalavras();
		
		String texto;
		
		System.out.print("Digite o texto que deseja separar: ");
		texto = ler.nextLine();
		
		metodos.Contar(texto);
		
		ler.close();

	}

}
