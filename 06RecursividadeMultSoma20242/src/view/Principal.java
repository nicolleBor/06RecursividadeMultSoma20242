package view;

import controller.MultSoma;

public class Principal {

	public static void main(String[] args) {
		MultSoma mult = new MultSoma();
		int a = 3;
		int b = 4;
		int resultado = mult.multSoma(a, b);
		System.out.println(resultado);	
	}

}
