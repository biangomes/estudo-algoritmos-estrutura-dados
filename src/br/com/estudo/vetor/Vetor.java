package br.com.estudo.vetor;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Todas as posicoes do vetor estao ocupadas");
		}
	}
	
	public boolean adiciona_alternativa(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
}
