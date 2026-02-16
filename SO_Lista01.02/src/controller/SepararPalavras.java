package controller;

public class SepararPalavras {

	public SepararPalavras() {
		super();
	}
	
	public void Contar(String txt) {
		int qnt=0;
		
		String[] textoSeparado = txt.split(";");
		
		for(String palavra: textoSeparado) qnt++;
		
		System.out.println("Este texto tem "+qnt+" palvras separadas por ';'");
	}

}
