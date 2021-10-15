package br.edu.cest.provaPOO;

public class ParImpar {
	
	
	public void resultado(int valor) {
		int numero = valor%2;
		
		if(numero == 0) {
			System.out.println("numero é Par");
		}else {
			System.out.println("numero é Impar");
		}
	}
}
