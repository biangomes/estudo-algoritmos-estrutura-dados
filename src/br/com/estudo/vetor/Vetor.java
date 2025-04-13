package br.com.estudo.vetor;

public class Vetor {
	private String[] elementos;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}
	
	public void adiciona(String elemento) {
		for (int i = 0; i <= this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				elementos[i] = elemento;
				break;
			}
		}
	}
}
