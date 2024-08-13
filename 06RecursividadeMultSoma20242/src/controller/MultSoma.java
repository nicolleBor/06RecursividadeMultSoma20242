package controller;

public class MultSoma {

	public MultSoma() {
		super();
	}
	
	public int multSoma(int a, int b) {
		//Comando de parada
		if(b == 0) {
			return 0;
		} else {
			return a + multSoma(a, b-1); //Chamada da Função
		}
	}

}
