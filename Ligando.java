package Encapsulamento;

public class Ligando {

	public static void main(String[] args) {
	
		ControleRemoto c1 = new ControleRemoto();
		
		c1.ligar();
		
		//c1.abrirMenu();
		
		c1.ligarMudo();
		
		c1.abrirMenu();

	}

}
